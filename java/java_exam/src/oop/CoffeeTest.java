package oop;

import java.util.Scanner;

public class CoffeeTest {
	public static void main(String[] arg) {
		Coffee ice = new Coffee("아이스 티", 2_500);
		Coffee hot = new Coffee("밤 라떼", 2_000);
		Coffee tea = new Coffee("루이보스", 2_000);

		CoffeeShopArray cs = new CoffeeShopArray(ice, hot, tea);
		
		int price = cs.orderCoffee(1, 3);
		System.out.println(price);
		
		price = cs.orderCoffee(2, 3);
		System.out.println(price);
		
		price = cs.orderCoffee(0, 3);
		System.out.println(price);
		
		price = cs.orderCoffee(4, 3);
		System.out.println(price);
		
		
//		Scanner sc = new Scanner(System.in);
//
//		
//		System.out.print("차가운 음료는 1번, 뜨거운 음료는 2번:  ");
//
//		int iceOrHot = sc.nextInt();
//		System.out.print("몇 잔 주문하시겠습니까? : ");
//		int coffeeCount = sc.nextInt();
//		int price = cs.orderCoffee(iceOrHot, coffeeCount);
//		System.out.println("가격은 " + price + "원 입니다");
	}
}
