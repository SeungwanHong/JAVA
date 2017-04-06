package kr.co.smh.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.smh.dao.BaseDAO;
import kr.co.smh.dao.BoardDAO;
import kr.co.smh.vo.board.BoardVO;

public class BoardDAOImpl extends BaseDAO implements BoardDAO {

	@Override
	public List<BoardVO> boardList() throws SQLException {

		List<BoardVO> boardList = new ArrayList<>();

		Connection conn = getConnection();
		String sql = "SELECT BIDX, TITLE, USERID, HITCNT, WRITEDATE FROM TB_BOARD_DEMO";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet board_rs = pstmt.executeQuery();

		while (board_rs.next()) {

			BoardVO boardVO = new BoardVO();

			boardVO.setBidx(board_rs.getString("BIDX"));
			boardVO.setTitle(board_rs.getString("TITLE"));
			boardVO.setUserid(board_rs.getString("USERID"));
			boardVO.setHitcnt(board_rs.getString("HITCNT"));
			boardVO.setWritedate(board_rs.getString("WRITEDATE"));

			boardList.add(boardVO);
		}

		pstmt.close();
		board_rs.close();
		conn.close();

		return boardList;
	}

	@Override
	public BoardVO boardContents(String index) throws SQLException {

		Connection conn = getConnection();
		String sql = "SELECT BIDX, TITLE, CONTENTS, USERID, HITCNT, WRITEDATE FROM TB_BOARD_DEMO WHERE BIDX = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, index);
		ResultSet board_rs = pstmt.executeQuery();

		//인덱스에 해당하는 게시물이 있으면 boardVO의 객체를 리턴, 없으면 null 리턴
		BoardVO boardVO = null;

		if (board_rs.next()) {
			boardVO = new BoardVO();
			boardVO.setBidx(board_rs.getString("BIDX"));
			boardVO.setTitle(board_rs.getString("TITLE"));
			boardVO.setContents(board_rs.getString("CONTENTS"));
			boardVO.setUserid(board_rs.getString("USERID"));
			boardVO.setHitcnt(board_rs.getString("HITCNT"));
			boardVO.setWritedate(board_rs.getString("WRITEDATE"));
		}

		pstmt.close();
		board_rs.close();
		conn.close();

		return boardVO;
	}

}
