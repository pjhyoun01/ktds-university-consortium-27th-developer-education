package oop;

/**
 * <pre>
 * oop첫 실습
 * 
 * 자동차의 속성과 기능을 구현함으로써 클래스와 객체에 대해 이해한다
 * </pre>
 */
public class Car {
//	클래스의 속성 (멤버변수 | 인스턴스 필드)
	
	/**<pre>
	 * 엔진의 시동 여부
	 * 엔진이 꺼져 있을 때는 가속 페달을 누르거나 브레이크 페달을 눌러도 아무런 효과가 없다
	 * 엔진이 켜져 있을 때는 누르는 페달에 딸하 속도(speed)가 변화된다
	 * </pre>
	 */
	boolean isEngineStart;
	/**<pre>
	 * 자동차의 현재 속도를 표현
	 * 가속페달을 누르면 속도 증가
	 * 브레이크 페달을 누르면 속도 감소
	 * </pre>
	 */
	int speed;
	
//	인스턴스 메소드
	
	public Car(boolean isEngineStart, int speed) {
		this.isEngineStart = isEngineStart;
		this.speed = speed;
	}
	
	
	/**<pre>
	 * 현재 엔진의 상태에 따라서 시동을 켜거나 끈다
	 * 시동이 걸리면 isEnigneStart의 값이 ture 꺼지면 dalse가 된다
	 * 시동이 켜지면 speed = 0
	 * 시동이 꺼지면 speed = 1
	 * </pre>
	 */
	public void pressEngineStartButton() {
		if (isEngineStart) {
			isEngineStart = false;
			speed = 0;
			System.out.println("시동을 끕니다");
			System.out.println("현재 속도: " + speed);
		} else {
			isEngineStart = true;
			speed = 10;
			System.out.println("시동을 켭니다");
			System.out.println("현재 속도: " + speed);
		}
	}
	
	

	/**<pre>
	 * 시동이 켜져 있을 때 가속페달을 누르는 압력 만큼 속도가 증가
	 * </pre>
	 * @param press 가속 페달을 누르는 압력의 정도
	 */
	public void pressGasPedal(int press) {
		if (isEngineStart) {
			speed += press;
			System.out.println("현재 속도: " + speed);
//			if (speed > 100) {
//				System.out.println("과속하지 마세요");
//			}
		}
	}
	
	public void pressBrakePedal(int press) {
		if (isEngineStart) {
			speed -= press;
			if (speed <0) {
				speed = 0;
			} 
			System.out.println("현재 속도: " + speed);
			
		}
	}
	
}
