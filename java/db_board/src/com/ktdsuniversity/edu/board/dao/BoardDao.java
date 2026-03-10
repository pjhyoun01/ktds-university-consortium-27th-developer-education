package com.ktdsuniversity.edu.board.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.board.VO.BoardVO;
import com.ktdsuniversity.edu.board.dao.query.BoardQuery;
import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.board.db.helper.SQLType;

/**
 * Dao: Data Access Object java에서 DB로 데이터를 전송
 */
public class BoardDao {
	private DataAccessHelper dah;

	public BoardDao(DataAccessHelper dah) {
		this.dah = dah;
	}

	public void createNewArticle(BoardVO newArticle) {
		this.dah.preparedStatement(BoardQuery.createNewArticleQuery(), arg -> {
			arg.setString(1, newArticle.getTitle());
			arg.setString(2, newArticle.getContent());
		});
		this.dah.executeQuery(SQLType.INSERT, null);
	}

	public List<BoardVO> readAllArticle() {
		this.dah.preparedStatement(BoardQuery.readAllArticleQuery(), null);
		List<BoardVO> result = new ArrayList<>();
		BoardVO value = new BoardVO();
		this.dah.executeQuery(SQLType.SELECT, rs -> {
			value.setId(rs.getString("ID"));
			value.setTitle(rs.getString("TITLE"));
			value.setContent(rs.getString("CONTENT"));
			value.setViewCount(rs.getInt("VIEW_COUNT"));
			value.setWriteDate(rs.getString("WRITE_DATE"));
			value.setLatestModifyDate(rs.getString("LATEST_MODIFY_DATE"));
			result.add(value);
		});
		return result;
	}

	public void increaseViewCount(String boardId) {
		this.dah.preparedStatement(BoardQuery.increaseViewCountQuery(), arg -> arg.setString(1, boardId));
		this.dah.executeQuery(SQLType.UPDATE, null);
	}

	public BoardVO readOneArticle(String boardId) {
		this.dah.preparedStatement(BoardQuery.readOneArticleQuery(), arg -> arg.setString(1, boardId));
		BoardVO result = new BoardVO();
		this.dah.executeQuery(SQLType.SELECT, rs -> {
			result.setId(rs.getString("ID"));
			result.setTitle(rs.getString("TITLE"));
			result.setContent(rs.getString("CONTENT"));
			result.setViewCount(rs.getInt("VIEW_COUNT"));
			result.setWriteDate(rs.getString("WRITE_DATE"));
			result.setLatestModifyDate(rs.getString("LATEST_MODIFY_DATE"));
		});
		return result;
	}

	public void modifyArticle(BoardVO modifyArticle) {
		this.dah.preparedStatement(BoardQuery.modifyArticleQuery(), arg -> {
			arg.setString(1, modifyArticle.getTitle());
			arg.setString(2, modifyArticle.getContent());
			arg.setString(3, modifyArticle.getId());
		});
		this.dah.executeQuery(SQLType.UPDATE, null);
	}

	public void deleteArticle(String boardId) {
		this.dah.preparedStatement(BoardQuery.deleteArticleQuery(), arg -> arg.setString(1, boardId));
		this.dah.executeQuery(SQLType.DELETE, null);
	}

}
