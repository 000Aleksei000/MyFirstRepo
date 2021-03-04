<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>My first page for training</title>
</head>
<body>
<h1 align="center" style="color: #ff2418"><%= "Hello World!" %>
</h1>
<br/>
<h2 align="center" >1.This is description and work Servlets</h2>
<br/>
<p align="center">
    <a href="hello-servlet">Hello Servlet</a>
<br/>
<br/>
<a href="go">GogoGO</a>
    <br/>
    <br/>
    <a href="ServletLiveCycle">Servlet live cycle</a>
    <br/>
    <br/>
    <a href="ParamServlet">Servlet with Get and Post Method</a>
    <br>
    <br>
    <a href="HeaderServlet">Header Servlet</a>
    <br>
    <br>
    <a href="GzipServlet">Gzip Servlet But he don't work</a>
    <br>
    <br>
    <a href="StatusServlet">Status Servlet</a>
    <br>
    <br>
    <a href="Cookie">Cookie</a>
    <br>
    <br>
    <a href="Session">Session Servlet</a>
    <br>
    <br>
    <a href="/synchServlet">Synch Servlet</a>
    <br>
    <br>
    <a href="/Async">Async Servlet</a>
</p>
<br/>
<br/>
<br/>
<p align="center">
    <a href="/temp">Temp Servlet</a>
</p>
<h2 align="center">2.This is description and work JSP</h2>
<p align="center">
    <a href="${pageContext.request.contextPath}/firstJSP">First Jsp</a>
    <br>
    <br>
    <a href="jsp/JavaCodeIn_JSP.jsp">Java code in JSP</a>
    <br>
    <br>
    <a href="jsp/JavaEdit.jsp">Java Edit</a>
    <br>
    <br>
    <a href="jsp/PredefinedVariables.jsp">Predefined Variables</a>
    <br>
    <br>
    <a href="jsp/IncludeDirective.jsp">Include Directive</a>
    <br>
    <br>
    <a href="jsp/Redirect.jsp">Redirect</a>
    <br>
    <br>
    <a href="${pageContext.request.contextPath}/forward">Forward</a>
    <br>
    <br>
    <a href="jsp/SessionJSP.jsp">Session JSP</a>
    <br>
    <br>
</p>
</body>
</html>