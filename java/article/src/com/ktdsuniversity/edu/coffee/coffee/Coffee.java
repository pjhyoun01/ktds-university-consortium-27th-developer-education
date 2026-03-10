package com.ktdsuniversity.edu.coffee.coffee;

import com.ktdsuniversity.edu.coffee.shop.CoffeeType;

/**
 * 커피 메뉴를 나타내는 데이터 클래스
 */
public class Coffee {
	/**
	 * 커피 메뉴의 이름
	 */
	private CoffeeType name;

	/**
	 * 커피 메뉴의 가격
	 */
	private int price;

	/**
	 * 하루동안 판매할 수 있는 커피의 양
	 */
	private int stock;

	public Coffee(CoffeeType name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public CoffeeType getName() {
		return name;
	}

	public void setName(CoffeeType name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
