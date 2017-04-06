package kr.co.smh.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.smh.commons.Keys;
import kr.co.smh.commons.Pages;
import kr.co.smh.commons.URLs;
import kr.co.smh.dto.user.LoginDTO;
import kr.co.smh.service.UserService;
import kr.co.smh.service.impl.UserServiceImpl;
import kr.co.smh.vo.user.LoginVO;

@WebServlet("/user/*")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService = new UserServiceImpl();
       
    public UserController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String req_uri = request.getPathInfo();
		
		try
		{
			if(req_uri.equals(URLs.URI_LOGIN)){
				RequestDispatcher dispatcher = request.getRequestDispatcher(Pages.VIEW_LOGIN_FORM);
				dispatcher.forward(request, response);
			}else if(req_uri.equals(URLs.URI_LOGOUT)){
				request.getSession().invalidate();
				response.sendRedirect("/");
			}else if(req_uri.equals(URLs.URI_LOGIN_CHK)){
				login_chk(request, response);
			}
		}catch(SQLException e){
			throw new ServletException(e);
		}catch(Exception e){
			throw new ServletException(e);
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void login_chk(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
		String userid = request.getParameter(Keys.KEY_USERID_PARAM);
		String userpw = request.getParameter(Keys.KEY_USERPW_PARAM);
		
		
		System.out.println(userid);
		System.out.println(userpw);
		
		LoginDTO loginDTO = new LoginDTO();
		loginDTO.setUserid(userid);
		loginDTO.setUserpw(userpw);
		
		LoginVO loginVO = userService.loginService(loginDTO);
		System.out.println(loginVO);
		if(loginVO == null){
			request.setAttribute(Keys.KEY_USERID_PARAM, userid);
			RequestDispatcher dispatcher = request.getRequestDispatcher(Pages.VIEW_LOGIN_FORM);
			dispatcher.forward(request, response);
		}else{
			request.getSession().setAttribute(Keys.KEY_LOGIN_SESSION, loginVO);
			response.sendRedirect(URLs.URI_BOARD_LIST_FULL);
		}
	}

}
