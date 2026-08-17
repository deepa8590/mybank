package com.bank;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyBankServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws java.io.IOException {
    res.setContentType("text/html; charset=UTF-8");
    res.getWriter().print(
        "<html>\n" +
                "<body>\n" +
                "<h1>Hello World</h1>\n" +
                "<p>This is my very first, embedded Tomcat, HTML Page!</p>\n" +
                "</body>\n" +
                "</html>"); 
    }
}