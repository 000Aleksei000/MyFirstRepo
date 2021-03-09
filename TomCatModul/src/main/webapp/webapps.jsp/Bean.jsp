<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 3/4/2021
  Time: 11:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bean</title>
</head>
<body>
<jsp:useBean id="Person" class="jsp.Student"/>
<jsp:setProperty name="Person" property="name" value="Tom"/>
<jsp:getProperty name="Person" property="name"/>
</body>
</html>
