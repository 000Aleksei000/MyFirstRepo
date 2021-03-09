package Servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/contextReadServlet")
public class ContextReadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = req.getServletContext();
        Enumeration<String> attributeNames = servletContext.getAttributeNames();
        resp.getWriter().write("<html>");
        while (attributeNames.hasMoreElements()) {
            String s = attributeNames.nextElement();
            resp.getWriter().write(s + " = " + servletContext.getAttribute(s));
            resp.getWriter().write("<br>");
            resp.getWriter().write("<br>");
        }
        resp.getWriter().write("</html>");
    }
}
