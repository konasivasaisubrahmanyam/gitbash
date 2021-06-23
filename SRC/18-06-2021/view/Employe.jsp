<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import ="java.util.*,com.model.Employe"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" >
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" ></script>
</head>
<body>
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
   
   <%
       List<Employe> list=(List<Employe>) request.getAttribute("Employelist");
       for(Employe x:list)
       {
   %>
      <tr>
       <td> <%=x.getSno()%></td>
       <td> <%=x.getName()%></td>
       <td> <%=x.getPlace()%></td>
       </tr>
       <%} %>
   </tbody>
   
   </table>
   
   
</form>
   

</div>

</body>
</html>