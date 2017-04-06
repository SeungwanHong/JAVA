package kr.co.smh.dao;

import java.sql.SQLException;

import kr.co.smh.dto.user.LoginDTO;
import kr.co.smh.vo.user.LoginVO;

public interface UserDAO {
	public LoginVO login(LoginDTO loginDTO) throws SQLException;
	public int joinUser(String id, String pw, String name, String email) throws SQLException;
}
