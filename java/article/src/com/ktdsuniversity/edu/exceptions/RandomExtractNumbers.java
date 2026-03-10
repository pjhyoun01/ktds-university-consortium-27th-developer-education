package com.ktdsuniversity.edu.exceptions;

public class RandomExtractNumbers {
	private String[] numbers;

	public RandomExtractNumbers() {
		this.numbers = new String[100];
		int index = 0;
		for (int i = 0; i < 10; i++) {
			index = (int) (Math.random() * this.numbers.length);
			this.numbers[index] = (int) (Math.random() * 1_000_000) + "";
		}
		for (int i = 0; i < 10; i++) {
			index = (int) (Math.random() * this.numbers.length);
			this.numbers[index] = (char) ((int) (Math.random() * 122) + 97) + "";
		}
	}

	public void printNumber(int index) {
//		for (int i = 0; i < this.numbers.length; i++) {
//			try {
//				Long.parseLong(this.numbers[i]);
//				System.out.println("Index: " + i + ", Value: " +this.numbers[i]);
//			} catch (Exception e) {
//				System.out.println("Index: " + index + ", Not number format - Result: " + 0);
//			}
		
		if (index >= 0 && index < this.numbers.length) {

			if (this.numbers[index] != null && this.numbers[index].matches("^[0-9]+")) {
				System.out.println("Index: " + index + ", Value: " + this.numbers[index]);
			} else {
				System.out.println("Index: " + index + ", Not number format - Result: " + 0);
			}

		} else {
			System.out.println("not found index");
			return;
		}
	}

	public static void main(String[] args) {
		RandomExtractNumbers ren = new RandomExtractNumbers();
		int index = 0;
		for (int i = 0; i < 200; i++) {
			index = (int) (Math.random() * 100);
			ren.printNumber(index);
		}
	}

}
