package com.ktdsuniversity.edu.restaurant;

public class Menu {
	private String name;
	private int weightPerMenu;
	private FoodType isFood; // true: 음식, false: 술
	private int percentagePerDrink;
	private int price;

	public Menu(String name, int weightPerMenu, int price) {
		this.name = name;
		this.weightPerMenu = weightPerMenu;
		this.price = price;
		this.isFood = FoodType.FOOD;
	}

	public Menu(String name, int weightPerMenu, int percentagePerDrink, int price) {
		this.name = name;
		this.weightPerMenu = weightPerMenu;
		this.percentagePerDrink = percentagePerDrink;
		this.price = price;
		this.isFood = FoodType.DRINK;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeightPerMenu() {
		return weightPerMenu;
	}

	public void setWeightPerMenu(int weightPerMenu) {
		this.weightPerMenu = weightPerMenu;
	}

	public FoodType getIsFood() {
		return isFood;
	}

	public void setIsFood(FoodType isFood) {
		this.isFood = isFood;
	}

	public int getPercentagePerDrink() {
		return percentagePerDrink;
	}

	public void setPercentagePerDrink(int percentagePerDrink) {
		this.percentagePerDrink = percentagePerDrink;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}