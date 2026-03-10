package exam.baekjoon;

import java.util.Scanner;

public class Q2439 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("별을 출력할 줄의 개수를 입력하세요 : ");
//		int starCount = sc.nextInt();
		int starCount = 5;
		
		int i = 0;
		int j = 0;
		
		while (i < starCount) {
			while (j < starCount) {
				if (i + j >= 4) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
				j++;
			}
			System.out.println();
			i++;
			j = 0;
		}
	}
}
