<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>My Struts application is working</h1>
  <br/>
  old Value is :: ${oldvalue},
  <br/> 
  first value is :: ${first}
  <br/>
  
  
  Message:: <bean:write name="firstForm"  property="message"/>
  
  <br/>
  <a href="simpleform.do">Open the form page</a>
</body>
</html>