package com.ktdsuniversity.edu.vehicle;

public class SportCar extends Vehicle{

	private boolean isTurboMode;

	public SportCar(String name) {
		super(name, "르쉐르쉐!!");
	}
	public SportCar(String name, String enginesound) {
		super(name, enginesound);
	}
	
	public void startTurboMode() {
		this.isTurboMode = true;
		System.out.println(this.getName() + "의 터보모드: on");
	}
	
	public void offTurboMode() {
		this.isTurboMode = false;
		System.out.println(this.getName() + "의 터보모드: off");		
	}
	
	
}
