package exam;

public class ArtithmaticQuiz4 {
	public static void main(String[] args) {
		int subjectA = 100;
		int subjectB = 80;
		int subjectC = 95;
		int subjectD = 68;

		int totalScore = 0;
		double average = 0;
		double score = 0;   

		totalScore = subjectA + subjectB + subjectC + subjectD;
		average = totalScore / 4d;
		score = Math.ceil((average - 55) * 10) / 100;
//		if (average >= 95) {
//			score = 4.5;
//		} else if (average >= 90) {
//			score = 4;
//		} else if (average >= 85) {
//			score = 3.5;
//		} else if (average >= 80) {
//			score = 3;
//		} else if (average >= 75) {
//			score = 2.5;
//		} else {
//			score = 2;
//		}
		System.out.println("총점: " + totalScore);
		System.out.println("평균: " + average);
		System.out.println("학점: " + score);
	}
}
