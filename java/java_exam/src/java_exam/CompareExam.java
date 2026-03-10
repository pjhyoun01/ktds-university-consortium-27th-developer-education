package java_exam;

public class CompareExam {
	public static void main(String[] arg) {
//		int age = 10;
//
//		/**
//		 * age가 10대 인지 확인 10 <= age <20
//		 * 
//		 * age가 조건에 부합할 경우 ture를 반환 아니라면 false를 반환
//		 */
//
//		System.out.println(age >= 10 && age < 20);
//		System.out.println(age >= 20 && age < 30);
//
//		// 가게에 방문한 고객의 나이
//		int customerAge = 15;
//		// 고객의 지갑에 들어있는 돈
//		int customerWallet = 3_000;
//		/**
//		 * A가게는 19세 이상의 고객만 방문할 수 있다
//		 * A 가게에서 판매하는 모든 제품의 가격은 1500원이다
//		 * 고객은 가게에서 제품을 구매할 수 있을까?
//		 * 구매할 수 있다면 true 아니라면 false를 출력
//		 * 빠른 연산을 고려
//		 */
//		boolean isCanBuy = customerWallet >= 1_500 && customerAge >= 19;  
//		
//		System.out.println(isCanBuy);
		
		/**
		 * B 가게는 19세 이상의 고개만 방문할 수 있다
		 * B 가게에서 판매하는 모든 제품의 가격은 2000원이다
		 * B 가게는 특별 이벤트로 고객의 나이가 3의 배수면 돈이 모자라도 구매할 수 있게하고 있다
		 * 고객은 가게에서 제품을 구매할 수 있을까?
		 * 구매가능하면 true 불가능 하면 false
		 * 빠른 연산 고려
		 */
		
		int customerAge = 23;
		int customerWallet = 1_300;
		
		boolean canBuy = customerAge >= 19 && customerWallet >= 2_000;
//		
//		if (customerAge >= 19 && customerAge % 3 == 0) {
//			canBuy = !canBuy;
//		}
//		System.out.println(canBuy);
		
		boolean isAdult = customerAge >= 19;
		canBuy = customerWallet >= 2_000 || customerAge % 3 == 0;
		
		System.out.println(isAdult && canBuy);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
