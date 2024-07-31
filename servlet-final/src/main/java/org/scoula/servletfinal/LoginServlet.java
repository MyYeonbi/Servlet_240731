package org.scoula.servletfinal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        String userid = request.getParameter("userid");
        String password = request.getParameter("password");

        System.out.println("userid: " + userid );
        System.out.println("password: " + password);


        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>" + userid + "</p>");
        out.println("<p>" + password + "</p>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

















