package database;

import exceptions.DatabaseConnectionException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;
import java.io.InputStream;

public class DBConnection {
    private Connection connection;
    private Statement statement;

    public DBConnection() {
        try (InputStream input = DBConnection.class.getClassLoader().getResourceAsStream("db.properties")) {
            if (input == null) {
                throw new DatabaseConnectionException(" db.properties not found in resources folder!");
            }

            Properties props = new Properties();
            props.load(input);

            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String pass = props.getProperty("db.password");

            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();

            System.out.println("Database Connected Successfully");
        } catch (Exception e) {
            throw new DatabaseConnectionException("Failed to connect to Database", e);
        }
    }

    // Getters for DAO class
    public Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {
        return statement;
    }
}
