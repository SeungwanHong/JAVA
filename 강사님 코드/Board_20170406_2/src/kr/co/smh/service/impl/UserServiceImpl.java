package kr.co.smh.service.impl;

import java.sql.SQLException;

import kr.co.smh.dao.UserDAO;
import kr.co.smh.dao.impl.UserDAOImpl;
import kr.co.smh.dto.user.LoginDTO;
import kr.co.smh.service.UserService;
import kr.co.smh.vo.user.LoginVO;

public class UserServiceImpl implements UserService{

	private UserDAO userDAO = new UserDAOImpl();
	
	@Override
	public LoginVO loginService(LoginDTO loginDTO) throws SQLException {
		
		LoginVO loginVO = userDAO.login(loginDTO);
		return loginVO;
	}

	@Override
	public int joinUserService(String id, String pw, String name, String email) throws SQLException {
		int joinYN = userDAO.joinUser(id, pw, name, email);
		return joinYN;
	}

}
