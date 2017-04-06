package kr.co.smh.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.smh.commons.Keys;
import kr.co.smh.commons.Pages;
import kr.co.smh.commons.URLs;
import kr.co.smh.service.BoardService;
import kr.co.smh.service.impl.BoardServiceImpl;
import kr.co.smh.vo.board.BoardVO;

@WebServlet("/board/*")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private BoardService boardService = new BoardServiceImpl();
	
    public BoardController() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute(Keys.KEY_LOGIN_SESSION) != null)
		{
			String req_uri = request.getPathInfo();
			try{
				if(req_uri.equals(URLs.URI_BOARD_LIST)){
					
					List<BoardVO> boardList = boardService.boardListService();
					request.setAttribute(Keys.KEY_BOARD_LIST_PARAM, boardList);
					
					RequestDispatcher dispatcher = request.getRequestDispatcher(Pages.VIEW_BOARD_LIST);
					dispatcher.forward(request, response);
					
				}else if(req_uri.equals(URLs.URI_BOARD_CONTENTS)){
					String bidx = request.getParameter("bidx");
					BoardVO boardVO = boardService.boardContentsService(bidx);
					request.setAttribute(Keys.KEY_BOARD_CONTENTS_PARAM, boardVO);
					RequestDispatcher dispatcher = request.getRequestDispatcher(Pages.VIEW_BOARD_CONTENTS);
					dispatcher.forward(request, response);
				}
			}catch(SQLException e){
				throw new ServletException(e);
			}catch(Exception e){
				throw new ServletException(e);
			}
		}else{
			response.sendRedirect("/");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
