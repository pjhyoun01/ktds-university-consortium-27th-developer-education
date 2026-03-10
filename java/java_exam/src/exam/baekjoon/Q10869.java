package exam.baekjoon;

import java.util.Scanner;

public class Q10869 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 A를 입력하시오 :");
		int numA = sc.nextInt();
		System.out.print("숫자 B를 입력하시오 :");
		int numB = sc.nextInt();
		
		int add = numA + numB;
		int sub = numA - numB;
		double div = (double)numA / numB;
		int mul = numA * numB;
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(div);
		System.out.println(mul);
	}
}
