package exam.programmers;

import java.time.LocalDate;
import java.util.Scanner;

public class Q120820 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		LocalDate now = LocalDate.now();
		int year = now.getYear();
		
		int bornYear = year - age - 1;
		
		System.out.println(bornYear);
		
	}
}
