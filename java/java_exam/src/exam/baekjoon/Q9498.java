package exam.baekjoon;

import java.util.Scanner;

public class Q9498 {

	public void gradeCalculate() {
		Scanner sc = new Scanner(System.in);

		System.out.print("성적을 입력해 주세요: ");
		int score = sc.nextInt();

		String gradeABCDF = null;
		if (score >= 90) {
			gradeABCDF = "A";
		} else if (score >= 80) {
			gradeABCDF = "B";
		} else if (score >= 70) {
			gradeABCDF = "C";
		} else if (score >= 60) {
			gradeABCDF = "D";
		} else {
			gradeABCDF = "F";
		}

		System.out.println("학점: " + gradeABCDF);

	}

	public static void main(String[] args) {
		Q9498 q9498 = new Q9498();

		q9498.gradeCalculate();
	}
}
