package com.ktdsuniversity.edu.vehicle;

public class Vehicle {

	private String name;
	private boolean isStart;
	private String engineSound;
	
	public Vehicle(String name) {
		this.name = name;
		engineSound = "뷍뷍";
	}

	public Vehicle(String name, String engineSound) {
		this.name = name;
		this.engineSound = engineSound;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStart() {
		return isStart;
	}

	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}

	public void startEngine() {
		this.isStart = !isStart;
		if (this.isStart) {
			System.out.println(this.name + "의 시동이 켜졌습니다");
			System.out.println(this.engineSound);
		} else {
			System.out.println(this.name + "의 시동이 꺼졌습니다");
		}
	}
}
