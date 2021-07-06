<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>

<script type="text/javascript">

  function validate()

  {

	  var email=document.getElementById("email").value;
	  

	  var pass=document.getElementById("pass").value;

	  var cpass=document.getElementById("cpass").value;
		


	  var a=0;	  

	  var age=document.getElementById("age").value;
	  
	  rdbtn=document.getElementsByName("gen")
	  for(i=0;i<rdbtn.length;i++) {
	  if(rdbtn.item(i).checked == false) {
	  a++;
	  }
	  }
	  
	  
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

	  

	  if(cpass=="")

	  {

		     document.getElementById("cpasserror").innerHTML="Please re-enter password...";

		     return false;

	 }

	  else

	 {

		     document.getElementById("passerror").innerHTML="";

	 } 

	  if(cpass != pass)

	  {

		     document.getElementById("cpasserror").innerHTML="please enter same password";

		     return false;

	 }

	  else

	 {

		     document.getElementById("passerror").innerHTML="";

	 } 
	  
	  if(a == rdbtn.length)

	  {

		     document.getElementById("generror").innerHTML="please enter gender";

		     return false;

	 }

	  else

	 {

		     document.getElementById("generror").innerHTML="";

	 } 
	  
	  
	 
	  

	  if(age=="")
	
	  {
	
		     document.getElementById("ageerror").innerHTML="Please enter age...";
	
		     return false;
	
	 }
	
	  else
	
	 {
		     document.getElementById("ageerror").innerHTML="";
	    }
	  
	  
	  if(!(/^[0-9]+$/.test(age))) 
		  {
		  
		  document.getElementById("ageerror").innerHTML="age contains only numbers";
			
		  return false;
		
		  }
		
		else
		
		{
		
		 document.getElementById("ageerror").innerHTML="";
		
		}

	
	
	if(age<1)
	
	  {
	
	  document.getElementById("ageerror").innerHTML="age should start from 1";
	
	  return false;
	
	  }
	
	else
	
	{
	
	 document.getElementById("ageerror").innerHTML="";
	
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
  background-image: url("BG3.jpg");
  background-repeat: no-repeat;
   background-size: cover;
    width: 100%;
    height: 100%;
}

</style>
<style type="text/css">
.field_set{
 border-color:#F00;
}
</style>

</head>

<body>

<div align="center">

     <fieldset class="field_set">

      <%

         String status =(String)request.getAttribute("status");

         if(status != null)

         {

        	 out.println(status);

         }

     %>

        <legend><h1>Sign up</h1></legend>

        <form onsubmit="return validate()" action="signupServlet" method="post">

              <table>

                    <tr>  

                        <td style="color:white">Email : </td>

                        <td><input type="email" id="email" name="email"></td>

                        <td><span style="color:#FFFAF0" id="emailerror">*</span></td>

                    </tr>

                     <tr>

                        <td style="color:white">Password : </td>

                        <td><input type="password" id="pass" name="pass"></td>

                        <td><span style="color:#FFFAF0" id="passerror">*</span></td>

                    </tr>  

                    <tr>

                        <td style="color:white">Confirm Password : </td>

                        <td><input type="password" id="cpass" name="cpass"></td>

                        <td><span style="color:#FFFAF0" id="cpasserror">*</span></td>

                    </tr>
                    
                      <tr>
   					<td style="color:white">Gender :</td>
                     	<td>
                   	 		<input type="radio" id="gen" value="Male" name="gen">M 
                   	 		<input type="radio" id="gen" value="Female" name="gen">F
                    	</td>
                    <td><span style="color:white" id="generror">*</span></td>
                  </tr>
                    
                 
                                    
                    <tr>

                        <td style="color:white">Age : </td>

                        <td><input type="text" id="age" name="age"></td>

                        <td><span style="color:white" id="ageerror">*</span></td>

                    </tr>                    
                    
                    
                    

                   <tr>

                    <td><input type="submit" value="register"></td>

                    </tr>

              </table>

        </form>

        <br>

        <hr>

       <p style="color:pink"> Already User?</p><a href="Login.jsp">Login</a>

      </fieldset>

 </div>

</body>

</html>