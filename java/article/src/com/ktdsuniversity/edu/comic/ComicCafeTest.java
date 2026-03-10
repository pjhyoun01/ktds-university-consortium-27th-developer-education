package com.ktdsuniversity.edu.comic;

import com.ktdsuniversity.edu.comic.book.Book;
import com.ktdsuniversity.edu.comic.cafe.ComicCafe;

public class ComicCafeTest {

	public static void main(String[] args) {
		
		Book dragonBall = new Book("드래곤볼", 1_300);
		Book naruto = new Book("나루토", 1_900);
		Book onepiece = new Book("원피스", 1_100);
		Book Bleach = new Book("블리치", 900);
		
		ComicCafe seller = new ComicCafe(dragonBall);
		seller = new ComicCafe(naruto);
		seller = new ComicCafe(onepiece);
		seller = new ComicCafe(Bleach);
		
		
		seller.printBookStatus();
	}
}
