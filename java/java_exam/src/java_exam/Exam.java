package java_exam;

import java.math.BigDecimal;

public class Exam {
	public static void main(String[] args) {
		char c = '가';
		System.out.println((int) c);
		c = 'ㄱ';
		System.out.println((int) c);
		
		c = '한';
		System.out.println((int) c);
		System.out.println((char) c);
		
		BigDecimal num1 = new BigDecimal("1.123456789012345678901");
		BigDecimal num2 = new BigDecimal("1.1");
		System.out.println(num1);
		System.out.println("소수점 자리수: " + num1.scale());
		
		System.out.println("더하기: " + num1.add(num2));
		System.out.println("나누기: " + num1.divide(num2));
//		if (num > 2) {
//			
//		}
				
	}
}
