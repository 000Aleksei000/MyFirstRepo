<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 3/3/2021
  Time: 8:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JavaCodeIn_JSP</title>
</head>
<body>
    <%--<%! int i = 5;%>    &lt;%&ndash;Declaration&ndash;%&gt;
    <%! private void doJob(){
        System.out.println("Hello");
    }%>  &lt;%&ndash;Declaration&ndash;%&gt;

    <%= "Hello world!"%>  &lt;%&ndash;Expression return string;&ndash;%&gt;
    <br>
    <%= JspHelper.minux(-5, 3)%>&lt;%&ndash;Expression return string;&ndash;%&gt;
    <br>

    <% class Student{               //Screplet
        String name;

        public String getName() {
            return name;
        }

        public void setName(String s) {
            this.name = s;
        }
    }
    %>
    <%=new Student().getName()%>--%>
    <%if(Math.random()*10>5) {%>
    <b> Hello world</b>
    <%}%>
</body>
</html>
