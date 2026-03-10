package com.ktdsuniversity.edu.datetime.mart;

import java.time.LocalDate;

public class Item {
	private String name;
	private LocalDate expireDate;
	
	public Item(String name, String expireDate) {
		this.name = name;
		this.expireDate = LocalDate.parse(expireDate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}
	
	@Override
	public String toString() {
		return "상품명: " + this.name + ", 소비기한: " + this.expireDate;
	}
	
}
