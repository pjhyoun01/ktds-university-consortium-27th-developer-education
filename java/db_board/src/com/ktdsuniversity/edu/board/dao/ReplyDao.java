package com.ktdsuniversity.edu.board.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.board.VO.ReplyVO;
import com.ktdsuniversity.edu.board.dao.query.ReplyQuery;
import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.board.db.helper.SQLType;

public class ReplyDao {
	private DataAccessHelper dah;
	
	public ReplyDao(DataAccessHelper dah) {
		this.dah = dah;
	}

	public void createNewReply(ReplyVO replyVO) {
		this.dah.preparedStatement(ReplyQuery.createNewReplyQuery(), arg -> {
			arg.setString(1, replyVO.getBoardId());
			arg.setString(2, replyVO.getContent());
		});
		this.dah.executeQuery(SQLType.INSERT, null);
	}

	public void createNewReReply(ReplyVO replyVO) {
		this.dah.preparedStatement(ReplyQuery.createNewReReplyQuery(), arg -> {
			arg.setString(1, replyVO.getBoardId());
			arg.setString(2, replyVO.getTopId());
			arg.setString(3, replyVO.getContent());
		});
		this.dah.executeQuery(SQLType.INSERT, null);
	}

	public List<ReplyVO> getAllReply() {
		this.dah.preparedStatement(ReplyQuery.getAllReplyQuery(), null);
		List<ReplyVO> result = new ArrayList<>();
		ReplyVO value = new ReplyVO(); 
		this.dah.executeQuery(SQLType.SELECT, rs -> {
			value.setId(rs.getString("ID"));
			value.setBoardId(rs.getString("BOARD_ID"));
			value.setTopId(rs.getString("TOP_ID"));
			value.setContent(rs.getString("CONTENT"));
			value.setWriteDate(rs.getString("WRITE_DATE"));
			result.add(value);
		});
		return result;
	}

	public ReplyVO getOneReply(String replyId) {
		this.dah.preparedStatement(ReplyQuery.getOneReplyQuery(), arg -> arg.setString(1, replyId));
		ReplyVO value = new ReplyVO(); 
		this.dah.executeQuery(SQLType.SELECT, rs -> {
			value.setId(rs.getString("ID"));
			value.setBoardId(rs.getString("BOARD_ID"));
			value.setTopId(rs.getString("TOP_ID"));
			value.setContent(rs.getString("CONTENT"));
			value.setWriteDate(rs.getString("WRITE_DATE"));
		});
		return value;
	}

	public List<ReplyVO> getAllReReply() {
		this.dah.preparedStatement(ReplyQuery.getAllReReplyQuery(), null);
		List<ReplyVO> result = new ArrayList<>();
		ReplyVO value = new ReplyVO(); 
		this.dah.executeQuery(SQLType.SELECT, rs -> {
			value.setId(rs.getString("ID"));
			value.setBoardId(rs.getString("BOARD_ID"));
			value.setTopId(rs.getString("TOP_ID"));
			value.setContent(rs.getString("CONTENT"));
			value.setWriteDate(rs.getString("WRITE_DATE"));
			result.add(value);
		});
		return result;
	}

	public void modifyReply(ReplyVO replyVO) {
		this.dah.preparedStatement(ReplyQuery.modifyReplyQuery(), arg -> {
			arg.setString(1, replyVO.getContent());
			arg.setString(2, replyVO.getId());
		});
		this.dah.executeQuery(SQLType.UPDATE, null);
	}

	public void deleteReply(String replyId) {
		this.dah.preparedStatement(ReplyQuery.deleteReplyQuery(), arg -> arg.setString(1, replyId));
		this.dah.executeQuery(SQLType.DELETE, null);
	}
}
