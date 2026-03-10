package exam.baekjoon;

import java.util.Scanner;

public class Q2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("별을 출력할 줄의 개수를 입력하세요 : ");
		int starCount = sc.nextInt();

//		int starCount = 5;
//		int i = 1;
//		while (i <= starCount) {
////			i의 개수 만큼 * 출력
//			System.out.println("*");
//		}
		int i = 0;
		int j = 0;
//		for (i = 0; i < starCount; i++) {
//			for (j = 0; j < starCount; j++) {
//				if (i - j >= 0) {
//					System.out.print(" * ");
//				}
//			}
//			System.out.println();
//		}

		while (i < starCount) {
			while (j < starCount) {
				if (i - j >= 0) {
					System.out.print(" * ");
				}
				j++;
			}
			System.out.println();
			i++;
			j = 0;
		}

	}
}
