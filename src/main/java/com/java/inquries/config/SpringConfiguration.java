package com.java.inquries.config;

import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@EnableWebMvc //this tell ---> this is not a normal application but webapp.
@Configuration		
@PropertySource("classpath:database.properties")
@ComponentScan(basePackages = "com.java.inquries.*")
public class SpringConfiguration implements WebMvcConfigurer{

	
	@Autowired		
	Environment env;
	
	
	static {
		System.out.println("SpringConfiguration loaded..");
	}
	
	
	@Bean("ds")		//method level annotations-->to create bean
	public BasicDataSource dataSourceConfig() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl(env.getProperty("hibernate.connection.url"));
		dataSource.setUsername(env.getProperty("hibernate.connection.username"));
		dataSource.setPassword(env.getProperty("hibernate.connection.password"));
		dataSource.setDriverClassName(env.getProperty("hibernate.connection.driver_class"));
		return dataSource;
		
	}
	
	@Bean("localSFactory")
	public LocalSessionFactoryBean localSessionFactory() {
		LocalSessionFactoryBean lbean = new LocalSessionFactoryBean();
		//lbean.setAnnotatedClasses(Product.class);
		lbean.setPackagesToScan("com.java.inquries.entities");
		lbean.setHibernateProperties(configORMProperties());
		lbean.setDataSource(dataSourceConfig());
		return lbean;
	}
	
	
	public Properties configORMProperties() {
		Properties props = new Properties();
		props.put(org.hibernate.cfg.Environment.DIALECT, env.getProperty("hibernate.dialect"));
		props.put(org.hibernate.cfg.Environment.SHOW_SQL, true);
		props.put(org.hibernate.cfg.Environment.HBM2DDL_AUTO, env.getProperty("hibernate.hbm2ddl.auto"));
		return props;
	}

	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/");		//JSP pages --> java server pages --> front end --> 
		viewResolver.setSuffix(".jsp");		// MVC --> Model View Controller
		return viewResolver;
	}
	 
	 @Override
	 public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
	   configurer.enable();
	 }
	 
/*	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		StudentController controller = (StudentController) context.getBean("stud_controller");
		StudentServiceImpl service = controller.service;
		StudentDaoImpl dao = service.dao;
		SessionFactory sfactory = dao.sfactory;
		
		System.out.println("Controller Hashcode -->" +controller.hashCode());
		System.out.println("Sessionfactory -->"+sfactory.hashCode());
	}*/
}
