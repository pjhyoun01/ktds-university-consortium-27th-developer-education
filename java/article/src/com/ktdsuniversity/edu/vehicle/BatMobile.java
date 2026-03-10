package com.ktdsuniversity.edu.vehicle;

public class BatMobile extends SportCar {

	private boolean isBatpodEjection;

	public BatMobile(String name) {
		super(name, "배트배트카 출또옹ㅇㅇㅇ");
	}

	public void separateBatport() {
		this.isBatpodEjection = true;
		System.out.println(this.getName() + "의 배트 포드 상태: 분리");
	}

	public void mergeBatport() {
		this.isBatpodEjection = false;
		System.out.println(this.getName() + "의 배트 포드 상태: 합체");
	}
}
