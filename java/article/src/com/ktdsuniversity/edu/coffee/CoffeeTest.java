package com.ktdsuniversity.edu.coffee;

import com.ktdsuniversity.edu.coffee.coffee.Coffee;
import com.ktdsuniversity.edu.coffee.shop.CoffeeShop;
//import com.ktdsuniversity.edu.coffee.shop.CoffeeShopArray;
import com.ktdsuniversity.edu.coffee.shop.CoffeeType;

public class CoffeeTest {
	public static void main(String[] arg) {
		Coffee ice = new Coffee(CoffeeType.ICECOFFEE, 2_500, 100);
		Coffee hot = new Coffee(CoffeeType.HOTCOFFEE, 2_000, 3);
//		Coffee tea = new Coffee("루이보스", 2_000, 30);

		CoffeeShop cs = new CoffeeShop(ice, hot);
		CoffeeShop cs2 = new CoffeeShop();

		int price = cs.orderCoffee(1, 3);
		System.out.println(price);
		System.out.println();
		
		
		System.out.println(cs.orderCoffee());

		price = cs.orderCoffee(1, 4);
		System.out.println(price);
		System.out.println();

		price = cs.orderCoffee(2, 95);
		System.out.println(price);
		System.out.println();

		price = cs.orderCoffee(2, 110);
		System.out.println(price);
		System.out.println();

		price = cs.orderCoffee(0, 3);
		System.out.println(price);
		System.out.println();

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
