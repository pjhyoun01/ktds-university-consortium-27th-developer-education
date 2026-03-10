package com.ktdsuniversity.edu.coffee.shop;

import com.ktdsuniversity.edu.coffee.coffee.Coffee;

public class CoffeeShop {
	/**
	 * 커피숍에서 판매하는 차가운 아메리카노
	 */
	Coffee iceAmericano;
	
	/**
	 * 커피숍에서 판매하는 차가운 아메리카노
	 */
	Coffee hotAmericano;

	public CoffeeShop(Coffee iceAmericano, Coffee hotAmericano) {
		this.iceAmericano = iceAmericano;
		this.hotAmericano = hotAmericano;
	}
	
	public CoffeeShop() {
//		this.hotAmericano = new Coffee("기본 아메리카노", 1_500, 30);
//		this.iceAmericano = new Coffee("아이스 아메리카노", 1_500, 50);
		this(new Coffee(CoffeeType.HOTCOFFEE, 1_500, 30)
		   , new Coffee(CoffeeType.ICECOFFEE, 1_500, 50));
	}

	/**
	 * 가장 첫 번째 메뉴를 한 개 주문한다
	 * @return
	 */
	public int orderCoffee() {
		int price = this.orderCoffee(1);
		return price;
	}
	/**
	 * 메뉴 한개만 주문
	 * @param menu
	 * @return
	 */
	public int orderCoffee(int menu) {
		int price = this.orderCoffee(menu, 1);
		return price;
	}
	/**
	 * 커피숍에서 커피를 판매
	 * 
	 * @param menu 메뉴들의 번호 1. hot, 2. ice
	 * @param quantity 주문 수량
	 * @return 주문 가격
	 */
	// 주문 수량이 객체의 재고보다 많을 경우 판매x
	// 주문 수량이 객체의 재고보다 적을 경우 정상 판매
	public int orderCoffee(int menu, int quantity) {
		if (menu == 1) {
			if (this.hotAmericano.getStock() >= quantity) {
				System.out.print(this.hotAmericano.getName() + " " + quantity + "개의 가격: ");
				return this.hotAmericano.getPrice() * quantity;				
			}else {
				System.out.println(this.hotAmericano.getName() + "의 재고가 부족합니다");
				return 0;
			}
			
		} else if (menu == 2) {
			if (this.iceAmericano.getStock() >=  quantity ) {
				System.out.print(this.iceAmericano.getName() + " " + quantity + "개의 가격: ");
				return this.iceAmericano.getPrice() * quantity;
			} else {
				System.out.println(this.iceAmericano.getName() + "의 재고가 부족합니다");
				return 0;
				
			}
			
		} else {
			System.out.println("존재하지 않는 음료입니다");
			return 0;
		}
	}
}