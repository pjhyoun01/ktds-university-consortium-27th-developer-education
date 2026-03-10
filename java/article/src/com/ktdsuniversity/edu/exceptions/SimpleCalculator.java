package com.ktdsuniversity.edu.exceptions;

import com.ktdsuniversity.edu.exceptions.custom.DivideZeroException;
import com.ktdsuniversity.edu.exceptions.custom.NullOperatorException;

public class SimpleCalculator {
	/**
	 * 
	 * @param a        계산할 값
	 * @param b        계산할 값
	 * @param operator 연산자
	 * @return 계산 결과 반환
	 */
	public int calc(int a, int b, String operator) {
		if (operator == null) {
			throw new NullOperatorException("잘못된 연산자");
		}
		int result = 0;

		if (operator.equals("+")) {
			result = a + b;
		} else if (operator.equals("-")) {
			result = a - b;
		} else if (operator.equals("*")) {
			result = a * b;
		} else if (operator.equals("/")) {
			if (a == 0) {
				throw new DivideZeroException("잘못된 숫자");
			}
			if (b == 0) {
				throw new DivideZeroException("잘못된 숫자");
			}
			result = a / b;
		} else {
			throw new WrongThreadException("잘못된 연산자 입니다");
		}
		return result;
	}

	public static void main(String[] args) {
		SimpleCalculator calc = new SimpleCalculator();
		int result = 0;
		try {
			result = calc.calc(10, 0, "+");
//			System.out.println(noe.getMessage());	
//			System.out.println(dze.getMessage());	
//			System.out.println(wte.getMessage());	
		} catch (NullOperatorException noe) {
			System.out.println("연산자가 없습니다");
		} catch (DivideZeroException dze) {
			System.out.println("0으로 나눌 수 없습니다");
		} catch (WrongThreadException wte) {
			System.out.println("지원하지 않는 연산자입니다");
		}
		System.out.println(result);
		try {
			result = calc.calc(10, 0, "-");
		} catch (NullOperatorException noe) {
			System.out.println("연산자가 없습니다");
		} catch (DivideZeroException dze) {
			System.out.println("0으로 나눌 수 없습니다");
		} catch (WrongThreadException wte) {
			System.out.println("지원하지 않는 연산자입니다");
		}
		System.out.println(result);
		try {
			result = calc.calc(10, 0, "*");
		} catch (NullOperatorException noe) {
			System.out.println("연산자가 없습니다");
		} catch (DivideZeroException dze) {
			System.out.println("0으로 나눌 수 없습니다");
		} catch (WrongThreadException wte) {
			System.out.println("지원하지 않는 연산자입니다");
		}
		System.out.println(result);
		try {
			result = calc.calc(10, 0, "/");
		} catch (NullOperatorException noe) {
			System.out.println("연산자가 없습니다");
		} catch (DivideZeroException dze) {
			System.out.println("0으로 나눌 수 없습니다");
		} catch (WrongThreadException wte) {
			System.out.println("지원하지 않는 연산자입니다");
		}
		System.out.println(result);
		try {
			result = calc.calc(10, 0, null);
		} catch (NullOperatorException noe) {
			System.out.println("연산자가 없습니다");
		} catch (DivideZeroException dze) {
			System.out.println("0으로 나눌 수 없습니다");
		} catch (WrongThreadException wte) {
			System.out.println("지원하지 않는 연산자입니다");
		}
		System.out.println(result);

	}
}
