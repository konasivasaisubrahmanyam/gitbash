<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <form >
        <h3></i> logged out successfully!</h3>
        <h3><a href="login.do">Loginpage</a></h3>
    </form>
    
    <script type="text/javascript">
		var username=localStorage.getItem("name");
		alert(username+" you have logged out successfully");
	</script>
	
</body>
</html>