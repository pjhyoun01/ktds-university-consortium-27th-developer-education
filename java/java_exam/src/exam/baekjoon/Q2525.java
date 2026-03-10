package exam.baekjoon;

import java.util.Scanner;

public class Q2525 {
	public static void main(String[] args) {
		/**
		 * (hour)시간과 (minuts)분이 주어지고
		 * 요리 시간 (분)이 주어질 때
		 * 시간 분 + 요리 시간 = ?
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 시간을 입력해주세요 : ");
		int hour = sc.nextInt();
		int minute = sc.nextInt();

		System.out.print("조리 시간을 입력해주세요 : ");
		int cookingTime = sc.nextInt();
		
		int cookingHour = cookingTime / 60;
		int cookingMinuts = cookingTime % 60;
		
		hour = hour + cookingHour;
		minute = minute + cookingMinuts;
		
		if (minute >= 60) {
			hour = hour + (minute / 60);
			minute = minute % 60; 
			if (hour >= 24) {
				hour = hour - 24;
			}
		}
		System.out.println("조리 예상 시간은 " + hour + "시 " + minute + "분 입니다");
		
	}
}
