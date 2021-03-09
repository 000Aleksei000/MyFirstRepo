<%@ page import="jsp.Student" %><%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 3/6/2021
  Time: 8:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MVC</title>
</head>
<body>
<jsp:useBean id="Student" class="jsp.Student" scope="request"/>
<%--<jsp:useBean id="Student" class="jsp.Student" scope="session"/>--%>
<%--<jsp:useBean id="Student" class="jsp.Student" scope="application"/>--%>
<jsp:getProperty name="Student" property="name"/>
</body>
</html>
