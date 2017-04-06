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
		// �����̷�Ʈ ��� �� ��
		// 1) �α����� �ȵǾ������� �α��� �������� �̵���Ų�� - �α��� �������� �����ִ� ��Ʈ�ѷ�
		// 2) �α����� �Ǿ� ������ �Խ��� ��� �������� �̵���Ų��. - �Խ��� ����� �����ִ� ��Ʈ�ѷ�
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
