package testBoard.interDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface SQLSend {
	void signUp(String id, String pw, String name, String email);
	boolean signInCheck(String id, String pw);
	
	ResultSet testsend(String id);
	ResultSet getdata(String sql);
	
	

}
