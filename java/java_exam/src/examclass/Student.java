package examclass;

import java.util.Scanner;

public class Student {
	int java;
	int python;
	int cpp;
	int csharp;
	
	public int getSumAllScores() {
		int totalSum = java + python + cpp + csharp; 
		return totalSum;
	}
	
	public double getAverage() {
		double average = getSumAllScores() / 4 * 100;
//		average = Math.ceil(average * 100) / 100;
		return average / 100;
	}
	
	public double getCourseCredit() {
		double courseCredit = (getAverage() - 55) / 10.0 * 100;
		return courseCredit / 100.0;
	}
	
	public String getABCD() {
		double grade = getCourseCredit();
		String ABCD = null;
		if(grade > 4.0) {
			ABCD = "A+";
		} else if (grade > 3.5) {
			ABCD = "A";
		} else if (grade > 3.0) {
			ABCD = "B+";
		} else if (grade >= 2.5) {
			ABCD = "B";
		} else if (grade >= 1.5) {
			ABCD = "E";
		} else if (grade >= 0.5) {
			ABCD = "D";
		} else {
			ABCD = "F";
		}
		return ABCD;
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		Scanner sc = new Scanner(System.in);
		st.java = sc.nextInt();
		st.python = sc.nextInt();
		st.cpp = sc.nextInt();
		st.csharp = sc.nextInt();
		System.out.println(st.getSumAllScores());
		System.out.println(st.getAverage());
		System.out.println(st.getCourseCredit());
		System.out.println(st.getABCD());
	}
	
}
