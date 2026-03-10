package homework;

public class ScoreCalculator {

	public static String computeGrade(int subjA, int subjB, int subjC, int subjD, int subjE) {
		int amount = subjA + subjB + subjC + subjD + subjE;
		double average = calcAverage(amount, 5);
		String grade = calcGrade(average);
		return grade;
	}

	private static double calcAverage(int amount, int i) {
		double average = Math.ceil((amount / i) * 100)/ 100;
		return average;
	}

	private static String calcGrade(double average) {
		if (average >= 90) {
			return "A";
		} else if (average >= 80) {
			return "B";
		} else if (average >= 70) {
			return "C";
		} else if (average >= 60) {
			return "D";
		} else {
			return "F";
		}
	}

	public static void main(String[] args) {
		String grade = computeGrade(100, 95, 95, 100, 100);
		System.out.println(grade);
	}
}
