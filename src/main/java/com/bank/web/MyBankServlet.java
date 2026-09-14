package com.bank.web;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bank.context.BankApplicationConfiguration;
import com.bank.model.Transaction;
import com.bank.service.TransactionService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tools.jackson.databind.ObjectMapper;

public class MyBankServlet extends HttpServlet {
    
    private TransactionService transactionService;
    private ObjectMapper objectMapper;

    public void init() throws ServletException {
        // Initialization code if needed
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BankApplicationConfiguration.class);  
        this.transactionService = context.getBean(TransactionService.class);
        this.objectMapper = context.getBean(ObjectMapper.class);

    }
    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws java.io.IOException {
        if (req.getRequestURI().equalsIgnoreCase("/transaction")) {
            BigDecimal amount = BigDecimal.valueOf(Double.parseDouble(req.getParameter("amount")));
            String reference = req.getParameter("reference");

            Transaction transaction = transactionService.create(amount, reference);
            res.setContentType("application/json; charset=UTF-8");

            String json = objectMapper.writeValueAsString(transaction);
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
            List<Transaction> transactions = transactionService.findAll();
            res.getWriter().print(objectMapper.writeValueAsString(transactions));
        }
    }
}