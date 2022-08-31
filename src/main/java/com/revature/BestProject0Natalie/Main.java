package com.revature.BestProject0Natalie;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Main {
    public static void main (String[] args) {

        try {
            Properties dbProps = new Properties();
           // dbProps.load(new FileReader("src/main/resource/application.properties"));
            dbProps.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("application.properties"));
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(dbProps.getProperty("db-url"), dbProps.getProperty("db-username"), dbProps.getProperty("dbPassword"));
            if (conn != null) {
                System.out.println("Connection successful!");
            }
        } catch (IOException e){
            System.err.println("Could not read from properties file");

        } catch (ClassNotFoundException e){
            System.err.println("Could not find PostgresSQL JDBC driver.  Connection attempt aborted");
        } catch (SQLException e) {
            System.err.println("Could not establish a connection to the database.");
        }
    }
}
