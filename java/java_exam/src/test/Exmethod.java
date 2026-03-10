package test;

public class Exmethod {
	public static int add(int num1, int num2) {
		
		int sum = num1 + num2;
		
		return sum ; 
	}
	
	public static void main(String[] args) {
		int sum = add(1, 2);
		System.out.println(sum);
	}
}
