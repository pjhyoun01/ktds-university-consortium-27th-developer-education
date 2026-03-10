package exam.baekjoon;

import java.util.Scanner;

public class Q8393 {
	public static void main(String[] args) {
		// !n을 출력
		int factorial = 0;
		int sum = 0; 
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 : ");
		factorial = sc.nextInt();
		
		int i = 1;
		while (i <= factorial) {
			sum += i;
			System.out.println(sum);
			i++;
		}
	}
}
