package com.hung.daos.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Config {
    public static Connection connection;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbclpm?autoReconnect=true&useSSL=false",
                    "root", "hung123");

        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }


}
