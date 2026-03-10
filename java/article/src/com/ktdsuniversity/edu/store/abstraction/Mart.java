package com.ktdsuniversity.edu.store.abstraction;

public class Mart extends AbstractMart {

	public Mart(int productPrice) {
		super(productPrice);
	}

	@Override
	public int usePoint(Guest guest) {
		return 0;
	}

	@Override
	public void givePoint(Guest guest, int amount) {

	}

	@Override
	public int discount(Guest guest, int amount) {
		return 0;
	}

}
