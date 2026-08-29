package com.bank;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;

import com.bank.web.MyBankServlet;

public class BankApplicationLauncher {
    public static void main(String[] args) throws LifecycleException{

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8082);
        tomcat.getConnector();

        Context ctx = tomcat.addContext("", null);
        Wrapper servlet = Tomcat.addServlet(ctx, "MyBankServlet", new MyBankServlet());
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/*");

        tomcat.start();
    }
}
