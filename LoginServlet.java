package com.course;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LoginServlet extends HttpServlet {

protected void doPost(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException {

String user = req.getParameter("username");
String pass = req.getParameter("password");

if(user.equals("student") && pass.equals("123")){
res.sendRedirect("courses.jsp");
} else {
res.getWriter().println("Invalid Login");
}

}

}
