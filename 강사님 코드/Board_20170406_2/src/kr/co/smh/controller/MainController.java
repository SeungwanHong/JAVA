package kr.co.smh.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.smh.commons.Keys;
import kr.co.smh.commons.URLs;

@WebServlet("/")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MainController() {
		super();
	}

	@Override
	public void init() throws ServletException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 리다이렉트 사용 할 것
		// 1) 로그인이 안되어있으면 로그인 페이지로 이동시킨다 - 로그인 페이지를 보여주는 컨트롤러
		// 2) 로그인이 되어 있으면 게시판 목록 페이지로 이동시킨다. - 게시판 목록을 보여주는 컨트롤러
		if(request.getSession().getAttribute(Keys.KEY_LOGIN_SESSION) == null){
			response.sendRedirect(URLs.URI_LOGIN_FULL);
		}else{
			response.sendRedirect(URLs.URI_BOARD_LIST_FULL);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
