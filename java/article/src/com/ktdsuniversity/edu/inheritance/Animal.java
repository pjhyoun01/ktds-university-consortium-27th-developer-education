package com.ktdsuniversity.edu.inheritance;

public class Animal {
	private String name;
	private String voice;
	private float speed;
	private float damage;
	private float hitPoint;

//	public Animal() {
//
//	}

	public Animal(String name, String voice, float speed, float damage, float hitPoint) {
		this.name = name;
		this.voice = voice;
		this.speed = speed;
		this.damage = damage;
		this.hitPoint = hitPoint;

	}

	public String getName() {
		return this.name;
	}

	public float getSpeed() {
		return this.speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public void howling() {
		System.out.println(this.name + " : " + this.voice);
	}

	public void move() {
		System.out.println(this.name + " : " + this.speed + "km/h의 속도로 움직임.");
	}

	public void atteck(Animal other) {
		if (this.isDead()) {
			System.out.println(this.name + "이 이미 죽어 행동할 수 없습니다");
			return;
		}

		if (!(this instanceof Bird) && other instanceof Bird) {
			if (this.isDead()) {
				System.out.println(other.name + "이 비행중이라 공격할 수 없습니다");
				return;
			}
		}

		System.out.println(this.name + "이 " + other.getName() + "에게 공격하려 합니다");
		if (!other.isDead()) {
			other.getDamage(this.damage);
		} else {
			System.out.println(other.getName() + "이 이미 죽어 공격할 수 없습니다");
		}
	}

	public void getDamage(float damage) {
		System.out.println(this.name + "이 " + damage + "만큼의 피해를 입었습니다");
		this.hitPoint -= damage;
	}

	public boolean isDead() {
		return this.hitPoint <= 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Animal other) {
			return other.getName().equals(this.name);
			
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", voice=" + voice + ", speed=" + speed + ", damage=" + damage + ", hitPoint="
				+ hitPoint + "]";
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	public float getDamage() {
		return damage;
	}

	public void setDamage(float damage) {
		this.damage = damage;
	}

	public float getHitPoint() {
		return hitPoint;
	}

	public void setHitPoint(float hitPoint) {
		this.hitPoint = hitPoint;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
