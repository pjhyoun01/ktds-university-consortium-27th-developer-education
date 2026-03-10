package com.ktdsuniversity.edu.datetime.mart;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store {
	private List<Item> items;

	public Store() {
		this.items = new ArrayList<>();
	}

	public void add(Item item) {
		this.items.add(item);
	}

	public void sell(int index) {
		LocalDate canEatDate = null;
		try {
			canEatDate = LocalDate.parse(items.get(index).getExpireDate().toString());

		} 
//		catch (NullPointerException npe) {
//			System.out.println("상품번호를 입력해주세요.");
//			return;
//		} 
		catch (IndexOutOfBoundsException ioobe) {
			System.out.println("그런 상품은 없습니다. 상품번호를 확인하고 입력해주세요.\n");
			return;
		}
		LocalDate now = LocalDate.now();
		System.out.println(items.get(index));
		if (canEatDate.isBefore(now.plusDays(3)) && canEatDate.isAfter(now)) {
			System.out.println("가능한 빨리 드세요");
		} else if (canEatDate.toString().equals(now.toString())) {
			System.out.println("오늘까지 드세요");
		} else if (canEatDate.isBefore(now)) {
			System.out.println("소비기한이 지나 판매하지 않습니다");
		} else {
			System.out.println(canEatDate.getMonthValue() + "월 " + canEatDate.getDayOfMonth() + "일 까지 드세요");
		}
		System.out.println();
	}

}
