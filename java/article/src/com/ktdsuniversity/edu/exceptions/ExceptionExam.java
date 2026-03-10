package com.ktdsuniversity.edu.exceptions;

public class ExceptionExam {
	public static void nullExam(String str) {
		if (str != null && !str.isEmpty()) {
			System.out.println(str);
		}

	}

	public static void arrayIndexExam(String[] arr, int index) {
		if (arr != null && index >= 0 && index < arr.length) {
			System.out.println(arr[index]);
		}
	}

	public static void numberFormatExam(String str) {
		if (str == null) {
			System.out.println(0);
			return;
		}
		str = str.replace("_", "");

		if (str.matches("^[0-9]+${1, 10}")) {
			long tempNum = Long.parseLong(str);
			if (tempNum > Integer.MAX_VALUE) {
				tempNum = 0;
			}
			int num = (int) tempNum;
			System.out.println(num);
		}

	}

	public static void main(String[] args) {
//		nullExam("asd");
//		nullExam("  ");
//		nullExam("");
//		nullExam("123asd");
//		nullExam(null);
//
//		arrayIndexExam(new String[] { "a", "b" }, 0);
//		arrayIndexExam(new String[] { "a", "b" }, 1);
		//// arrayIndexExam(new String[] {"a", "b"}, 2); arrayIndexExam(new String[]
		/// {"a", "b"}, -1);
//		arrayIndexExam(null, -1);
//		arrayIndexExam(null, 0);
//		numberFormatExam("10");
//		numberFormatExam("1234");
//		numberFormatExam("30000000000");
//		numberFormatExam("30_000_000_000");
		numberFormatExam("str");
//		numberFormatExam(null);
		numberFormatExam("1.3323");
	}
}
