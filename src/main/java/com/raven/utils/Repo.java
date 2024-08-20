package com.raven.utils;

import java.sql.*;

public class Repo { // singleton pattern
    private static Repo instance;

    private final static String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/ql_vanphongpham";
    private final static String username = "root";
    private final static String password = "";

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    private Repo() {
        try {
            connection = DriverManager.getConnection(jdbcUrl, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Repo getInstance() {
        if(instance == null) {
            synchronized (Repo.class) {
                if (instance == null) {
                    instance = new Repo();
                }
            }
        }
        return instance;
    }

    public ResultSet executeQuery(String sql) { // nhung cau query co tra ve gia tri select
        try  {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void executeUpdate(String sql) { // nhung cau query khong tra ve gia tri // update, insert, delete
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}