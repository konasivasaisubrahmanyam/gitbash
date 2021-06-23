<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP File</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" >
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" ></script>
</head>

<body>
<form action="author.do" method="post">

<div align="center">




<div style="width:500px;height:100;background-color:powderblue;">
 
<p><b><h1>Lets Be Creative!</h1></b></p>

</div>

<div style="width:500px;height:200px;background-color:#e3faf9;">

   <table>
       <tr>
          <th>Bookid</th>
          <td><input type="text" name="bookid"></td>
        </tr>
        <tr>
          <th>BookName</th>
          <td><input type="text" name="name"></td>
        </tr>
       <tr>
          <th>Price</th>
          <td><input type="text" name="price"></td>
          <td>
        </tr>
        <tr>
        <th>Authorid</th>
        <td>
		<select name="authorid">
		<c:forEach items="${Authorlist}" var="x">
		  <option value="${x.authorid}">${x.name }</option>
		</c:forEach>
	    </select>
	    </td>
        </tr>
         <tr>
          <th>Pages</th>
          <td><input type="text" name="pages"></td>
        </tr>
          
        <tr>
          <td><input type="submit" value="Submit" class="btn btn-warning"></td>
        </tr>
    
   </table>
  </div>
  <div style="width:500px;height:100;background-color:yellow;">
  <p><b><h1>Registered Book details </h1></b></p>
    
   <table class="table table-bordered">
      <thead>
           <tr>
                <th>BookID</th>
                <th>BookName</th>
                <th>Price</th>
                <th>Authorid</th>
                <th>Pages</th>
                <th></th>
            </tr>
      </thead>
       
     
       <tbody>
    
     <c:forEach items="${Authorlist}" var="x">
       <tr>
                <td> ${x.bookid} </td>
                <td> ${x.name} </td>
                <td> ${x.price}</td>
                <td> ${x.authorid}</td>
                <td> ${x.pages}</td>
                
       </tr>
       </c:forEach>
   </tbody>
   
   </table>
     
   
   
 
  
   


   

</div>
</form>
</body>
</html>