<%@ page import="java.util.ArrayList" %>
<%@ page import="co.edu.poli.ces3.universitas.dto.Student" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<%
  ArrayList<Student> students = new ArrayList<>();
  students.add(new Student("Andres","Perez", true, new Date(1986,10,9)));
  students.add(new Student("Maria","Santamaria", false, new Date(1980,11,1)));
  students.add(new Student("Pedro","Pedregal", true, new Date(1986,10,9)));
  students.add(new Student("Juan","test", false, new Date(1986,10,9)));
%>
<p>El total de estudiantes es: <%= students.size() %></p>

<table style="width: 100%;" border="1">
  <thead>
      <th>Nombre</th>
      <th>Apellido</th>
      <th>Casado?</th>
      <th>Fecha de Nacimiento</th>
  </thead>
  <tbody>
    <%
      for (Student x: students) {
      %>
        <tr>
          <td><%= x.getName() %></td>
          <td><%= x.getLastName() %></td>
          <td><%= x.isMarried() %></td>
          <td><%= x.getBirthDate() %></td>
        </tr>
      <% }
    %>
  </tbody>
</table>

</body>
</html>