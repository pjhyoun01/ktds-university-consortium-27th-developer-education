package exam.baekjoon;

import java.util.Scanner;

public class Q10998 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 A를 입력하시오 :");
		int numA = sc.nextInt();
		System.out.print("숫자 B를 입력하시오 :");
		int numB = sc.nextInt();

		int mul = numA * numB;
		System.out.println(numA + " * " + numB + " = " + mul);
	}
}
