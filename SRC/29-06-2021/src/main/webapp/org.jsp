<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Accordion - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#accordion" ).accordion({
       collapsibe: true,
       active: false
    });
  } );
  </script>
</head>
<body>

<div id="accordion">
 <c:forEach items="${depts}" var="x">
  <h3>${x.name}</h3>
  <div>
      <h3>Employees in ${x.name} Department </h3>
      <ul>
        <c:forEach items="${x.employees}" var="y">
          <li><b> ${y.name}</b> from <i> ${y.city}</i> </li>
        </c:forEach>

      </ul>
  </div>

 </c:forEach>

  </div>


</body>
</html>