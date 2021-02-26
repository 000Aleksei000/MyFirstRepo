package Servlets;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/ServletLiveCycle")
public class ServletLiveCycle extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("initialisation!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String s = "1.Method init(){}  execute once!\n2.Method service(){\nif(req.getMethod.equals(\"GET\"))\n}\n3.Method doGet() " +
                "or doPost or .... \n4.Method destroy() execute after closed program.";
        resp.getWriter().write(s);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("it is doPost");
        resp.getWriter().write("It's doPost");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("it is Service method");
        super.service(req, res);
    }

    @Override
    public void destroy() {
        System.out.println("destroy method");
        super.destroy();
    }
}
