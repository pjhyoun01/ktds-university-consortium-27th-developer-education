package exam;

public class ArtithmaticQuiz3 {
	public static void main(String[] args) {
		int celsius = 30;
		int fahrenheit = 0;
		
		/**
		 * 섭씨온도를 나타내는 celsius 변수
		 * 화씨 온도를 나타내는 fahrenhit 변수
		 * 섭씨 온도가 주어졌을 때 화씨 온도를 출력하시오
		 * 화씨 = 섭씨 * 9/5 + 32
		 */
		
		fahrenheit = celsius * 9/5 + 32;
		System.out.println("섭씨 " + celsius + "도는 화씨" + fahrenheit 
				+ "도 입니다");

//		celsius = fahrenheit  ;
//		System.out.println("화씨 " + fahrenheit + "도는 섭씨" + celsius 
//				+ "도 입니다");
		
	}
}
