package exam.baekjoon;

public class Q2480 {
	public static void main(String[] args) {
		int dice1 = (int) (Math.random() * 6) + 1;
		int dice2 = (int) (Math.random() * 6) + 1;
		int dice3 = (int) (Math.random() * 6) + 1;
		
		int prize = 0;
		
//		if (dice1 == dice2 && dice2 == dice3) {
//			prize = 10_000 + dice1* 1_000;
//		} else if (dice1 == dice2) {
//			prize = 1_000 + (dice1 * 100);
//		} else if (dice1 == dice3) {
//			prize = 1_000 + (dice1 * 100);
//		} else if (dice2 == dice3) {
//			prize = 1_000 + (dice2 * 100);
//		} else {
//		}
		
		if (dice1 == dice2 && dice2 == dice3) {
			prize = 10_000 + dice1* 1_000;
		} else if (dice1 == dice2 || dice1 == dice3 || dice2 == dice3) {
			int sameDice =  (dice1 == dice2) ? dice1 : dice3;
			prize = 1_000 + (sameDice * 100);
		} else {
//			가장 큰 값
			int maxDice = Math.max(dice1, Math.max(dice2, dice3));
			prize = maxDice * 100;
		}
		
		System.out.println("첫 번째 주사위: " + dice1);
		System.out.println("세 번째 주사위: " + dice2);
		System.out.println("두 번째 주사위: " + dice3);
		
		System.out.println("축하합니다 상금은 " + prize);
		
		
	}
}
