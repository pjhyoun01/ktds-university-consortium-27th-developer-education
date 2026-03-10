package java_exam;

public class ArryExam {
	public static void main(String[] args) {
//		java 공식 배열 선언
//		int[] scoreArray = new int[7];

		/*
		 * i는 배열의 길이 까지 반복 j는 i까지 반복 만약 score[i]가 score[j]가 일치 한다면 score[i]값을 다시 할당
		 */

		int[] lottoNums = new int[7];
//
		int count = 0; // 배열에 채워진 숫자의 개수.
		boolean existsNumber = false; // 새롭게 만든 숫자가 배열내에 존재하는지 여부.
		int randomNumber = 0; // 새롭게 만들 숫자 1 ~ 45중 하나.

		while (count < 7) { // 배열에 숫자가 7개가 채워질 때까지 반복.
			randomNumber = (int) (Math.random() * 45 + 1);
			existsNumber = false;

			// 새롭게 만든 숫자가 배열에 존재하는지 확인.
			for (int i = 0; i < count; i++) {
				if (lottoNums[i] == randomNumber) {
					existsNumber = true;
					break;
				}
			}
			// 새롭게 만든 숫자가 배열에 없다면, 배열에 추가한다.
			if (!existsNumber) {
				lottoNums[count] = randomNumber;
				count++; // 배열에 채운 숫자 하나 증가.
			}
		System.out.println(lottoNums[count]);
		}

//		for (int i = 0; i< scoreArray.length; i++) {
//			scoreArray[i] = (int) (Math.random() * 45 + 1);
//			
//			for (int j = 0; j < i; j++) {
//				if (scoreArray[i] == scoreArray[j]) {
//					i--;
//					break;
//				}
//			}
//			
//			System.out.println(scoreArray[i]);
//		}

	}
}
