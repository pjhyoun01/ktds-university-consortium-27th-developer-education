package oop;

import java.util.Scanner;

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

	/**
	 * 커피숍에서 커피를 판매
	 * 
	 * @param menu 메뉴들의 번호 1. hot, 2. ice
	 * @param quantity 주문 수량
	 * @return 주문 가격
	 */
	public int orderCoffee(int menu, int quantity) {
		if (menu == 1) {
			System.out.print(this.hotAmericano.name + quantity + "개의 ");
			return this.hotAmericano.price * quantity;
		} else if (menu == 2) {
			System.out.print(this.iceAmericano.name + quantity + "개의 ");
			return this.iceAmericano.price * quantity;
			
		} else {
			System.out.println("존재하지 않는 음료입니다");
			return 0;
		}
	}
}