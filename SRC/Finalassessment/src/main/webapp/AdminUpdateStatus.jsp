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

</head>
<body>
<html:form action="/simpleform">
   <table>
      <tr>
          <th>TicketId</th>
          <td><html:text property="ticketid" /></td>
     </tr>
     <tr>
          <th>ByUsername</th>
          <td><html:text property="byusername" /></td>
     </tr>
     <tr>
          <th>status</th>
          <td><html:text property="status" /></td>
     </tr>

     
     <tr>
      <td> <html:submit styleId="save" property="method" value="store"></html:submit> </td>
      <td> <html:submit styleId="update" property="method" value="update"></html:submit> </td>
   </table>
   </html:form>
     <table class="table table-hover">
      <thead>
         <tr>
             <th>TicketId</th>
             <th>ByUsername</th>
             <th>status</th>
         </tr>
       </thead>
       <tbody>
              <c:forEach items="${people}" var="x">
                 <tr>
                     <td>${x.ticketid}</td>
                     <td>${x.byusername}</td>
                     <td>${x.status}</td>
                     <td>${x.toadminname}</td>
                     <td>${x.subject}</td>
                     <td>${x.description}</td>
           			 <td>${x.dateraised}</td>
          
                     
                      <td onclick="update(${x.ticketid},'${x.toadminname}','${x.byusername}','${x.subject}','${x.description}','${x.status}','${x.dateraised}')"><i class="fa fa-edit" aria-hidden="true"></i></td>
                  
                 </tr>
              </c:forEach>
       </tbody>
  </table>
  <script src="scripts/app.js"></script>
</body>
</html>