package com.perficient.baseclasses;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseStatements extends DatabaseConnections {
	
public static String executeSelectStatementWithUniqueKey( String TableName, String ColumnName, String UniqueKey, int UniqueKeyValue) throws SQLException, ClassNotFoundException {
		
	    openConnection();
		StringBuilder sb = new StringBuilder();
		sb.append("Select " + ColumnName );
		sb.append(" from " + TableName);
		sb.append(" where  " + UniqueKey + " = " + UniqueKeyValue );
		String sql = sb.toString();
		
		Statement stmt = connection.createStatement();
		ResultSet rs= stmt.executeQuery(sql);
		String FirstName = null;
		while(rs.next()) {
			    String firstValue = rs.getString(ColumnName);
			    FirstName = firstValue;
			  }
		closeConnection();
		return FirstName;
	}
	
public static void executeUpdateStatement(String TableName, String ColumnName, String SetValue, String UniqueKey, int UniqueKeyValue) throws SQLException, ClassNotFoundException {
		
		openConnection();
		StringBuilder sb = new StringBuilder();
		sb.append("UPDATE " + TableName );
		sb.append(" SET " + ColumnName + "='" + SetValue + "'");
		sb.append(" where  " + UniqueKey + " = " + UniqueKeyValue );
		String sql = sb.toString();
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.execute();
		closeConnection();
	}
	
public static void executeDeleteStatement( String TableName, String UniqueKey, int UniqueKeyValue) throws SQLException, ClassNotFoundException {
		
		openConnection();
		StringBuilder sb = new StringBuilder();
		sb.append("Delete  from " + TableName);
		sb.append(" where  " + UniqueKey + " = " + UniqueKeyValue );
		String sql = sb.toString();
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.execute();
		closeConnection();
	}
	
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		openConnection();
		
		String value = executeSelectStatementWithUniqueKey("Persons", "LastName", "PersonID", 1);
		System.out.println(value);
		
		executeUpdateStatement("Persons", "LastName", "lastName123", "PersonID", 1);
		String value1 = executeSelectStatementWithUniqueKey("Persons", "LastName", "PersonID", 1);
		System.out.println(value1);
		
		closeConnection();
	}

}
