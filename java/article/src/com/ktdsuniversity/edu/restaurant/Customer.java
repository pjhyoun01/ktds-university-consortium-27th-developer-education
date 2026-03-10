package com.ktdsuniversity.edu.restaurant;

public class Customer {
	private int weight;
	private int wallet;
	private boolean isMan; // true: 남, false: 여
	private int currentHungerLevel;
	private double currentDrunkLevel;
	private int maxHungerCapacity;

	public Customer(int weight, int wallet, boolean isMan) {
		this.weight = weight;
		this.wallet = wallet;
		this.isMan = isMan;
		this.maxHungerCapacity = calcMaxHunger();
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWallet() {
		return wallet;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}

	public boolean isMan() {
		return isMan;
	}

	public void setMan(boolean isMan) {
		this.isMan = isMan;
	}

	public int getCurrentHungerLevel() {
		return currentHungerLevel;
	}

	public void setCurrentHungerLevel(int currentHungerLevel) {
		this.currentHungerLevel = currentHungerLevel;
	}

	public double getCurrentDrunkLevel() {
		return currentDrunkLevel;
	}

	public void setCurrentDrunkLevel(double currentDrunkLevel) {
		this.currentDrunkLevel = currentDrunkLevel;
	}

	public int getMaxHungerCapacity() {
		return maxHungerCapacity;
	}

	public void setMaxHungerCapacity(int maxHungerCapacity) {
		this.maxHungerCapacity = maxHungerCapacity;
	}

	public void increaseHunger(int amount) {
		this.currentHungerLevel += amount;
	}

	public void increaseDrunk(double amount) {
		this.currentDrunkLevel += amount;
	}

	private int calcMaxHunger() {
		if (this.weight >= 90)
			return 2025 / 3;
		if (this.weight >= 80)
			return 1800 / 3;
		if (this.weight >= 70)
			return 1575 / 3;
		if (this.weight >= 60)
			return 1350 / 3;
		return 1125 / 3;
	}

	public double calcBAC(Menu menu) {
		double genderNum;
		if (isMan) {
			genderNum = 0.86;
		} else {
			genderNum = 0.64;
		}
		double totalAlcohol = menu.getWeightPerMenu() * menu.getPercentagePerDrink() * 0.01 * 0.8;
		return (totalAlcohol * 0.7) / (weight * genderNum * 10.0);
	}

	public void order(Customer cust, Restaurant rest, Menu menu, int quantity) {
		rest.judgeOrder(cust, menu, quantity);
	}
	
	public void printStatus() {
		System.out.println("\n-------- 상태 --------");
        System.out.println("잔액: " + getWallet() + "원");
        System.out.println("현재 배부름: " + getCurrentHungerLevel() + "g");
        System.out.printf("현재 알코올 농도: %.4f%%\n", getCurrentDrunkLevel());
	}
}