<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"></script>
</head>
<body>
<html:form action="/adminprofile" method="post">
	<table class="table table-hover">

		<thead>
			<tr>
				<th> AdminName</th>
				<th>Password</th>
				<th>Address</th>
				<th>Mobile Number</th>
				<th>Email</th>
			</tr>
		</thead>

		<tbody>

			<c:forEach items="${profile}" var="x">
				<tr>
					<td>${x.username}</td>
					<td>${x.password}</td>
					<td>${x.address}</td>
					<td>${x.mobile}</td>
					<td>${x.email}</td>
				</tr>
			</c:forEach>

		</tbody>

	</table>
	</html:form>
 
</body>
</html>