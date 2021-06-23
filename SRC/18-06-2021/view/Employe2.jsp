<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ include file="head.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" >
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" ></script>
</head>

<body>
<div class="alert alert-info">
   <h3>Number of requests made in this session ::${sessionScope.count}</h3>
   <h3>Number of requests made since server start ::${applicationScope.count}</h3>
</div>
<div align="center">
<form action="Employe.do" method="post">
<div style="width:500px;height:100;background-color:powderblue;"> 
<p><b><h1>Lets Be Creative!</h1></b></p>
</div>
<div style="width:500px;height:200px;background-color:#e3faf9;">

   <table>
       <tr>
          <th>Sno</th>
          <td><input type="text" name="sno"></td>
        </tr>
        <tr>
          <th>Name</th>
          <td><input type="text" name="name"></td>
        </tr>
       <tr>
          <th>Place</th>
          <td><input type="text" name="place"></td>
        </tr>
        <tr>
          <td><input type="submit" value="Employe bin with Employe data" class="btn btn-warning"></td>
        </tr>
    
   </table>
  </div>
  <div style="width:500px;height:100;background-color:yellow;">
  <p><b><h1>Registered employee details </h1></b></p>
    
   <table class="table table-bordered">
      <thead>
           <tr>
                <th>Sno</th>
                <th>Name</th>
                <th>Place</th>
            </tr>
      </thead>
     
       <tbody>
    
     <c:forEach items="${Employelist}" var="x">
       <tr>
                <td> ${x.sno} </td>
                <td> ${x.name} </td>
                <td> ${x.place}</td>
       </tr>
       </c:forEach>
   </tbody>
   
   </table>
   
   
</form>
   

</div>

</body>


</body>
</html>