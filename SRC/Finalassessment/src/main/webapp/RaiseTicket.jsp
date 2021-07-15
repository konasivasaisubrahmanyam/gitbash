<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
a:link {
  color: ;
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
  color: yellow;
  background-color: transparent;
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
<title>Raise the ticket</title>

</head>
<body>
<fieldset class="field_set">
<div align="center">
	<form onsubmit="return validate()" method="post">
		<table >

			<tr>

				<td style="color: black">subject :</td>

				<td><input type="text" id="subject" placeholder="subject"
					name="subject"></td>

				<td><span style="color: red" id="subjecterror">*</span></td>

			</tr>

			<tr>

				<td style="color: black">Description :</td>

				<td><input type="text" id="Description"
					placeholder="Description" name="description"></td>

				<td><span style="color: red" id="Descriptionerror">*</span></td>
			</tr>

		</table>
				<p align="center"><input type="submit" placeholder="Submit"></p>

	</form>
	</div>
</fieldset>
</body>

<script type="text/javascript">
	function validate()

	{

		var subject = document.getElementById("subject").value;

		var description = document.getElementById("Description").value;
		

		if (subject == "")

		{

			document.getElementById("subjecterror").innerHTML = "Please enter subject...";

			return false;

		}

		else

		{

			document.getElementById("subjecterror").innerHTML = "";

		}


		if (description == "")

		{

			document.getElementById("Descriptionerror").innerHTML = "Please enter Description...";

			return false;

		}

		else

		{

			document.getElementById("Descriptionerror").innerHTML = "";

		}
		
		if (subject.length<10 || subject.length>30)

		{

			document.getElementById("subjecterror").innerHTML = "subject must be 10 to 30 characters...";

			return false;

		}

		else

		{

			document.getElementById("subjecterror").innerHTML = "";

		}
		if (description.length<10 || description.length>100)

		{

			document.getElementById("Descriptionerror").innerHTML = "Description must be 10 to 100 characters...";

			return false;

		}

		else

		{

			document.getElementById("Descriptionerror").innerHTML = "";

		}
		return true;
	}
</script>
</html>