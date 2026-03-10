package com.ktdsuniversity.edu.store.abstraction;

public class Guest {

	private int money;
	private int point;
	private int custLevel;

	public Guest(int money, int point, int custLevel) {
		this.money = money;
		this.point = point;
		this.custLevel = custLevel;
	}

	public void pay(int amount) {
		this.money -= amount;
	}

	public void giveMoney(int remainMoney) {
		this.money += remainMoney;
	}


	public int getPoint() {
		return this.point;
	}

	public int getCustLevel() {
		return custLevel;
	}

	public void usePoint(int point) {
		this.point -= point;
	}

	public void addPoint(int point) {
		this.point += point;
	}
	
	

	public int getMoney() {
		return money;
	}
	

	public void setMoney(int money) {
		this.money = money;
	}

	public String toString() {
		return "고객 잔돈: " + this.money;
	}
}
