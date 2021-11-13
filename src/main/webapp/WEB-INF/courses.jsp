<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Courses</title>
</head>
<body>

<form:form action="/inquiries/student/save/" method="post" modelAttribute="studBean">
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
            
            
   </table>
 </form:form>
   
   
</body>
</html>