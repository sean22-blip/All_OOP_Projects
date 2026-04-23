package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mySqlConnection {
    private static Connection connection = null;
    private static final String URL = "jdbc:mysql://localhost:3306/cinemamanagingsystem";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1334";
    public static Connection getConnection(){
        if(connection == null){
            try{
                Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                System.out.println("Successfully connected!");
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        return connection;
        
    }
    public static void closeConnection(){
          if (connection != null) {
            try {
                connection.close();
                connection = null;
                System.out.println("connection is closed.");
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                System.out.println("failed to close connection");
                e.printStackTrace();
            }
        }
    }
     public static ResultSet excecuteQuery(String query) {
        try {
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            return resultSet;
        } catch (SQLException e) {
            System.out.println("Update execution failed!");
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
             connection = getConnection();
        ResultSet resultSet = excecuteQuery("select * from staff;");
        try {
            while (resultSet.next()) {
                System.out.println(resultSet.getString("staffId"));
                resultSet.getString(1);
                System.out.println(resultSet.getString("birthdate"));
                resultSet.getString(2);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        closeConnection();
    }
}
