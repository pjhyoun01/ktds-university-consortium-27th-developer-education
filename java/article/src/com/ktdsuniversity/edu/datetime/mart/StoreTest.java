package com.ktdsuniversity.edu.datetime.mart;

import java.util.Iterator;

public class StoreTest {
	public static void main(String[] args) {
		
		Store store = new Store();
		store.add(new Item("우유", "2026-02-04"));
		store.add(new Item("매일우유", "2026-02-06"));
		store.add(new Item("남양우유", "2026-02-07"));
		store.add(new Item("딸기우유", "2026-02-05"));
		store.add(new Item("초코우유", "2026-02-08"));
		store.add(new Item("메론우유", "2026-02-04"));
		store.add(new Item("상한우유", "2026-02-01"));
		store.add(new Item("싱싱한우유", "2026-02-02"));
		store.add(new Item("맛없는우유", "2026-02-03"));
		store.add(new Item("맛있는우유", "2026-02-07"));
		
		for (int i = 0; i < 12; i++) {
			store.sell(i);
		}
		
		/*
		상품명: 우유, 소비기한: 2026-02-04
		오늘까지 드세요
		
		상품명: 매일우유, 소비기한: 2026-02-06
		가능한 빨리 드세요
		
		상품명: 남양우유, 소비기한: 2026-02-07
		2월 7일 까지 드세요
		
		상품명: 딸기우유, 소비기한: 2026-02-05
		가능한 빨리 드세요
		
		상품명: 초코우유, 소비기한: 2026-02-08
		2월 8일 까지 드세요
		
		상품명: 메론우유, 소비기한: 2026-02-04
		오늘까지 드세요
		
		상품명: 상한우유, 소비기한: 2026-02-01
		소비기한이 지나 판매하지 않습니다
		
		상품명: 싱싱한우유, 소비기한: 2026-02-02
		소비기한이 지나 판매하지 않습니다
		
		상품명: 맛없는우유, 소비기한: 2026-02-03
		소비기한이 지나 판매하지 않습니다
		
		상품명: 맛있는우유, 소비기한: 2026-02-07
		2월 7일 까지 드세요
		
		그런 상품은 없습니다. 상품번호를 확인하고 입력해주세요.
		
		그런 상품은 없습니다. 상품번호를 확인하고 입력해주세요.
		 */
	}
	
}
