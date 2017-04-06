package kr.co.smh.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.smh.dao.BaseDAO;
import kr.co.smh.dao.UserDAO;
import kr.co.smh.dto.user.LoginDTO;
import kr.co.smh.vo.user.LoginVO;

public class UserDAOImpl extends BaseDAO implements UserDAO {

	@Override
	public int joinUser(String id, String pw, String name, String email) throws SQLException {
		Connection conn = getConnection();
		String sql = "insert into tb_user(userid,userpw,username,email,joindate)" + " values(?,?, ?, ?, sysdate)";

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		pstmt.setString(3, name);
		pstmt.setString(4, email);

		int result = pstmt.executeUpdate();
		pstmt.close();
		conn.close();

		return result;
	}

	@Override
	public LoginVO login(LoginDTO loginDTO) throws SQLException {

		Connection conn = getConnection();
		String sql = "SELECT USERID, USERNAME FROM TB_USER WHERE USERID=? AND USERPW=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, loginDTO.getUserid());
		pstmt.setString(2, loginDTO.getUserpw());

		ResultSet login_rs = pstmt.executeQuery();
		LoginVO loginVO = null;
		// 쿼리 조회 결과물이 있다면
		if (login_rs.next()) {
			// LoginVO의 객체를 만들어서 쿼리의 결과물을 넣어줄 준비
			loginVO = new LoginVO();

			// 조회된 결과물을 VO에 넣어준다.
			loginVO.setUserid(login_rs.getString("USERID"));
			loginVO.setUsername(login_rs.getString("USERNAME"));
		}
		
		login_rs.close();
		pstmt.close();
		conn.close();
		return loginVO;
	}

}