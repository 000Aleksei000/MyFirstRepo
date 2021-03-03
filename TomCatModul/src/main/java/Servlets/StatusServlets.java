package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/StatusServlet")
public class StatusServlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setStatus(HttpServletResponse.SC_OK);
        resp.sendRedirect("/temp");
//        resp.sendError(HttpServletResponse.SC_BAD_REQUEST,"blabalbla");

//        resp.setHeader("Refresh","1");
//        System.out.println("Hello");

//        resp.setHeader("Refresh", "5;http://google.com");
    }
}
