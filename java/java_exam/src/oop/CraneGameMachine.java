package oop;

import java.util.Scanner;

public class CraneGameMachine {
	boolean insertCoin;
	int dolls;

	public void insertCoin() {
		Scanner sc = new Scanner(System.in);

		System.out.print("인형뽑기 게임기를 시작하시겠습니까? (o: 시작, x: 종료) : ");
		String yesOrNo = sc.next();

		if (yesOrNo.equals("o") && dolls > 0) {
			insertCoin = true;
		}
		if (insertCoin == true) {
			System.out.println("게임을 실행합니다\n");
			repeatGame();
		} else {
			System.out.println("게임을 실행하지 않습니다");
		}
	}

	public int doGame() {
		int success = 0;
		if (insertCoin) {
			int random = (int) (Math.random() * 2);
			if (random == 1) {
				success = 1;
			}
		} else {
			System.out.println("코인을 넣어주세요");
		}
		return success;
	}
	
	public void repeatGame() {
		for (int i = 0; i < dolls; i++) {
			doGame();
			if (doGame() == 1) {
				System.out.println("인형을 뽑았습니다");
			} else {
				System.out.println("인형을 뽑지 못했습니다");
			}
		}
	}

}
