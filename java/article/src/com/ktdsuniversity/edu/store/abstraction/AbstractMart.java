package com.ktdsuniversity.edu.store.abstraction;

/*
 * abstract 인스턴스로 생성할 수 없는 추상 클래스
 */
public abstract class AbstractMart {

	private int safe;
	private int productPrice;
	/** 고객에게 거슬러 줄 돈 */
	private int remainMoney;

	public AbstractMart(int productPrice) {
		this.productPrice = productPrice;
	}

	public void sell(Guest guest, int sellCount, int money) {

		// 손님이 마트에 돈을 지불.
		/*
		 * 상품 가격, 할인 금액, 포인트, 최종 결제 금액, 지불 금액, 거스름돈, 가게 판매 금액
		 * 
		 * 상품 가격을 확인 
		 * 		최종 결제 금액 = 상품 금액 
		 * 할인 금액 존재시 
		 * 		최종 결제 금액 -= 할인 금액 
		 * 포인트 존재 시 최종 
		 * 		결제 금액 -= 포인트 사용 금액
		 * 
		 * 최종 결제 금액 > 지불 금액 
		 * 		거스름 돈 = 지불 금액 
		 * 		return 
		 * 최종 결제 금액 < 지불 금액 
		 * 		가게 판매 금액 += 최종 결제 금액 
		 * 		거스름 돈 = 지불 금액 - 최종 결제 금액 
		 * 		포인트 적립 
		 * 			적립금 += 최종 결제 금액 * 적립 비율
		 * 
		 *
		 */

		int finalPrice = this.productPrice * sellCount;
		System.out.println("상품 가격: " + finalPrice);
		System.out.println("지불 금액: " + money);

		guest.pay(money);
		
		// 할인금을 반환
		int discountPrice = discount(guest, finalPrice);
		if (discountPrice > 0) {
		finalPrice -= discountPrice;			
		System.out.println("할인 적용 가격: " + finalPrice);
		}
		
		// 사용할 포인트 금액 반환
		int usePointPrice = usePoint(guest);
		if (usePointPrice > 0) {
			finalPrice -= usePointPrice;
			System.out.println("포인트 할인 적용 가격: " + finalPrice);
		}
		
		// 돈이 부족하면 전액 환불
		if (finalPrice > money) {
//			this.remainMoney = money;
			System.out.println("돈이 부족해서 구매 불가");
			guest.giveMoney(money);
			return;
		// 돈이 부족하지 않을 때만
		} else {
			this.safe += finalPrice;
			this.remainMoney = (money - finalPrice);
			this.givePoint(guest, finalPrice);
			System.out.println("매출액: " + this.safe);
			System.out.println("거슬러 줄 돈: " + this.remainMoney);
//			guest.setMoney(guest.getMoney() + this.remainMoney);
			guest.giveMoney(this.remainMoney);
		}

	}

	public abstract int usePoint(Guest guest);

	public abstract void givePoint(Guest guest, int amount);

	public abstract int discount(Guest guest, int amount);

}