package com.bank;

import java.io.IOException;
import java.math.BigDecimal;

import tools.jackson.databind.ObjectMapper;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyBankServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws java.io.IOException {
        if (req.getRequestURI().equalsIgnoreCase("/transaction")) {
            BigDecimal amount = BigDecimal.valueOf(Double.parseDouble(req.getParameter("amount")));
            String reference = req.getParameter("reference");

            Transaction transaction = new TransactionService().create(amount, reference);
            res.setContentType("application/json; charset=UTF-8");

            String json = new ObjectMapper().writeValueAsString(transaction);
            res.getWriter().print(json);
        } else {
            res.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        if (req.getRequestURI().equalsIgnoreCase("/")) {
            res.setContentType("text/html; charset=UTF-8");
            res.getWriter().print(
                    "<html>\n" +
                            "<body>\n" +
                            "<h1>Hello World</h1>\n" +
                            "<p>This is my very first, embedded Tomcat, HTML Page!</p>\n" +
                            "</body>\n" +
                            "</html>");
        } else if (req.getRequestURI().equalsIgnoreCase("/transaction")) {
            res.setContentType("application/json; charset=UTF-8");
            res.getWriter().print("[]");
        }
    }
}