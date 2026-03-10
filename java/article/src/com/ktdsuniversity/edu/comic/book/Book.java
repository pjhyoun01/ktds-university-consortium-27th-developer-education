package com.ktdsuniversity.edu.comic.book;

public class Book {
//	만화책 이름
	private String name;
//	만화책 대여 가격
	private int rentalPrice;
	
	/**
	 * 만화책 대여 여부
	 * 렌탈 중이 아니면 false
	 * 렌탈 중이면 true
	 */
	private boolean isRental;

	public Book(String name, int rentalPrice) {
		this.name = name;
		this.rentalPrice = rentalPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRentalPrice() {
		return rentalPrice;
	}

	public void setRentalPrice(int rentalPrice) {
		this.rentalPrice = rentalPrice;
	}

	public boolean isRental() {
		return isRental;
	}

	public void setRental(boolean isRental) {
		this.isRental = isRental;
	}
}
