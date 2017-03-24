package testBoard.interDB.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import testBoard.interDB.SQLSend;

public class SQLSender implements SQLSend{

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs = null;
	String sql;
	
	public SQLSender(Connection conn, PreparedStatement pstmt) {
		// TODO Auto-generated constructor stub
		this.conn = conn;
		this.pstmt = pstmt;
	}
	@Override
	public ResultSet testsend(String id) {
		// TODO Auto-generated method stub
		sql ="SELECT * FROM TB_USER WHERE USERID = '" + id + "'";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("태스트 결과 애러");
		}
		return rs;
		
	}	
	@Override
	public void signUp(String userid, String userpw, String username, String email) {
		// TODO Auto-generated method stub
		if(singcheck(userid)){
			sql ="INSERT INTO TB_USER(USERID,USERPW,USERNAME,EMAIL,JOINDATE) "
										+ "VALUES(?,?,?,?,SYSDATE)";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, userid);
				pstmt.setString(2, userpw);
				pstmt.setString(3, username);
				pstmt.setString(4, email);
				
//				if (pstmt.executeUpdate() == 1) {
//					System.out.println("가입 성공");
//				} else {
//					System.out.println("가입 실패");
//				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("쿼리 전송애러");
			}
			try {
				pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("업데이트 실패");
			}
		}
		else{
			System.out.println("중복된 아이디입니다.");
		}
		
		
	}
	private boolean singcheck(String userid) {
		// TODO Auto-generated method stub
		int check =1;
		sql = "SELECT COUNT(*) AS LOGIN_CNT "
				+ "FROM TB_USER "
				+ "WHERE USERID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				check = rs.getInt("LOGIN_CNT");
			}
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("로그인 채크 애러");
		}
		if(check==1){
			return false;
		}else{
			return true;
		}
		
	}
	@Override
	public boolean signInCheck(String id, String pw) {
		// TODO Auto-generated method stub
		int check =0;
		sql = "SELECT COUNT(*) AS LOGIN_CNT " + "FROM TB_USER " + "WHERE USERID = ? AND USERPW = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				check = rs.getInt("LOGIN_CNT");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(check == 1){
			return true;
		}else{
			return false;
		}
		
	}	
	@Override
	public ResultSet getdata(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

}
