<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
      <td> <html:submit property="method" value="store"></html:submit> </td>
   </table>
   </html:form>
</body>
</html>