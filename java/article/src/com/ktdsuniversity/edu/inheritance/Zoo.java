package com.ktdsuniversity.edu.inheritance;

public class Zoo {
	public static void main(String[] args) {

		Animal duck = new Bird("오리", "꽥", 15f, 20f, 50f);
		Animal duck2 = new Bird("오리", "꽥", 15f, 20f, 50f);
		duck.howling();
		duck.move();
		
		System.out.println("== 비교 " + (duck == duck2));
		System.out.println("equals 비교 "+duck.equals(duck2));

		Object a;
//		불가
//		duck.fly();
//		duck.land();

//		구버전
//		if (duck instanceof Bird) {
//			Bird bird = (Bird) duck;
//			bird.fly();
//			bird.land();
//			bird.fly();
//			bird.land();
//		}

//		현재버전
		if (duck instanceof Bird bird) {
//		아래 코드를 줄여서 쓰는 방법	
//		if (duck instanceof Bird) {
//			Bird bird = (Bird) duck;
			bird.fly();
			bird.move();

			bird.land();
			bird.move();

			
			bird.fly();
		}

		Animal lion = new Animal("사자", "크아앙", 80f, 60f, 200f);
		Animal tiger = new Animal("호랑이", "어흥", 50f, 55f, 200f);

		
		duck.atteck(tiger);
		tiger.atteck(duck);
//		lion.howling();
//		tiger.howling();
//		
//		lion.move();
//		tiger.move();
//		
//		lion.atteck(tiger);
//		lion.atteck(tiger);
//		lion.atteck(tiger);
//		lion.atteck(tiger);
//		lion.atteck(tiger);
//		lion.atteck(tiger);
//		lion.atteck(tiger);
//		lion.atteck(tiger);
//		lion.atteck(tiger);
//		lion.atteck(tiger);
//		tiger.atteck(lion);
	}

}
