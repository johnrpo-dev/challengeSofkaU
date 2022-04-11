package com.sofkaU.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private static String url = "jdbc:mysql://localhost:3306/challenge";
    private static String username = "root";
    private static String password= "secret";
    private static Connection connection;

    public static Connection getInstance() throws SQLException {
        if (connection == null){
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }
}
