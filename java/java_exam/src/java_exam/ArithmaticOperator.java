package java_exam;

public class ArithmaticOperator {

	public static void main(String[] args) {

		int n = 0;
		System.out.println(n);
		n++; // n = n + 1, n += 1
		System.out.println(n);
		System.out.println(n++); // 후 연산 | 출력 후 연산
		System.out.println(n);

		n = 0;
		System.out.println(n);
		n--;
		System.out.println(n);
		System.out.println(--n); // 선 연산 | 연산 후 출력
		System.out.println(n);

//		연산 예상 결과 11 11 12 11 11 10
		int m = 10;
		System.out.println(++m);
		System.out.println(m++);
		System.out.println(m);
		System.out.println(--m);
		System.out.println(m--);
		System.out.println(m);

		
	}
}
