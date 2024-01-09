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
<body>-
 <div>
    	
    	</div>
		<div>
		<form:form method="POST" action="/SpringMVCProject/University" modelAttribute="uni" enctype="multipart/form-data">
				<table>
        			<tr>
        				<td> University Name :</td>
        				<td><form:input type="text" path="name"></form:input></td>
        			</tr>
        			<tr>
        				<td>Location : </td>
        				<td><form:input type="text" path="location"></form:input> </td>
        			</tr>
        			<tr>
        				<td ><input type="submit" value="Save"> </td>
        			</tr>
        		</table>
			</form:form>
			
		</div>
</body>
</html>