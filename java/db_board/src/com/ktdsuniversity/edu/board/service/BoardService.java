package com.ktdsuniversity.edu.board.service;

/**
 * 트랜젝션 처리
 */
import java.util.List;

import com.ktdsuniversity.edu.board.VO.BoardVO;
import com.ktdsuniversity.edu.board.dao.BoardDao;
import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;

public class BoardService {
	private DataAccessHelper dah;
	private BoardDao boardDao;

	public BoardService(DataAccessHelper dah) {
		this.dah = dah;
		this.boardDao = new BoardDao(this.dah);
	}

	public void createNewArticle(BoardVO newArticle) {
		try {
			this.boardDao.createNewArticle(newArticle);
			this.dah.commit();
			System.out.println("게시글 생성 완료");
		} catch (RuntimeException re) {
			this.dah.rollback();
			System.out.println(re.getMessage());
			System.out.println("게시글 생성 실패");
		}
	}

	public List<BoardVO> readAllArticle() {
		List<BoardVO> result = this.boardDao.readAllArticle();
		return result;
	}

	public BoardVO readOneArticle(String boardId) {
		try {
			this.boardDao.increaseViewCount(boardId);
			BoardVO result = this.boardDao.readOneArticle(boardId);
			this.dah.commit();
			return result;
		} catch (RuntimeException re) {
			this.dah.rollback();
			System.out.println(re.getMessage());
			System.out.println("게시글 하나 조회 실패");
		}
		return null;
		
	}

	public void modifyArticle(BoardVO modifyArticle) {
		try {
			this.boardDao.modifyArticle(modifyArticle);
			this.dah.commit();
			System.out.println("게시글 수정 성공");
		} catch (RuntimeException re) {
			this.dah.rollback();
			System.out.println(re.getMessage());
			System.out.println("게시글 수정 실패");
		}
	}

	public void deleteArticle(String boardId) {
		try {
			this.boardDao.deleteArticle(boardId);
			this.dah.commit();
			System.out.println("게시글 삭제 성공");
		} catch (RuntimeException re) {
			this.dah.rollback();
			System.out.println(re.getMessage());
			System.out.println("게시글 삭제 실패");
		}
	}

}
