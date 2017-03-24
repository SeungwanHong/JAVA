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
			System.out.println("���̺귯�� �ε� �Ϸ�");
		
			conn = DriverManager.getConnection(DB_url,DB_user,DB_password);
			System.out.println("���� ����");
		
//			String sql ="SELECT * FROM EMP";
//			pstmt = conn.prepareStatement(sql);
//		
//			rs = pstmt.executeQuery();
//		
//			while(rs.next()){
//				String empno = rs.getString("EMPNO");
//				String ename = rs.getString("ENAME");
//				int sal = rs.getInt("SAL");
//				System.out.println("���  : "+empno+" �̸� : "+ename+" �޿� : "+sal);
//		
//			}
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("���̺귯�� �ε� ����");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("���� ����");
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
			System.out.println("Ŀ�ؼ� �ݱ� �ַ�");
		}
	}
	


}