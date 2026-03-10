package exam.baekjoon;

import java.util.Scanner;

public class Q2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시간과 분을 입력해주세요: ");
		int hour = sc.nextInt();
		int minute = sc.nextInt();
/**
 * 시간 분
 * 입력 받은 분이 45분 미만인 경우
 * 입력 받은 시간이 00시 45분 미만인 경우
 * 
 */
		if (minute < 45) {
			minute = minute + 15;
			hour -= 1; 
			if (hour == 0 && minute < 45) {
				hour = 23;
			}
		} else {
			minute -= 45;
		}
		
		System.out.println(hour + "시 " + minute + "분");
	}
}
