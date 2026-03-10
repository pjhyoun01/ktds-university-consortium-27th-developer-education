package com.ktdsuniversity.edu.array;

import java.util.Scanner;

public class ArrayExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numArray = null;
//		int[] numArray1;

		int num = sc.nextInt();
		int num2 = sc.nextInt();

		for (int i = 0; i < num; i++) {
			numArray[i] = (int) (Math.random() * 10 + 1);
			if (numArray[i] > num2) {
				System.out.println(numArray[i]);
			}
		}

	}
}
