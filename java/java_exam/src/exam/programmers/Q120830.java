package exam.programmers;

import java.util.Scanner;

public class Q120830 {
	public static void main(String[] args) {
		int skewerCount = 0;
		int drinkCount = 0;
		int serviceDrink = 0;

		final int skewerPrice = 12_000;
		final int drinkPrice = 2_000;

		int totalSkewerPrice;
		int totalDrinkPrice;
		int totalPrice;

		Scanner sc = new Scanner(System.in);
		System.out.print("양꼬치는 몇 인분 인지 입력하세요 : ");
		skewerCount = sc.nextInt();
		System.out.print("음료수는 몇 개 인지 입력하세요 : ");
		drinkCount = sc.nextInt();
		/**
		 * 10인분에 음료수 1개 무료 10인분 이상이고 음료수가 0이 아닐 때 
		 * drinkCount -= skewerCount / 10 
		 * 10인분 이상이고 음료수가 0일 때 
		 * 10인분 이하이고 음료수가 0이 아닐 때 
		 * 10인분 이하이고 음료수가 0일 때
		 */
		if (skewerCount >= 10 && drinkCount != 0) {
			serviceDrink = (skewerCount / 10);
			drinkCount -= serviceDrink;
		}
		totalSkewerPrice = skewerPrice * skewerCount;
		totalDrinkPrice = drinkPrice * drinkCount;
		totalPrice = totalSkewerPrice + totalDrinkPrice;
		System.out.println("양꼬치 " + skewerCount + "인분이라서 서비스 음료는 "  + serviceDrink + "잔입니다");
		System.out.println("총 가격은 " + totalPrice + "원 입니다");
	}
}
