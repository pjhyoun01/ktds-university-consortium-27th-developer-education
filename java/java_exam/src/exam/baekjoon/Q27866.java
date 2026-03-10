package exam.baekjoon;

import java.util.Scanner;

public class Q27866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력해주세요: ");
		String inputWord = sc.nextLine();
		System.out.println("숫자를 입력해주세요: ");
		int findNum = sc.nextInt();
		
		System.out.println(inputWord.charAt(findNum));
		
	}
}
