package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/ParamServlet")
public class ParametersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String s = req.getParameter("one");
//        String s1 = req.getParameter("two");

//        String[] strings = req.getParameterValues("one");
//        for(String s : strings){
//            System.out.println(s);
//        }

//        Enumeration<String> parameterNames =req.getParameterNames();
//        while (parameterNames.hasMoreElements()){
//            System.out.println(parameterNames.nextElement());
//        }

//        Map<String, String[]> parameterMap = req.getParameterMap();
//        for (Map.Entry<String, String[]> twice : parameterMap.entrySet()){
//            System.out.println(twice.getKey() + Arrays.toString(twice.getValue()));
//        }

        String one = req.getParameter("one");
        String two = req.getParameter("two");
        String post = "<html>" + "<head>" +
                "</head>" +
                "<body>" +
                "Login = " + " " +
                "            Password = "  +
                "<form action = 'ParamServlet' method = 'post'>" +
                "<input type = 'text' name = 'one'/>" +
                "<input type = 'text' name = 'two'/>" +
                "<input type = 'submit' name = 'Submit'/>" +
                "</form>" +
                "</body>"+
                "</html>";

        resp.getWriter().write(post);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        for(Map.Entry<String, String[]> twice : req.getParameterMap().entrySet()){
            System.out.println(twice.getKey() + " = " + Arrays.toString(twice.getValue()));
        }
    }
}
