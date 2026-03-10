package com.ktdsuniversity.edu.exceptions;

public class TryExam {
	public static void handlesException() {
		try {
			Class.forName("asdasd ");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("예외 발생" + cnfe.getMessage());
		}
	}

	public static void numberFormatExam(String str) {
		if (str != null) {
			int value = 0;
			try {
				System.out.println("변환 전");
				value = Integer.parseInt(str);
				System.out.println("변환 후");

			} catch (NumberFormatException nfe) {
				System.out.println(nfe.getMessage());
				nfe.printStackTrace();
			}
			System.out.println(value);
		}
	}

	public static void main(String[] args) {
//		numberFormatExam("100000");
//		numberFormatExam("12344565671234234");
//		numberFormatExam("asdfazsc");
//		numberFormatExam("12344565");
		handlesException();
	}
}
