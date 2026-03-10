package com.ktdsuniversity.edu.vehicle;

public class EV extends Vehicle {

	private int battery;

	public EV(String name, int battery) {
		super(name, "웨에에에엥ㅇㅇㅇ");
		this.battery = battery;
	}

	public void checkBattery() {
		System.out.println(this.getName() + "의 배터리 잔량: " + this.battery + "%");
	}

	public void chargeBattery(int chargeAmount) {
		if (this.battery < 100 && (this.battery + chargeAmount) <= 100) {
			this.battery += chargeAmount;
			System.out.println(this.getName() + "의 배터리 충전량: " + chargeAmount + "%");
		} else {
			int canNotChargeAmount = (this.battery + chargeAmount) - 100;
			System.out.println(canNotChargeAmount + "% 초과 되었습니다");
			this.battery += (chargeAmount - canNotChargeAmount);
			System.out.println(this.getName() + "의 배터리 충전량: " + (chargeAmount - canNotChargeAmount) + "%");
		}
	}

}
