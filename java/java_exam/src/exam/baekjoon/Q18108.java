package exam.baekjoon;

import java.util.Scanner;

public class Q18108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("불교 연도를 입력하시오 :");
		int BEYear = sc.nextInt();
		
		int ADYear = BEYear - 544;
		System.out.println("불기 연도 " + BEYear + "는 서기 연도fh " + ADYear + "입니다");
		
		
	}
}
