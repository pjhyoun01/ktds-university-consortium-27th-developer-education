package com.ktds.edu.fp.basic.calc;

public class Test {
	public static void main(String[] args) {
		Calculator c = new Calculator();

		int result = c.calc2(1, 2, (a, b) -> a + b);

		System.out.println(result);
		System.out.println();

		result = c.calc2(1, 2, (a, b) -> (int) Math.pow(a, b));
		System.out.println(result);
		System.out.println();
		
		result = c.calc2(1, 2, (a, b) -> Math.max(a, b));
		System.out.println(result);
		System.out.println();
		
		result = c.calc2(1, 2, (a, b) -> Math.min(a, b));
		System.out.println(result);
		System.out.println();
		//a가 b의 배수라면
		result = c.calc2(1, 2, (a, b) -> {
			if (a % b == 0) {
				return 0;
			} else {
				return 1;}});
		System.out.println(result);
		System.out.println();
	}
}
