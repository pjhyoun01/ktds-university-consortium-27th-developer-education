package oop;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.java = 96;
		student.cpp = 62;
		student.csharp = 87;
		student.python = 98;
		
		
		
		System.out.println(student.getSumAllScores());
		System.out.println(student.getAverage());
		System.out.println(student.getCourseCredit());
		System.out.println(student.getABCD());
		
	}
}
