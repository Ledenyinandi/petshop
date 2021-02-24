package com.codecool.petshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

    public Connection getConnection() {
        Connection connection = null;
        String userName = "ledenyinandi";
        String password = "nandi";
        String host = "localhost";
        String databaseName = "petshopdb";

        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://" + host + ":5432/" + databaseName, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
