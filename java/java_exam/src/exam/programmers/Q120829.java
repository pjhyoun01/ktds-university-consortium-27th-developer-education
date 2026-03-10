package exam.programmers;

import java.util.Scanner;

public class Q120829 {
	public static void main(String[] args) {
		int degree = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("각도를 입력해 주세요 (0 ~ 180) : ");
		int angle = sc.nextInt();

		while (!(angle >= 0 && angle <= 180)) {
			System.out.println("범위를 벗어났습니다");
			System.out.print("각도를 다시 입력해 주세요 (0 ~ 180) : ");
			angle = sc.nextInt();
		}

		if (angle > 0 && angle < 90) {
			degree = 1;
		} else if (angle == 90) {
			degree = 2;
		} else if (angle > 90 && angle < 180) {
			degree = 3;
		} else {
			degree = 4;
		}
		System.out.println(degree);
	}
}
