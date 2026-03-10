package com.ktdsuniversity.edu.constracts;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator(40, 20);
		
		System.out.println(calculator.compute(Calculator.ADD));
		System.out.println(calculator.compute(Calculator.SUB));
		System.out.println(calculator.compute(Calculator.MUL));
		System.out.println(calculator.compute(Calculator.DIV));
		System.out.println();
		
		System.out.println(calculator.compute(1));
		System.out.println(calculator.compute(2));
		System.out.println(calculator.compute(3));
		System.out.println(calculator.compute(4));
		System.out.println();
		
		System.out.println(calculator.compute2(Operator.ADD));
		System.out.println(calculator.compute2(Operator.SUB));
		System.out.println(calculator.compute2(Operator.MUL));
		System.out.println(calculator.compute2(Operator.DIV));
	}

}
