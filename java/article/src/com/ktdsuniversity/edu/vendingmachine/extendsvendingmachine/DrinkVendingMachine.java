package com.ktdsuniversity.edu.vendingmachine.extendsvendingmachine;

public class DrinkVendingMachine {

	private Drink[] drinks;
	private int custMoney;
	private int safeMoney;

	public DrinkVendingMachine(Drink drink1, Drink drink2, Drink drink3, Drink drink4) {
		this.drinks = new Drink[4];
		this.drinks[0] = drink1;
		this.drinks[1] = drink2;
		this.drinks[2] = drink3;
		this.drinks[3] = drink4;
	}

	public Drink[] getDrinks() {
		return this.drinks;
	}

	public int getSafeMoney() {
		return safeMoney;
	}

	public void setSafeMoney(int safeMoney) {
		this.safeMoney = safeMoney;
	}

	public int pressDrinkButton(int drinkNumber, int pressCount, int inputMoney) {
		if (drinkNumber < 0 || drinkNumber >= this.drinks.length) {
			System.out.println("없는 메뉴입니다 반환금: " + inputMoney);
			return inputMoney;
		}
		// 돈이 부족할 때
		if (inputMoney < (drinks[drinkNumber].getPrice() * pressCount)) {
			System.out.println("돈 부족");
			return inputMoney;
		}

		// 0 1 2 3
		Drink pressedDrink = this.drinks[drinkNumber];

		if (pressedDrink.getStock() == 0) {
			System.out.println("품절 되었습니다!");
			return 0;
		} else if (pressedDrink.getStock() < pressCount) {
			pressCount = pressedDrink.getStock();
		}

		int stock = pressedDrink.getStock();
		stock -= pressCount;
		pressedDrink.setStock(stock);
		inputMoney -= drinks[drinkNumber].getPrice() * pressCount;
		this.safeMoney += drinks[drinkNumber].getPrice() * pressCount;
		this.custMoney = inputMoney;

		System.out.println("자판기 잔돈: " + this.safeMoney + "원");
		System.out.println("반환금: " + this.custMoney + "원");
//		pressedDrink.stock -= pressCount;
		return pressedDrink.getPrice() * pressCount;
	}

	public void fillDrink(int drinkNumber, int quantity) {
		if (drinkNumber < 0 || drinkNumber >= this.drinks.length) {
			return;
		}

		// 0 1 2 3
		Drink pressedDrink = this.drinks[drinkNumber];

		int stock = pressedDrink.getStock();
		stock += quantity;
		pressedDrink.setStock(stock);
	}

	public void printAllDrinkInfo() {
		for (int i = 0; i < this.drinks.length; i++) {
			System.out.println(this.drinks[i].getName() + " " + this.drinks[i].getStock() + "개 남았습니다.");
		}
	}

}