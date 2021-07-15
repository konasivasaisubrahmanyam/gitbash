<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
a:link {
  color:;
  background-color: transparent;
  text-decoration: none;
}

a:visited {
  color: pink;
  background-color: transparent;
  text-decoration: none;
}

a:hover {
  color: red;
  background-color: transparent;
  text-decoration: underline;
}

a:active {
  color: yellow;ound-color: transparent;
  text-decoration: underline;
}
  
table.center {
	margin-left: auto;
	margin-right: auto;
}

html, body {
	width: 100%;
}

body {
	background-image: url("Img4.jpg");
	background-repeat: no-repeat;
	background-size: cover;
	width: 100%;
	height: 100%;
}
</style>
<title>Insert title here</title>
</head>

	<body>
	<fieldset class="field_set">
	<div align="center">
		<h2 align="center" style="color: pink">UserHomePage</h2>
		<p align="right">
			<a href="profile.do">UserProfile</a>
		</p>
		<table  class="center">

			<tr>

				<td style="color: white">Raise a Ticket :</td>

				<td><a href="ticket.do">Raise a Ticket</a></td>

			</tr>

			<tr>

				<td style="color: white">Ticket History :</td>

				<td><a href="TicketHistory.jsp">Ticket History</a></td>

			</tr>


			<tr>

				<td style="color: white">Open Ticket :</td>

				<td><a href="status.do">Open Ticket</a></td>

			</tr>

		</table>
		<p>
			<a href="logout.do">Logout</a>
		</p>
		</div>
		</fieldset>
	</body>

</html>