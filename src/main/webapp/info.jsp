<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 17/09/2025
  Time: 6:20 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Iinformacion</title>
    <%
        int x = 2147483647;
        float y = 2147483648f;
        double c = 2147483648.0;
        char later = '9';
        String name = "carlos";
    %>
</head>
<body>
    <h1>Informacion del estudiante</h1>
    <ol>
        <li><b>x = </b> <%= x %></li>
        <li><b>y = </b> <%= y %></li>
        <li>Nombre: <%= name %></li>
    </ol>
</body>
</html>
