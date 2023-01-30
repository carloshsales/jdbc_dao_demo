package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import db.exceptions.GeneralDBException;

public class DB {
	
	private static Connection connection = null;
	
	public static void getConnection() {
		if(connection == null) {
			try {
				Properties props = loadProperties();
				String url = props.getProperty("url");
				connection = DriverManager.getConnection(url, props);
			}catch(SQLException e) {
				throw new GeneralDBException(e.getMessage());
			}
		}
	}
	
	public static void closeConnection() {
		if(connection != null) {
			try {
				connection.close();
			}catch(SQLException e) {
				throw new GeneralDBException(e.getMessage());
			}
		}
	}
	
	private static Properties loadProperties() {
		try(FileInputStream fileInput = new FileInputStream("db.properties")){
			Properties props = new Properties();
			props.load(fileInput);
			return props;
		}catch(IOException e) {
			throw new GeneralDBException(e.getMessage());
		}
	}
	
	public static void closeStatement(Statement statement) {
		if(statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				throw new GeneralDBException(e.getMessage());
			}
		}
	}
	
	public static void closeResultSet(ResultSet resultSet) {
		if(resultSet != null) {
			try {
				resultSet.close();
			}catch(SQLException e) {
				throw new GeneralDBException(e.getMessage());
			}
		}
	}
	
}
















