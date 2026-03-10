package java_exam;

public class IfExam {
	public static void main(String[] args) {
		int randomNum = (int) (Math.random() * 100);
		System.out.println(randomNum);
		if (randomNum >= 10 && randomNum < 20) {
			System.out.println("10 범위의 숫자가 나왔습니다");

		} else if (randomNum >= 20 && randomNum < 30) {
			System.out.println("20 범위의 숫자가 나왔습니다");

		} else if (randomNum >= 30 && randomNum < 40) {
			System.out.println("30 범위의 숫자가 나왔습니다");

		} else if (randomNum >= 40 && randomNum < 50) {
			System.out.println("40 범위의 숫자가 나왔습니다");

		} else if (randomNum >= 50 && randomNum < 60) {
			System.out.println("50 범위의 숫자가 나왔습니다");

		} else {
			System.out.println("60 범위의 숫자가 나왔습니다");

		}

//		int radix = randomNum / 10 * 10;
//		System.out.println(radix + "범위의 숫자가 나왔습니다");

		randomNum = 78;
		if (randomNum >= 90) {
			System.out.println("90범위의 숫자입니다");
		} else if (randomNum >= 80) {
			System.out.println("80범위의 숫자입니다");
		} else if (randomNum >= 70) {
			System.out.println("70범위의 숫자입니다");
		} else if (randomNum >= 60) {
			System.out.println("60범위의 숫자입니다");
		} else if (randomNum >= 50) {
			System.out.println("50범위의 숫자입니다");
		} else if (randomNum >= 40) {
			System.out.println("40범위의 숫자입니다");
		}
	}
}
