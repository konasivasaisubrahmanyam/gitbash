<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
table.center {
	margin-left: auto;
	margin-right: auto;
}

html, body {
	width: 100%;
}
</style>
<title>Insert title here</title>
</head>
<body>
<p align="right"><a href="simpleform.do">AdminUpdateStatus</a></p>
<h>Assigned tickets</h>
<html:form action="/assign" method="post">
	<table class="table table-hover">

		<tbody class="center">
		<h1 style="color:red" align="center">TicketHistory</h1>

			<c:forEach items="${assign}" var="x">
				<tr>
					<td style="color:blue">Ticket ID:</td>
					<td>${x.ticketid}
				</tr>
				<tr>
					<td style="blue">Subject:</td>
					<td>${x.subject}</td>					
				</tr>
				<tr>
					<td style="blue">Description:</td>
					<td>${x.description}</td>
				</tr>
				<tr>
					<td style="blue">By:</td>
					<td>${x.byusername}</td>
				</tr>
				<tr>
					<td style="blue">To:</td>
					<td>${x.toadminname}</td>
				</tr>
								<tr>
					<td style="blue">Status:</td>
					<td>${x.status}</td>
				</tr>
				<tr>
					<td style="blue">DateRaised</td>
					<td>${x.dateraised}</td>
				</tr>
				
				
			</c:forEach>

		</tbody>

	</table>
	</html:form>

	

</body>
</html>