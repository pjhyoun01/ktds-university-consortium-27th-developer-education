package com.ktdsuniversity.edu;

import java.util.List;

import com.ktdsuniversity.edu.board.VO.BoardVO;
import com.ktdsuniversity.edu.board.VO.ReplyVO;
import com.ktdsuniversity.edu.board.dao.ReplyDao;
import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.board.service.BoardService;
import com.ktdsuniversity.edu.board.service.ReplyService;

public class TestMain {

	public static void main(String[] args) {
// ------------------ 게시글 -------------------
		System.out.println("------------------ 게시글 -------------------");
		
		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD", "BOARD");
		BoardService boardService = new BoardService(dah);
		ReplyService replyService = new ReplyService(dah);

		BoardVO newArticle = new BoardVO();
		newArticle.setTitle("새로운 게시글입니다");
		newArticle.setContent("새로운 게시글 내용입니다.");

		BoardVO modifyArticle = new BoardVO();
		modifyArticle.setId("BO-20260303-000001");
		modifyArticle.setTitle("수정된 게시글입니다");
		modifyArticle.setContent("수정된 게시글 내용입니다.");

		// 게시글 생성
		boardService.createNewArticle(newArticle);
		System.out.println();

		// 게시글 전체 조회
		List<BoardVO> articleList = boardService.readAllArticle();
		System.out.println("게시글 전체 조회");
		for (BoardVO boardVO : articleList) {
			System.out.println(boardVO.toString());
		}
		System.out.println();

		// 게시글 하나 조회 BO-20260303-000002
		System.out.println("게시글 하나 조회");
		BoardVO article = boardService.readOneArticle("BO-20260303-000002");
		System.out.println(article.toString());
		System.out.println();

		// 게시글 수정
		boardService.modifyArticle(modifyArticle);
		System.out.println();

		// 게시글 삭제
//		boardService.deleteArticle("BO-20260303-000001");
//		System.out.println();

// ------------------ 댓글 -------------------
		System.out.println("------------------ 댓글 -------------------");

		ReplyVO newReply = new ReplyVO();
		newReply.setBoardId("BO-20260303-000002");
		newReply.setContent("새로운 댓글입니다");

		ReplyVO newReReply = new ReplyVO();
		newReReply.setBoardId("BO-20260303-000002");
		newReReply.setTopId("RP-20260303-000005");
		newReReply.setContent("새로운 대댓글입니다");

		// 댓글 생성
		replyService.createNewReply(newReply);
		System.out.println();

		// 대댓글 생성
		replyService.createNewReReply(newReReply);
		System.out.println();

		// 댓글 전체 조회 (대댓글 포함)
		List<ReplyVO> allReply = replyService.getAllReply();
		System.out.println("댓글 목록");
		for (ReplyVO replyVO : allReply) {
			System.out.println(replyVO.toString());
		}
		System.out.println();

		// 댓글 하나 조회
		ReplyVO OneReply = replyService.getOneReply("RP-20260303-000011");
		System.out.println("댓글 하나 조회");
		System.out.println(OneReply.toString());
		System.out.println();

		// 대댓글의 목록 조회 (대댓글 포함)
		List<ReplyVO> allReReply = replyService.getAllReReply();
		System.out.println("대댓글 목록");
		for (ReplyVO replyVO : allReReply) {
			System.out.println(replyVO.toString());
		}
		System.out.println();

		// 댓글 수정
		replyService.modifyReply(newReReply);
		System.out.println();

//		// 댓글 삭제
//		replyService.deleteReply("RP-20260304-000015");
//		System.out.println();

	}
}
