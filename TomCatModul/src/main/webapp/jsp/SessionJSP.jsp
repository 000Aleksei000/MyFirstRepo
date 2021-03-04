<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 3/4/2021
  Time: 7:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Session</title>
</head>
<body>
<%
    HttpSession session1 = request.getSession();
    Integer count = (Integer) session1.getAttribute("count");
    if (count == null) {
        session1.setAttribute("count", 1);
    } else {
        session1.setAttribute("count", ++count);
    }
%>
<h1><%="Вы посещали эту страницу : " + session1.getAttribute("count")%></h1>
</body>
</html>
