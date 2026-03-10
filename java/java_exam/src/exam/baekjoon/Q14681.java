package exam.baekjoon;

import java.util.Scanner;

public class Q14681 {
	public static void main(String[] args) {
		int quadrant = 0;

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x > 0 && y > 0) {
			quadrant = 1;
		} else if (x < 0 && y > 0) {
			quadrant = 2;
		} else if (x < 0 && y < 0) {
			quadrant = 3;
		} else if (x > 0 && y < 0) {
			quadrant = 4;
		} else if (x == 0 && y == 0) {
			System.out.println("");
			return;
		} else if (x == 0) {
			System.out.println("y축 위에 있습니다");
			return;
		} else if (y == 0) {
			System.out.println("x축 위에 있습니다");
			return;
		}
		System.out.println("제" + quadrant + "사 분면에 속합니다");

	}
}
