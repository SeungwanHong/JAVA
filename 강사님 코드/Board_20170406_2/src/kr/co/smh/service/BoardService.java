package kr.co.smh.service;

import java.sql.SQLException;
import java.util.List;

import kr.co.smh.vo.board.BoardVO;

public interface BoardService {
	public List<BoardVO> boardListService() throws SQLException;
	public BoardVO boardContentsService(String bidx) throws SQLException;
}