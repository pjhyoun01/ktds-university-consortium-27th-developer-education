package com.ktdsuniversity.edu.board.service;

import java.util.List;

import com.ktdsuniversity.edu.board.VO.ReplyVO;
import com.ktdsuniversity.edu.board.dao.ReplyDao;
import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;

public class ReplyService {
	private DataAccessHelper dah;
	private ReplyDao replyDao;

	public ReplyService(DataAccessHelper dah) {
		this.dah = dah;
		this.replyDao = new ReplyDao(this.dah);
	}

	public void createNewReply(ReplyVO replyVO) {
		try {
			this.replyDao.createNewReply(replyVO);
			this.dah.commit();
			System.out.println("댓글 생성 완료");
		} catch (RuntimeException re) {
			this.dah.rollback();
			System.out.println("댓글 생성 실패");
		}
	}

	public void createNewReReply(ReplyVO replyVO) {
		try {
			this.replyDao.createNewReReply(replyVO);
			this.dah.commit();
			System.out.println("대댓글 생성 완료");
		} catch (RuntimeException re) {
			this.dah.rollback();
			System.out.println("대댓글 실패 완료");
		}
	}

	public List<ReplyVO> getAllReply() {
		List<ReplyVO> result = this.replyDao.getAllReply();
		return result;
	}

	public ReplyVO getOneReply(String replyId) {
		ReplyVO result = this.replyDao.getOneReply(replyId);
		return result;
	}

	public List<ReplyVO> getAllReReply() {
		List<ReplyVO> result = this.replyDao.getAllReReply();
		return result;
	}

	public void modifyReply(ReplyVO replyVO) {
		try {
			this.replyDao.modifyReply(replyVO);
			this.dah.commit();
			System.out.println("댓글 수정 완료");
		} catch (RuntimeException re) {
			this.dah.rollback();
			System.out.println("댓글 수정 실패");
		}
	}

	public void deleteReply(String replyId) {
		try {
			this.replyDao.deleteReply(replyId);
			this.dah.commit();
			System.out.println("댓글 삭제 완료");
		} catch (RuntimeException re) {
			this.dah.rollback();
			System.out.println("댓글 삭제 실패");
		}
	}

}
