<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
	 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
<script src="scripts/app.js"></script>

</head>
<body>
<html:form action="/simpleform">
   <table>
      <tr>
          <th>Sno</th>
          <td><html:text property="sno" /></td>
     </tr>
     <tr>
          <th>Name</th>
          <td><html:text property="name" /></td>
     </tr>
     <tr>
          <th>place</th>
          <td><html:text property="place" /></td>
     </tr>
     <tr>
      <td> <html:submit styleId="save" property="method" value="store"></html:submit> </td>
      <td> <html:submit styleId="update" property="method" value="update"></html:submit> </td>
   </table>
   </html:form>
     <table class="table table-hover">
      <thead>
         <tr>
             <th>Sno</th>
             <th>Name</th>
             <th>place</th>
         </tr>
       </thead>
       <tbody>
              <c:forEach items="${people}" var="x">
                 <tr>
                     <td>${x.sno}</td>
                     <td>${x.name}</td>
                     <td>${x.place}</td>
                      <td onclick="update(${x.sno},'${x.name}','${x.place}')"><i class="fa fa-edit" aria-hidden="true"></i></td>
                     <td onclick="deletedata(${x.sno})"><i class="fa fa-trash" aria-hidden="true"></i></td>
                 </tr>
              </c:forEach>
       </tbody>
  </table>
</body>
</html>