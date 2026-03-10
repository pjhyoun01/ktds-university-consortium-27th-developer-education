package com.ktdsuniversity.edu.restaurant;

import java.util.List;

import com.ktdsuniversity.edu.restaurant.exceptions.DeficientAmountException;
import com.ktdsuniversity.edu.restaurant.exceptions.DrunkenException;
import com.ktdsuniversity.edu.restaurant.exceptions.FullException;
import com.ktdsuniversity.edu.restaurant.exceptions.WrongOrderQuantityException;

public class Restaurant {
	private int hungerLevelPerRest;
	private double drunkLevelPerRest;
//	private Menu[] menus;
	private List<Menu> menus;

	public Restaurant(int hungerLevelPerRest, double drunkLevelPerRest, List<Menu> menus) {
		this.hungerLevelPerRest = hungerLevelPerRest;
		this.drunkLevelPerRest = drunkLevelPerRest;
		this.menus = menus;
	}

	public void judgeOrder(Customer cust, Menu menu, int quantity) {
		if (quantity <= 0) {
			throw new WrongOrderQuantityException("주문 수량이 잘못되었습니다");
		}

		int canOrderQuantity = quantity;

		if (cust.getWallet() < menu.getPrice() * canOrderQuantity) {
			canOrderQuantity = cust.getWallet() / menu.getPrice();
			if (canOrderQuantity > 0 && menu.getIsFood() == FoodType.FOOD) {
				System.out.println("돈이 부족하여 " + menu.getName() + " " + canOrderQuantity + "개만 주문하였습니다.");
			} else if (canOrderQuantity > 0 && menu.getIsFood() == FoodType.DRINK) {
				System.out.println("돈이 부족하여 " + menu.getName() + " " + canOrderQuantity + "병만 주문하였습니다.");
			}
			throw new DeficientAmountException("돈이 부족합니다\n");
		}

		if (menu.getIsFood() == FoodType.FOOD) {
			int canTake = hungerLevelPerRest - cust.getCurrentHungerLevel();
			int requested = menu.getWeightPerMenu() * canOrderQuantity;
			if (requested > canTake) {
				canOrderQuantity = canTake / menu.getWeightPerMenu();
				if (canOrderQuantity > 0) {
					throw new FullException("식당 배부름 기준에 따라 " + canOrderQuantity + "개만 주문 했습니다.\n");
				} else {
					throw new FullException("식당 배부름 기준을 초과 하여 " + menu.getName() + "을/를 주문하지 못했습니다.\n");
				}
			}
			cust.increaseHunger(menu.getWeightPerMenu() * canOrderQuantity);
		} else {
			double oneBac = cust.calcBAC(menu);
			double canDrinkBac = drunkLevelPerRest - cust.getCurrentDrunkLevel();
			if (oneBac * canOrderQuantity > canDrinkBac) {
				canOrderQuantity = (int) (canDrinkBac / oneBac);
				if (canOrderQuantity > 0) {
					throw new DrunkenException("혈중 알코올 농도 기준에 따라 " + canOrderQuantity + "병만 주문 했습니다.\n");
				} else {
					throw new DrunkenException("식당 혈중 알코올 농도 기준을 초과 하여 " + menu.getName() + "을/를 주문하지 못했습니다.\n");
				}
			}
			cust.increaseDrunk(oneBac * canOrderQuantity);
		}
		if (canOrderQuantity > 0) {
			cust.setWallet(cust.getWallet() - (menu.getPrice() * canOrderQuantity));
			System.out.println(menu.getName() + " " + canOrderQuantity + "개 주문 완료");
			System.out.println();
		}
	}

	public void printMenuAndDrink() {
		System.out.println("-------- 메뉴 --------");
		for (int i = 0; i < this.menus.size(); i++) {
			System.out.print((i + 1) + ". " + this.menus.get(i).getName() + "   \t");
			if (this.menus.get(i).getIsFood() == FoodType.FOOD) {
				System.out.println(this.menus.get(i).getWeightPerMenu() + "g");
			} else {
				System.out.println(this.menus.get(i).getWeightPerMenu() + "ml " + this.menus.get(i).getPercentagePerDrink() + "%");
			}
		}
		System.out.println();
	}
}