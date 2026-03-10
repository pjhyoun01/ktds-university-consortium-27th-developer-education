package com.ktdsuniversity.edu.inheritance;

public class Bird extends Animal {

	private boolean isFly;
	private float walkingSpeed;

	public Bird(String name, String voice, float speed, float damage, float hitPoint) {
		super(name, voice, speed, damage, hitPoint);
		this.walkingSpeed = speed;
	}

	public boolean getIsFly() {
		return this.isFly;
	}
	
	public void fly() {
		this.isFly = true;
		this.setSpeed(70f);
	}

	public void land() {
		this.isFly = false;
		this.setSpeed(this.walkingSpeed);
	}
	
//	Bird 클래스의 최종 Super Class 인 Object 클래스의 toString()메소드를 다시 정의
	@Override
	public String toString() {
		String str = "Bird[name: %s, isFly: %s]";
		return str.formatted(super.getName(), this.isFly);
	}

}
