package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class JDBC_Conn {

    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "root";
        
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con = DriverManager.getConnection(url, username, password);
        	System.out.println("Connected to database");
        	con.close();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
