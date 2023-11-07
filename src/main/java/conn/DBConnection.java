package conn;

import java.io.IOException;

import java.sql.*;
public class DBConnection {
	public static Connection getConnection()
		throws ClassNotFoundException, SQLException{
		
		return SQLServerConnection.initializeDatabase();
	}
}