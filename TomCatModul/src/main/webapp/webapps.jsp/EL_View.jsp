<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 3/9/2021
  Time: 8:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL_View</title>
</head>
<body>
${stud.age}
${stud["name"]}

${requestScope.stud.name}
${sessionScope.stud.name}
${applicationScope.stud.name}
<br>
<br>
${list[1]}
<br>
<br>
${map["One"]}
${map.Two}
<br>
<br>
${1+2*3/2}
<br><br>
${map.Two==2}<br><br>
${map.One > 7} <br><br>
${map.Two != 1 ? "2 != 1" : "2 == 1"}<br><br>
\${1, 2, 3}<br><br>
${cookie.JSESSIONID}<br><br>
${header}<br><br>
</body>
</html>
