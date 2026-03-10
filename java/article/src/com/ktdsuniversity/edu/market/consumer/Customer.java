package com.ktdsuniversity.edu.market.consumer;

import com.ktdsuniversity.edu.market.seller.Seller;

public class Customer {
	private int cartCount;
	private int money;

	private double currentWeight;
	private double maxWeight = 10.0;

	public Customer(int money) {
		this.money = money;
		this.cartCount = 0;
		this.currentWeight = 0.0;
	}

	public int getCartCount() {
		return cartCount;
	}

	public void setCartCount(int cartCount) {
		this.cartCount = cartCount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public double getCurrentWeight() {
		return currentWeight;
	}

	public void setCurrentWeight(double currentWeight) {
		this.currentWeight = currentWeight;
	}

	public double getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}

	public void buy(Seller seller, int amount) {
		// * 입력 받은 돈이 (입력 받은 수량 * 가격) 보다 크고 || 입력 받은 수량 보다 재고가 더 많을 경우
		if (this.money >= (amount * seller.getPRICE()) || amount <= seller.getStock()) {
			// * (입력 받은 수량 * 물품 당 무게)가 최대 무게보다 클 경우
			if (amount * seller.getPER_WEIGHT() > this.maxWeight) {
				seller.setCapital(seller.getCapital() + (int) (maxWeight / seller.getPER_WEIGHT()) * amount);
				seller.setStock((int) (maxWeight / seller.getPER_WEIGHT()));
				System.out.println((int) maxWeight + "kg 까지만 들 수 있습니다");
				System.out.println("구매 수량: " + (int) maxWeight / seller.getPER_WEIGHT());
				System.out.println("현재 무게: " + (int) maxWeight + "kg");
				printStatus();
			} else {
				seller.setCapital(seller.getCapital() + amount * seller.getPRICE());
				seller.setStock(seller.getStock() - amount);
				System.out.println("구매 수량: " + amount);
				System.out.println("현재 무게: " + (int) (seller.getPER_WEIGHT() * amount) + "kg");
				printStatus();
			}
		} else {
			System.out.println("돈이 부족합니다");
		}
	}

	public void printStatus() {
		System.out.println("\n상품 수: " + this.cartCount + "개 ");
		System.out.println("현재 무게: " + this.currentWeight + "kg");
		System.out.println("지갑: " + this.money + "원\n");

	}
}