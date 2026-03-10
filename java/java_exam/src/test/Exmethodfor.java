package test;

public class Exmethodfor {
	
//	1번
	public static void oneToHundredSum () {
		int i;
		int sum = 0;
		
		for (i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.println(sum);
	}
	
//	2번
	public static void oneToHundredOddSum () {
		int i;
		int sum = 0;

		for (i = 1; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println(sum);
	}
	
//	3번
	public static void mulOfThreeAndFive () {
		int i;
		int sum = 0;
		
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0 || i % 5 ==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
//	4번
	public static void triangleStar () {
		int i;
		int j;
		
		for (i = 0; i < 5; i++) {
			for (j = 0; j <5; j++) {
				if (i - j >= 0) {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		oneToHundredSum();
		oneToHundredOddSum();
		mulOfThreeAndFive();
		triangleStar();
		
		
//		int i;
//		int j;
//		int sum = 0;

//		1번
//		for (i = 1; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println(sum);

//		2번
//		sum = 0;
//		for (i = 1; i <= 100; i += 2) {
//			sum += i;
//		}
//		System.out.println(sum);

//		3번
//		sum = 0;
		
//		for (i = 1; i <= 100; i++) {
//			if (i % 3 == 0 || i % 5 ==0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
//		4번
//		for (i = 0; i < 5; i++) {
//			for (j = 0; j <5; j++) {
//				if (i - j >= 0) {
//					System.out.print(" * ");
//				}
//			}
//			System.out.println();
//		}
	}
}
