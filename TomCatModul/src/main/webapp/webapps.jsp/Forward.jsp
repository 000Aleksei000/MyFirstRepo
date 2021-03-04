<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 3/4/2021
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Forward</title>
</head>
<body>
<h2>You can't forward in another site</h2>
<jsp:forward page="/firstJSP"></jsp:forward>
<%--<%
    RequestDispatcher requestDispatcher = request.getRequestDispatcher("/firstJSP");
    requestDispatcher.forward(request, response);
%>--%>
</body>
</html>
