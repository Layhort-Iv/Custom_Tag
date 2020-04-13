package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;


public class MyJDBCTag extends TagSupport{
    private String driver, url, dbUsername, dbPassword, user, age;

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            
            JspWriter out = pageContext.getOut();
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url);
            PreparedStatement prep = con.prepareStatement("insert into student values(?,?)");
            
            prep.setString(1, user);
            prep.setString(2, age);
            
            prep.execute();
            
            out.println("Registered Success ...");
        } catch (Exception e) {}
        return super.doStartTag(); 
    }

    @Override
    public int doEndTag() throws JspException {
        return super.doEndTag(); 
    }
}
