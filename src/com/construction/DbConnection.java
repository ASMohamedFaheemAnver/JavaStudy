package com.construction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private Connection con;
    private String DbUserName = "root";
    private String DbPassword = "";
    public Connection getConnnection() throws SQLException {
        return this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/track", DbUserName, DbPassword);
    }
}
