package loginTest.jp.co.aforce.k.ishikawa.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final  class DBUtil {
	private static final String URL = "jdbc:mysql://localhost:3306/servlet_sample";
	private static final String USER = "root";
	private static final String PASSWORD = "koki1025";
	
	public static final Connection openConnection() throws SQLException{
		Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
		
		return con;
	}
}
