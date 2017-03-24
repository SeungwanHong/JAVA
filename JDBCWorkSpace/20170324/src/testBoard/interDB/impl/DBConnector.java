package testBoard.interDB.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import testBoard.interDB.DBConnect;

public class DBConnector implements DBConnect{
	final String DB_url = "jdbc:oracle:thin:@localhost:1521:orcl";
	final String DB_user = "hsw";
	final String DB_password = "hsw";

	private Connection conn = null;	
	private PreparedStatement pstmt = null;
	
	@Override
	public void dbConnect(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("라이브러리 로드 완료");
		
			conn = DriverManager.getConnection(DB_url,DB_user,DB_password);
			System.out.println("접속 성공");
		
//			String sql ="SELECT * FROM EMP";
//			pstmt = conn.prepareStatement(sql);
//		
//			rs = pstmt.executeQuery();
//		
//			while(rs.next()){
//				String empno = rs.getString("EMPNO");
//				String ename = rs.getString("ENAME");
//				int sal = rs.getInt("SAL");
//				System.out.println("사번  : "+empno+" 이름 : "+ename+" 급여 : "+sal);
//		
//			}
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("라이브러리 로드 실패");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("접속 실패");
		}
	}


	public Connection getConn() {
		return conn;
	}

	public PreparedStatement getPstmt() {
		return pstmt;
	}

	public void setPstmt(PreparedStatement pstmt) {
		this.pstmt = pstmt;
	}


	@Override
	public void dbClose(){
		// TODO Auto-generated method stub
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("커넥션 닫기 애러");
		}
	}
	


}