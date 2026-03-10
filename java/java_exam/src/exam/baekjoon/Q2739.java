package exam.baekjoon;

import java.util.Scanner;

public class Q2739 {
	public static void main(String[] args) {
		int inputNum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		inputNum = sc.nextInt();
		
		int i = 1;
		while (i <= 9) {
			System.out.println(inputNum + " * " + i + " = " + (inputNum * i));
			i++;
		}
	}
}
