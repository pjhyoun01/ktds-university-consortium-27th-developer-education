package exam.baekjoon;

import java.util.Scanner;

public class Q2753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		연도를 입력받아 윤년인지 아닌지 출력
		System.out.print("연도를 입력하세요: ");
		
		int year = sc.nextInt();
		int isLeapYear = 0;
		
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			isLeapYear = 1;
		}
		System.out.println(isLeapYear);
	}
}
