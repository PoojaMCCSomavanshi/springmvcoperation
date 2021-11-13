package com.java.spring.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.spring.mvc.beans.Course;
import com.java.spring.mvc.service.CourseServiceImpl;

@Controller
@RequestMapping(value = "course/")
public class CourseController {
	static int courseId = 1;
	
	public static List<Course> courses = new ArrayList<Course>(); //newly create --> data vanish.
	

	static {
		System.out.println("Inside CourseController...");
		courses.add(new Course(courseId++,"Java","JavaEE",13289.23));
		courses.add(new Course(courseId++,"Spring","SRemarks",41289.23));
		courses.add(new Course(courseId++,"Hibernate","HRemarks",61289.23));
		courses.add(new Course(courseId++,"Angular","ARemarks",1277.23));
		courses.add(new Course(courseId++,"Python","Premarks",5689.23));
	}
	

	
	@Autowired
	public CourseServiceImpl service;
	
	@RequestMapping(value = "save/",method = RequestMethod.POST)	// add and update la
	public ModelAndView addCourse(@ModelAttribute("courseBean") Course course) {
		System.out.println("Inside Save Course --"+course);//whatever data user entered
		int crId = course.getCourseId();
		boolean recordForUpdate = false;
		String msg = "";
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("courseBean",new Course());	// course without values --> spring form - empty populate
		for (Course crs : courses) {
			if(crs.getCourseId()==crId) {	// if given id already present asel list madhe -- update
				crs.setCourseFees(course.getCourseFees());
				crs.setCourseName(course.getCourseName());
				crs.setCourseDetails(course.getCourseDetails());
				recordForUpdate = true;			// update zal ahe -- > true
				msg = "Course Successfully Updated...!";
				model.put("message",msg);
				model.put("courseList",courses);
				break;
			}
		}
		
		
		if(!recordForUpdate) {
			course.setCourseId(courseId++);
			courses.add(course);
			msg = "Course Successfully added...!";
			return new ModelAndView("addCourse", model);
		}
		
		return new ModelAndView("updateCourse", model);
		
	}

	
	//http://localhost:8082/course/add/ ---> GET
	@RequestMapping(value = "add/",method = RequestMethod.GET)
	public ModelAndView showAddCoursePage() {
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("courseBean",new Course());	// course without values --> spring form - empty populate
		return new ModelAndView("addCourse", model);
	}

	

	@RequestMapping(value = "updatepage/",method = RequestMethod.GET)
	public ModelAndView updateCoursePage() {
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("courseList",courses);
		model.put("flag",false);
		return new ModelAndView("updateCourse", model);
	}

	

	@RequestMapping(value = "update/",method = RequestMethod.GET)
	public ModelAndView updateCourse() {
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("courseList",courses);
		model.put("flag",false);
		return new ModelAndView("updateCourse", model);
	}


	@RequestMapping(value = "update/{bid}",method = RequestMethod.GET)
	public ModelAndView updateSpecificCourse(@PathVariable("bid") int bookId) {
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("courseList",courses);
		for (Course course : courses) {
			if(course.getCourseId()==bookId) {
				model.put("courseBean",course);
				model.put("flag",true);
			}
		}
		return new ModelAndView("updateCourse", model); //List + Filled Bean [jyachya vr edit click]
	}

	
	
	@RequestMapping(value = "all/",method = RequestMethod.GET)
	public ModelAndView getAllCourses() {
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("courseList",courses);
		return new ModelAndView("showCourses", model);
	}
	
	// search page show karnysathi
	@RequestMapping(value = "searchpage/",method = RequestMethod.GET)
	public ModelAndView searchCoursePage() {
		HashMap<String,Object> model = new HashMap<String, Object>(); //hashmap
		return new ModelAndView("searchCourse",model);
	}
	
	//actual data fetch
	@RequestMapping(value = "search/",method = RequestMethod.GET)
	public ModelAndView searchCourse(@RequestParam("courseId") int courseId) {
		System.out.println("Iinside SearchCOurse Method"+courseId);
		HashMap<String,Object> model = new HashMap<String, Object>(); //hashmap
		for (Course course : courses) {
			if(course.getCourseId()==courseId) {
				model.put("courseBean",course);				//hash
			}
		}
		if(model.size()==0) {
			model.put("message",String.format("No Course Found with given %d",courseId));
		}
		return new ModelAndView("searchCourse",model);
	}
	
	// delete page show karnysathi
		@RequestMapping(value = "deletepage/",method = RequestMethod.GET)
		public ModelAndView deleteCoursePage() {
			HashMap<String,Object> model = new HashMap<String, Object>();
			model.put("courseList",courses);
			return new ModelAndView("deleteCourse",model);
		}
		
		//actual data fetch
		@RequestMapping(value = "delete/{courseId}",method = RequestMethod.GET)
		public ModelAndView deleteCourse(@PathVariable("courseId") int courseId) {
			System.out.println("Iinside SearchCOurse Method"+courseId);
			HashMap<String,Object> model = new HashMap<String, Object>(); //hashmap
			for (Course course : courses) {
				if(course.getCourseId()==courseId) {
					courses.remove(course);
					model.put("message",String.format("Course Deleted Successfully....",courseId));
					break;
				}
			}
			model.put("courseList",courses);
			return new ModelAndView("deleteCourse",model);
		}

}
