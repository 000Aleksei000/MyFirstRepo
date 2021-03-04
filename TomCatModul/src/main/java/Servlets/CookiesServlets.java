package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Cookie")
public class CookiesServlets extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName());
            System.out.println(cookie.getValue());
        }
        Cookie cookie = new Cookie("TestCookie", "abc");
        cookie.setPath("/Cookie");    //Cookie set and visible only this domain
//        cookie.setSecure(true);   //Cookie visible only for https connection
        resp.addCookie(cookie );
  //      cookie.setMaxAge(); //Time after cookie will delete;Time in second
    }
}
