<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored = "false" %>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Page</title>
</head>
<body>
		<center>
		<h2>Student Registration Page ...</h2> 
		</center>
	<c:out value="${result}"></c:out>  <br><br><br>
	
<form:form  action="/inquiries/student/save" method="post" modelAttribute="sbean">
         <table>
         
            <tr>
               <td><form:label path = "studId">Student Id : </form:label></td>
               <td><form:input path = "studId" /></td>
            </tr>
         
         
          <tr>
               <td><form:label path = "studFirstName">Student FirstName : </form:label></td>
               <td><form:input path = "studFirstName" /></td>
            </tr>
            
            
             <tr>
               <td><form:label path = "studLastName">Student LastName : </form:label></td>
               <td><form:input path = "studLastName" /></td>
            </tr>
            
            
             <tr>
               <td><form:label path = "studPassYear">Student PassingYear : </form:label></td>
               <td><form:input path = "studPassYear" /></td>
            </tr>
            
            
             <tr>
               <td><form:label path = "genderType">Student GenderType : </form:label></td>
               <td><form:input path = "genderType" /></td>
            </tr>
            
             <tr>
               <td><form:label path = "studEmail">Student Email : </form:label></td>
               <td><form:input path = "studEmail" /></td>
            </tr>
            
             <tr>
               <td><form:label path = "mobileNumber">Student Contact : </form:label></td>
               <td><form:input path = "mobileNumber" /></td>
            </tr>
           
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>


<c:if test="${slist.size() == 0}">
	<h2>No Student Records</h2>
</c:if>

<c:if test="${slist.size() > 0}">

<table border="1">
		<thead>
				<th>Student Id</th>
				<th>Student FullName</th>
				<th>Student Email</th>
				<th>Student Mobile</th>
				<th>Student Gender</th>
				<th>Student PassingYear</th>
				<th>Action </th>
		</thead>
		
		<tbody>
			<c:forEach items="${slist}" var="stud">
				<tr>
					<td><c:out value="${stud.studId}" /></td>
					<td><c:out value="${stud.studFirstName}" /> &nbsp;&nbsp; <c:out value="${stud.studLastName}" /> </td>
					<td><c:out value="${stud.studEmail}" /></td>
					<td><c:out value="${stud.mobileNumber}" /></td>
					<td><c:out value="${stud.genderType}" /></td>
					<td><c:out value="${stud.studPassYear}" /></td>
					<td>
							<a href="/inquiries/student/edit/<c:out value="${stud.studId}" />">EDIT</a>
							<a href="/inquiries/student/delete/<c:out value="${stud.studId}" />">DELETE</a>
					</td>					
				
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
	
</c:if>


	



</body>
</html>