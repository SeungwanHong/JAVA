package kr.co.smh.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
	private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String DB_USER = "smh";
	private static final String DB_PASSWORD = "smh";

	protected Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		return conn;
	}

}
