package Servlets;

import jsp.Model;
import jsp.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/controller", name = "MVC", displayName = "MVC ")
public class Controller extends HttpServlet {
        Model model = new Model();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = model.getStudent();
        req.setAttribute("Student", student);
//        req.getSession().setAttribute("Student", student);
//        req.getServletContext().setAttribute("Student", student);
        req.getRequestDispatcher("/webapps.jsp/View.jsp").forward(req,resp);
    }
}
