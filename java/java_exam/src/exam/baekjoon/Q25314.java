package exam.baekjoon;

import java.util.Scanner;

public class Q25314 {
	public static void main(String[] args) {
//		long int num = 0;
		/**
		 * 4바이트를 입력하면 long int
		 * 8바이트를 입력하면 long long int
		 * (n / 4)바이트 만큼 long 문자 반복
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 바이트 인지 입력해 주세요 : ");
		int n = sc.nextInt();
		
		int i = 1;
		while (i <= (n / 4)) {
			System.out.print("long ");
			i++;
		}
		System.out.println("int");
		
	}
}
