package conn;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnection {
	public static Connection initializeDatabase()
		throws SQLException, ClassNotFoundException
		{
			String dbDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String dbURL="jdbc:sqlserver://localhost:1433";
			String dbName="laptrinhweb";
			String dbUsername="sa";
			String dbPassword ="123456";
			String connectionURL = dbURL + ";databaseName=" + dbName;
			Connection conn = null;
			try {
				Class.forName(dbDriver);
				conn = DriverManager.getConnection(connectionURL, dbUsername, dbPassword);
				System.out.println("connect sucessfully!");
				
			} catch (Exception ex)
			{
				System.out.println("connect failure");
				ex.printStackTrace();
			}
			return conn;
		}
}