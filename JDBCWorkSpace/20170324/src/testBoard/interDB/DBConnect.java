package testBoard.interDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface DBConnect {
	void dbClose() throws SQLException;
	Connection getConn();
	PreparedStatement getPstmt();
}
