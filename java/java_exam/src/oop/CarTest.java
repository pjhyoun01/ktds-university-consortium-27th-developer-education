package oop;

public class CarTest {
	public static void main(String[] args) {
		
//		int[] scoreArray = new int[7];
		
//		Car car = new Car();
//		car.pressEngineStartButton();
//		
//		car.pressGasPedal(10);
//		car.pressBrakePedal(40);
		
		Car kona = new Car(false, 30);
		
//		kona의 엔진 상태를 출력한다
		kona.pressEngineStartButton();
		kona.pressGasPedal(140);
		
		
//		kona의 현재 속도를 출력한다
		
		Car carnival = new Car(true, 20);
		
		carnival.pressGasPedal(200);
		carnival.pressEngineStartButton();
		carnival.pressGasPedal(10);
		carnival.pressGasPedal(10);
		
		
		System.out.println(carnival.isEngineStart);
		System.out.println(carnival.speed);
		
	}
}
