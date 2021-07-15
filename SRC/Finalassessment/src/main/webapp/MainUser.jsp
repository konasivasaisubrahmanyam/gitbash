<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
body {
  background-image: url("Img1.jpg");
  background-repeat: no-repeat;
   background-size: cover;
    width: 100%;
    height: 100%;
}
table.center {
	margin-left: auto;
	margin-right: auto;
}

html, body {
	width: 100%;
}

</style>
<title>Login page</title>

</head>

<body>
<fieldset class="field_set">
	<div align="center">
		<div style="color: red"></div>
		<form  onsubmit="return verify()" method="post">
			<h3 style="color: grey" align="center">Login page</h3>
			<table>

				<tr>
					<td style="color: blue">username :</td>
					<td><input type="text" name="username" id="username" /></td>
					<td><span style="color: red" id="usernameerror">*</span></td>
				</tr>

				<tr>
					<td style="color: blue">Password :</td>
					<td><input type="password" id="password" name="password"></td>
					<td><span style="color: red" id="passworderror">*</span></td>
				</tr>

			</table>
			<p align="center"><input type="submit" value="login"></p>
					
		</form>
		 
	</div>
	</fieldset>
</body>
<script type="text/javascript">
	function verify()

	{

		var username = document.getElementById("username").value;
		localStorage.setItem("name", username);

		var password = document.getElementById("password").value;

		if (username == "")

		{

			document.getElementById("usernameerror").innerHTML = "Please enter username...";

			return false;

		}

		else

		{

			document.getElementById("usernameerror").innerHTML = "";

		}

		if (password == "")

		{

			document.getElementById("passworderror").innerHTML = "Please enter password...";

			return false;

		}

		else

		{

			document.getElementById("passworderror").innerHTML = "";

		}
		if (password.length<5 || password.length>8)

		{

			document.getElementById("passworderror").innerHTML = "Password must be 5-8 characters...";

			return false;

		}

		else

		{

			document.getElementById("passworderror").innerHTML = "";

		}

		return true;
	}
</script>
</html>