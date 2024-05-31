package com.perficient.baseclasses;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.perficient.util.ConfigFileReader;


public class DatabaseConnections {
	
	protected static java.sql.Connection connection = null;
	private static ConfigFileReader config;
	
	//to open DB connections
	protected static void openConnection() throws ClassNotFoundException, SQLException{
		config = new ConfigFileReader();
		String dbUrl = config.getDBUrl("Local");
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		connection = DriverManager.getConnection(dbUrl);
	}

	//to set login timeout
	protected static void setDBTimeout(int seconds) {
		DriverManager.setLoginTimeout(seconds);
	}
	
	
	//to close DB connection
	protected static void closeConnection() {
        try {
            if (connection != null) {
            	connection.close();
            }
            connection = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
}
