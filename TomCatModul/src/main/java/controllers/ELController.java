package controllers;

import jsp.Model;
import jsp.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet("/ELController")
public class ELController extends HttpServlet {
    Model model = new Model();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = model.getStudent();
        req.setAttribute("stud", student);

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        req.setAttribute("list", list);

        Map<String, String> map = new TreeMap<>();
        map.put("One", "1");
        map.put("Two", "2");
        req.setAttribute("map", map);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("webapps.jsp/EL_View.jsp");
        requestDispatcher.forward(req,resp);
    }
}
