package com.ktdsuniversity.edu.vendingmachine.machine;

import com.ktdsuniversity.edu.vendingmachine.item.Drink;

public class DrinkMachine {

	Drink[] drinksArray;

	public DrinkMachine(Drink bacchus, Drink monster, Drink hotsix, Drink milkiss) {
		this.drinksArray = new Drink[4];

		this.drinksArray[0] = bacchus;
		this.drinksArray[1] = monster;
		this.drinksArray[2] = hotsix;
		this.drinksArray[3] = milkiss;
	}

	public Drink[] getDrinksArray() {
		return drinksArray;
	}

	public void setDrinksArray(Drink[] drinksArray) {
		this.drinksArray = drinksArray;
	}

	public void orderDrink(int menuNum, int quantity) {

		Drink selected = null;
		if (menuNum == 1)
			selected = this.drinksArray[0];
		else if (menuNum == 2)
			selected = this.drinksArray[1];
		else if (menuNum == 3)
			selected = this.drinksArray[2];
		else if (menuNum == 4)
			selected = this.drinksArray[3];

		if (selected != null) {
			if (selected.getQuantity() >= quantity) {
				selected.setQuantity(selected.getQuantity() - quantity);
				int totalPrice = selected.getPrice() * quantity;
				System.out.println(selected.getName() + " " + quantity + "개의 가격은 " + totalPrice + "원입니다.");
			} else {
				System.out.println("재고가 부족합니다. (현재 재고: " + selected.getQuantity() + ")");
			}
		}
		printQuantity();
	}

	public void warehousingDrink(int menuNum, int quantity) {
		int warehousingNum = menuNum;
		int warehousingQuantity = quantity;

		if (warehousingNum == 1) {
			this.drinksArray[0].setQuantity(this.drinksArray[0].getQuantity() + warehousingQuantity);
			System.out.println(this.drinksArray[0].getName() + " 재고 추가 완료");
		} else if (warehousingNum == 2) {
			this.drinksArray[1].setQuantity(this.drinksArray[1].getQuantity() + warehousingQuantity);
			System.out.println(this.drinksArray[1].getName() + " 재고 추가 완료");
		} else if (warehousingNum == 3) {
			this.drinksArray[2].setQuantity(this.drinksArray[2].getQuantity() + warehousingQuantity);
			System.out.println(this.drinksArray[2].getName() + " 재고 추가 완료");
		} else if (warehousingNum == 4) {
			this.drinksArray[3].setQuantity(this.drinksArray[3].getQuantity() + warehousingQuantity);
			System.out.println(this.drinksArray[3].getName() + " 재고 추가 완료");
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		printQuantity();
	}

	public void printQuantity() {
		System.out.println("\n[현재 재고 상태]");
		System.out.println(this.drinksArray[0].getName() + ": " + this.drinksArray[0].getQuantity());
		System.out.println(this.drinksArray[1].getName() + ": " + this.drinksArray[1].getQuantity());
		System.out.println(this.drinksArray[2].getName() + ": " + this.drinksArray[2].getQuantity());
		System.out.println(this.drinksArray[3].getName() + ": " + this.drinksArray[3].getQuantity() + "\n");
	}

}