<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<title>Login</title>

<script type="text/javascript">
  function validate()
  {
	  var email=document.getElementById("email").value;
	  var pass=document.getElementById("pass").value;
	  
	  if(email=="")
		  {
		     document.getElementById("emailerror").innerHTML="Please enter Email...";
		     return false;
		  }
	  else
		  {
		     document.getElementById("emailerror").innerHTML="";
		  }
	  
	  if(pass=="")
		  {
			     document.getElementById("passerror").innerHTML="Please enter password...";
			     return false;
			  }
		  else
			  {
			     document.getElementById("passerror").innerHTML="";
			  }
	  
	  if(pass.length<5 || pass.length>8)
		  {
		  document.getElementById("passerror").innerHTML="Password should be in betwwen 5  to 8 character..";
		  return false;
		  }
	  else
	  {
	     document.getElementById("passerror").innerHTML="";
	  }

	  return true;
  }

</script>
 <style>
<style>
a:link {
  color: green;
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
body {
  background-image: url("BG4.jpg");
  background-repeat: no-repeat;
   background-size: cover;
    width: 100%;
    height: 100%;
}

</style>
</head>
<body>
<div align="center">
     <fieldset>
     
     <%
         String status =(String)request.getAttribute("status");
         if(status != null)
         {
        	 out.println(status);
         }
     %>
        <legend><h1>Login</h1></legend>
        <form  onsubmit="return validate()"  action="loginServlet" method="post">
              <table>
                    <tr>
                        <td style="color:white"s>Email : </td>
                        <td><input type="email" id="email"  name="emailid"></td>
                        <td><span style="color:white" id="emailerror" >*</span></td>
                    </tr>
                    
                     <tr>
                        <td style="color:white">Password : </td>
                        <td><input type="password" id="pass" name="password"></td>
                        <td><span style="color:white" id="passerror">*</span></td>
                    </tr>
                    
                    <tr>
                    <td><input type="submit" value="login"></td>
                    </tr>
              </table>
        </form>
        <br>
        <hr>
			  <p style="color:#FFFAF0"> <a href="Registration.jsp">Sign Up</a></p>
      </fieldset>
 </div>
</body>
</html>
