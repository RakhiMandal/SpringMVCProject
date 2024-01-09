<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div>
    	
    	</div>
		<div>
		<form:form method="POST" action="/SpringMVCProject/trainer" modelAttribute="trainer">
				<table>
        		
        			<tr>
        				<td>Trainer name : </td>
        				<td><form:input type="text" path="name"></form:input> </td>
        			</tr>
        				<tr>
        				<td>Trainer subject : </td>
        				<td><form:input type="text" path="subject"></form:input> </td>
        			</tr>
        				<tr>
        				<td>Trainer salary : </td>
        				<td><form:input type="text" path="salary"></form:input> </td>
        			</tr>
        			<tr>
        				<td ><input type="submit" value="Save"> </td>
        			</tr>
        		</table>
			</form:form>
			
		</div>
</body>
</html>