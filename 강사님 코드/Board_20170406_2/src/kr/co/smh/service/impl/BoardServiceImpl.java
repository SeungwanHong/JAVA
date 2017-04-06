package kr.co.smh.service.impl;

import java.sql.SQLException;
import java.util.List;

import kr.co.smh.dao.BoardDAO;
import kr.co.smh.dao.impl.BoardDAOImpl;
import kr.co.smh.service.BoardService;
import kr.co.smh.vo.board.BoardVO;

public class BoardServiceImpl implements BoardService{

	private BoardDAO boardDAO = new BoardDAOImpl();
	
	@Override
	public List<BoardVO> boardListService() throws SQLException {
		return boardDAO.boardList();
	}
	
	@Override
	public BoardVO boardContentsService(String bidx) throws SQLException{
		return boardDAO.boardContents(bidx);
	}

}
