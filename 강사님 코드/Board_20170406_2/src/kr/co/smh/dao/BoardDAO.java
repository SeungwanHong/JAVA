package kr.co.smh.dao;

import java.sql.SQLException;
import java.util.List;
import kr.co.smh.vo.board.BoardVO;

public interface BoardDAO {
	public List<BoardVO> boardList() throws SQLException;
	public BoardVO boardContents(String index) throws SQLException;
}
