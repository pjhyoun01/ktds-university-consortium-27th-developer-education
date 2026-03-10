package com.ktdsuniversity.edu.market.seller;

public class Seller {
	private final int PRICE = 1000;
	private final double PER_WEIGHT = 0.5;

	private int stock;
	private int capital;

	public Seller(int stock, int capital) {
		this.stock = stock;
		this.capital = capital;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	public int getPRICE() {
		return PRICE;
	}

	public double getPER_WEIGHT() {
		return PER_WEIGHT;
	}

	public int sell(int amount) {
		if (this.stock <= 0) {
			System.out.println("품절되었습니다.");
			printStatus();
			return 0;
		}

		int isSold;
		if (this.stock < amount) {
			isSold = this.stock;
		} else {
			isSold = amount;
		}

		this.stock -= isSold;
		this.capital += (isSold * PRICE);

		System.out.println(isSold + "개가 판매되었습니다.");
		printStatus();

		return isSold;
	}

	public void printStatus() {
		System.out.println("재고: " + this.stock + "개");
		System.out.println("자본금: " + this.capital + "원\n");
	}

}