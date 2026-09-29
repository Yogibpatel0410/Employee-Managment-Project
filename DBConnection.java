package com.companyZ.employeeapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/employeeData";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password_here"; // <-- CHANGE THIS

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("❌ Database connection failed: " + e.getMessage());
            return null;
        }
    }
}
