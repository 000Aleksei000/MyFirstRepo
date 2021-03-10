package Servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class InitParamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> parameterNames = this.getServletConfig().getInitParameterNames();
        resp.getWriter().write("<html>");
        while (parameterNames.hasMoreElements()){
            String s = parameterNames.nextElement();
            resp.getWriter().write(s + " = " + this.getServletConfig().getInitParameter(s));
            resp.getWriter().write("<br>");
        }
        resp.getWriter().write("</html>");
    }
}
