package exam;

public class Methodproblem {
	public static void main(String[] args) {
//		printSum(20);
//		printPrime(20);
//		printMax(20, 10);
//		printAge(10);
//		printAge(20);
		System.out.println(getFizzBuzz(15));
		getUniqueNumbers();
		System.out.println(getEvenOdd(4, 5));
		System.out.println(getEvenOdd(3, 5));
		System.out.println(getSumOfFive(1, 2, 3, 4, 5));
		System.out.println(getAverage(150, 3));
		System.out.println(getGrade(95));
		System.out.println(getGrade(85));
		System.out.println(getGrade(75));
//		System.out.println(nextChar('a'));
//		System.out.println(getCharacters('a', 'z'));
//		System.out.println(getLowerCaseAlpha('a', 25));
		System.out.println(convertUpperCase('a'));

	}

//	no. 1
	public static void printSum(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

//	no. 2
	public static void printPrime(int num) {
		boolean isPrime = false;
		for (int i = 2; i <= num; i++) {
			isPrime = false;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					isPrime = true;
					break;
				}
			}
			if (isPrime) {
				System.out.print(i + "\t");
			}
		}
	}

//	no. 3
	public static void printMax(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
	}

//	no. 4
	public static void printAge(int age) {
		if (age > 19) {
			System.out.println("성인 입니다");
		} else {
			System.out.println("미성년자 입니다");
		}
	}

//	no. 5
	public static String getFizzBuzz(int ranNum) {
		if (ranNum % 3 == 0) {
			return "Fizz";
		} else if (ranNum % 5 == 0) {
			return "Buzz";
		} else if (ranNum % 3 == 0 && ranNum % 5 == 0) {
			return "FizzBuzz";
		}
		return ranNum + "";
	}

//	no. 6
	public static void getUniqueNumbers() {
		int[] ranNumArray = new int[7];
		for (int i = 0; i < ranNumArray.length; i++) {
			ranNumArray[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				if (ranNumArray[i] == ranNumArray[j]) {
					i--;
					break;
				}
			}

			System.out.println(ranNumArray[i]);
		}
	}

//	no. 7
	public static String getEvenOdd(int num1, int num2) {
		int mul = num1 * num2;
		if (mul % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}

//	no. 8
	public static int getSumOfFive(int num1, int num2, int num3, int num4, int num5) {
		int sum = num1 + num2 + num3 + num4 + num5;
		return sum;
	}

//	no. 9
	public static double getAverage(int score, int count) {
		double avrage = Math.round(score / count * 1000) / 1000;
		return avrage;
	}

//	no. 10
	public static String getGrade(int score) {
		if (score >= 95) {
			return "A";
		} else if (score >= 85) {
			return "B";
		} else if (score >= 75) {
			return "C";
		} else if (score >= 65) {
			return "D";
		} else {
			return "F";
		}
	}

//	no. 11
	public static char nextChar(char str) {
		str += 1;

		return str;
	}

//	no. 12
	private static String getCharacters(char str1, char str2) {
		int numChar1 = str1;
		int numChar2 = str2;

		char[] array = new char[numChar2 - numChar1];
		String arrayString = null;

		for (int i = 0; i < numChar2 - numChar1; i++) {
			array[i] = (char) (numChar1 + i);
			arrayString = String.valueOf(array);
		}
		return arrayString;
	}

//	no. 13
	private static char getLowerCaseAlpha(char str, int num) {
		if (num > 25 || num < 0) {
			return ' ';
		}
		str += num;
		return str;

	}

//	no. 14
	private static char convertUpperCase(char str) {
		str -= 32;
		return str;
	}
}
