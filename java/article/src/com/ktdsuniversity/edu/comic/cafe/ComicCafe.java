package com.ktdsuniversity.edu.comic.cafe;

import com.ktdsuniversity.edu.comic.book.Book;

public class ComicCafe {

	Book[] bookArray;
	
	public ComicCafe(Book info) {
		int bookNum = 0;
		bookArray[bookNum].setName(info.getName());
		bookArray[bookNum].setRentalPrice(info.getRentalPrice());
		bookArray[bookNum].setRental(false);
		bookNum++;
	}

//	모든 만화책 목록 출력
	public void printBookStatus() {
		for (int i = 0; i < this.bookArray.length; i++) {
			System.out.print(this.bookArray[i].getName());
			if (this.bookArray[i].isRental()) {
				System.out.println("대여 가능");
			} else {
				System.out.println("대여 불가");
			}
		}
	}

//	만화책 대여
//	이미 대여 중인 만화책은 대여 불가
//	대여할 때 만화책 대여비를 지급
	/**
	 * 만화책의 이름과 돈을 받고
	 * bookArray를 돌면서 bookArray[].getName == bookName인 경우에만
	 * 		bookArray[].isRental을 확인하고 false인 경우에만
	 * 			책을 빌려주고
	 * 			bookArray[].isRental = true로 변경
	 * else
	 * 		그런 책은 없습니다 출력
	 * @param bookName
	 * @param money
	 */
	public void rentBook(String bookName, int money) {
		for (int i = 0; i < this.bookArray.length; i ++) {
			if (this.bookArray[i].getName() == bookName) {
				if (!this.bookArray[i].isRental()) {
					if (this.bookArray[i].getRentalPrice() >= money) {
						System.out.println(this.bookArray[i].getName() +"을(를) 대여했습니다");
						this.bookArray[i].setRental(true);
					} else {
						System.out.println("돈이 부족합니다");
						return;
					}
				} else {
					System.out.println(this.bookArray[i].getName() + "은(는) 이미 대여중입니다");
				}
			} else {
				System.out.println("올바른 책 제목을 입력해 주세요.");
			}
		}
	}

//	만화책 반납
	public void returnBook(String bookName) {
		for (int i = 0; i < this.bookArray.length; i ++) {
			if (this.bookArray[i].getName() == bookName) {
				if (this.bookArray[i].isRental()) {
					System.out.println(this.bookArray[i].getName() +"을(를) 반납했습니다");
					this.bookArray[i].setRental(false);
				} else {
					System.out.println(this.bookArray[i].getName() + "은(는) 대여중이 아닙니다");
				}
			} else {
				System.out.println("올바른 책 제목을 입력해 주세요.");
			}
		}
	}
}
