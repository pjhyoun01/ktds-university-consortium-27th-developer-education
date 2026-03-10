package java_exam;

public class MethodExam {
	
//	프로그램이 실행될 수 있는 메소드를 생성한다
	
	 
	
	
	public static void printName(String name) {
		System.out.println("제 이름은 " + name + "입니다");
		System.out.println("제 이름은 " + name.length() + "입니다");
	}
	
	public static void printAutoName() {
		System.out.println("제 이름은 박재현입니다");
	}
	
	private static int computeAdd(int num1, int num2) {
		int computeResult = num1 + num2;
		return computeResult;
	}
	
	public static void main(String[] args) {
		
		int resultAdd = computeAdd(19, 21);
		System.out.println(resultAdd);
		
//		printName("박재현");
//		printName("땡땡땡");
//		printName("000");
//		
//		printAutoName();
//		printAutoName();
//		printAutoName();
	}
	
}
