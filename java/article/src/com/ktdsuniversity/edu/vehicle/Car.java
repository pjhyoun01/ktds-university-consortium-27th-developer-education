package com.ktdsuniversity.edu.vehicle;

public class Car {
	public static void main(String[] args) {
		Vehicle ve = new Vehicle("마티즈");
		Vehicle ev = new EV("아이오닉5", 56);
		Vehicle sportCar = new SportCar("페라리");
		Vehicle batMobile = new BatMobile("배트모빌");
		
		ve.startEngine();
		ev.startEngine();
		sportCar.startEngine();
		batMobile.startEngine();
		System.out.println();
		
		if (ev instanceof EV car1) {
			car1.checkBattery();
			car1.chargeBattery(10);
			car1.checkBattery();
			car1.chargeBattery(40);
			car1.checkBattery();			
		}
		System.out.println();
		if (sportCar instanceof SportCar car2) {
			car2.startTurboMode();
			car2.offTurboMode();
		}
		System.out.println();
		
		if (batMobile instanceof BatMobile car3) {
			car3.separateBatport();
			car3.mergeBatport();
		}
		System.out.println();
		
		ev.startEngine();
		sportCar.startEngine();
		batMobile.startEngine();
	}
}
