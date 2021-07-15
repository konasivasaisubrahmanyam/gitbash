<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

	<p align="right">
		<a href="adminprofile.do">Admin Profile</a>
	</p>
	<h1>Admin Home Page</h1>
	<table class="center">
	
		<tr>

			<td style="color: black">Open Tickets :</td>

			<td><a href="assign.do">AdminOpenTickets </a></td>

		</tr>
		
		<tr>

			<td style="color: black">Ticket History :</td>

			<td><a href="tickethistory.do">TicketHistory</a></td>

		</tr>
					<tr>


			<td><a href="logout.do">logout</a></td>
			

		</tr>
		</table>
</body>
</html>