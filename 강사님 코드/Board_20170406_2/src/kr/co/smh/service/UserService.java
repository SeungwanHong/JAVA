package kr.co.smh.service;

import java.sql.SQLException;

import kr.co.smh.dto.user.LoginDTO;
import kr.co.smh.vo.user.LoginVO;

public interface UserService {
	public LoginVO loginService(LoginDTO loginDTO) throws SQLException;
	public int joinUserService(String id, String pw, String name, String email) throws SQLException;

}
