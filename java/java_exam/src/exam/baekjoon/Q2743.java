package exam.baekjoon;

import java.util.Iterator;
import java.util.Scanner;

public class Q2743 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		no. 27866
//		System.out.println("단어를 입력해주세요: ");
//		String inputWord = sc.nextLine();
//		System.out.println("숫자를 입력해주세요: ");
//		int findNum = sc.nextInt();
//		
//		System.out.println(inputWord.charAt(findNum));

//		no. 2743
//		System.out.println("단어를 입력해주세요: ");
//		String inputword = sc.nextLine();
//		System.out.println(inputword.length());

//		no. 11654
//		System.out.println("문자 한자리를 입력해 주세요: ");
//		char str = sc.next().charAt(0);
//		System.out.println((int) str);

//		no. 11720
//		System.out.println("숫자를 입력해주세요: ");
//		String strNum = sc.nextLine();

		/*
		 * 하나 문자열을 자르고 정수로 변환해서 sum에 더하기를 문자열의 길이만큼 반복
		 */
//		int num = 0;
//		int sum = 0;
//		for (int i = 0; i < strNum.length(); i++) {
//			num = Integer.parseInt(strNum.charAt(i)+"");
//			sum += num;
//		}
//		System.out.println(sum);

//		no. 10809
//		문제 다시 읽어보기
		/*
		 * 입력 받은 영어단어를 
		 * a ~ z 까지 숫자로 출력
		 * 출력할 때는 각 알파벳이 몇 번째에 있는지 숫자로 출력하고
		 * 없는 단어는 -1로 출력
		 */
		System.out.println("영단어를 입력해주세요");
		String str1 = sc.nextLine();
		char[] alphabet = new char[26];
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char)(97 + i);
			if (str1.contains(alphabet[i] + "")) {
				System.out.print(str1.indexOf(alphabet[i]) + " ");
			} else {
				System.out.print(-1 + " ");
			}
		}

//		no. 1152
//		System.out.println("영문장을 입력하세요: ");
//		String str = sc.nextLine();
//		String[] strArray = str.split(" ");
//		System.out.println(strArray.length);

//		no. 2908
//		System.out.println("숫자를 입력하세요: ");
//		String strNum1 = sc.nextLine();
//		String strNum2 = sc.nextLine();
//
//		String[] numArray1 = strNum1.split("");
//		String[] numArray2 = strNum2.split("");
//
//		String concatNum1 = "";
//		String concatNum2 = "";
//		for (int i = numArray1.length - 1; i >= 0; i--) {
//
//			concatNum1 += Integer.parseInt(numArray1[i].charAt(0) + "");
//			concatNum2 += Integer.parseInt(numArray2[i].charAt(0) + "");
//		}
//		if (Integer.parseInt(concatNum1) > Integer.parseInt(concatNum2)) {
//			System.out.println(concatNum1);
//		} else {
//			System.out.println(concatNum2);
//		}

//		no. 181842
//		System.out.println("비교할 두 문자열을 입력해 주세요: ");
//		String str1 = sc.nextLine();
//		String str2 = sc.nextLine();
//		
//		if (str1.contains(str2)) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}

//		no. 181843
//		System.out.println("비교할 두 문자열을 입력해 주세요: ");
//		String str1 = sc.nextLine();
//		String str2 = sc.nextLine();
//		
//		if (str1.contains(str2)) {
//			System.out.println(1);
//		} else {
//			System.out.println(0);
//		}

//		no. 181845
//		System.out.println("정수를 입력하시오: ");
//		int num1 = sc.nextInt();
//		System.out.println(Integer.toString(num1));

//		no. 181848
//		System.out.println("정수를 입력하시오: ");
//		String str1 = sc.nextLine();
//		System.out.println(Integer.parseInt(str1));

//		no. 181847
//		System.out.println("정수를 입력하시오: ");
//		String str1 = sc.nextLine();
//		System.out.println(Integer.parseInt(str1));

//		no. 181849
//		System.out.println("정수를 입력하시오: ");
//		String str1 = sc.nextLine();
//		String[] strArray = str1.split("");
//		int sum = 0;
//		for (int i = 0; i < strArray.length; i++) {
//			sum += Integer.parseInt(strArray[i]);
//		}
//		System.out.println(sum);

//		no. 181876
//		System.out.println("영어 대소문자를 섞어서 입력하세요: ");
//		String str1 = sc.nextLine();
//		System.out.println(str1.toLowerCase());

//		no. 181878
//		System.out.println("영어 대소문자를 섞어서 입력하세요: ");
//		String str1 = sc.nextLine();
//		String str2 = sc.nextLine();
//		if (str1.toLowerCase().contains(str2.toLowerCase())) {
//			System.out.println(1);
//		} else {
//			System.out.println(0);
//		}

//		no. 181875
//		String str1 = sc.nextLine();
//		String[] strArray = str1.split(" ");
//
//		for (int i = 0; i < strArray.length; i++) {
//			if (i % 2 == 1) {
//				System.out.print(strArray[i].toUpperCase() + " ");
//			} else {
//				System.out.print(strArray[i].toLowerCase() + " ");
//			}
//		}

	}
}
