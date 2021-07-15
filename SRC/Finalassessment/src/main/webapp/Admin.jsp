<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Ticket History</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<h1 align="center">Admin ticket History</h1>
<table class="table table-dark">

		<thead class="thead-light">
			<tr>
				<th>Sno</th>
				<th>Ticket Id</th>			
				<th>Message</th>
				<th>Time Stamp</th>	
				
			</tr>
		</thead>

		<tbody>

			<c:forEach items="${details}" var="x">
				<tr>
					<td>${x.sno}</td>
					<td>${x.ticketid}</td>
					<td>${x.message}</td>
					<td>${x.timestamp}</td>
					
				</tr>
			</c:forEach>

		</tbody>

	</table>	
</body>
</html>