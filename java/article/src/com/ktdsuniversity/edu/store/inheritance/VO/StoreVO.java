package com.ktdsuniversity.edu.store.inheritance.VO;

public class StoreVO {
	private String name;
	private int startAmount;
	private int sellAmount;

	public StoreVO(String name, int startingAmount) {
		this.name = name;
		this.startAmount = startingAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStartAmount() {
		return startAmount;
	}

	public void setStartAmount(int startingAmount) {
		this.startAmount = startingAmount;
	}

	public int getSellAmount() {
		return sellAmount;
	}

	public void setSellAmount(int sellAmount) {
		this.sellAmount = sellAmount;
	}

}
