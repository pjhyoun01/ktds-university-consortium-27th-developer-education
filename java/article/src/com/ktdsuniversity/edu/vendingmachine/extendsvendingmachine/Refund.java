package com.ktdsuniversity.edu.vendingmachine.extendsvendingmachine;

public class Refund extends DrinkVendingMachine{

	/*
	 * 환불하기 만들기
	 * 사용자가 돈을 넣은 후 존재하지 않는 음료를 골랐을 때
	 * 사용자에게 돈을 돌려줌
	 * 
	 * 환불할 메뉴와 환불할 수량을 입력받으면
	 * 재고에 환불한 수량을 추가
	 * 고객의 지갑에 환불한 금액 추가
	 * 
	 */
	public Refund(Drink drink1, Drink drink2, Drink drink3, Drink drink4) {
		super(drink1, drink2, drink3, drink4);
	}
	
	public void returnMoney(int drinkNum, int pressCount) {
		if (drinkNum < 0 || drinkNum >= this.getDrinks().length) {
			System.out.println("없는 메뉴입니다");
			return;
		}
		int refundMoney = this.getDrinks()[drinkNum].getPrice() * pressCount;
		if (this.getSafeMoney() < refundMoney) {
			System.out.println("자판기의 잔돈이 부족해서 환불 불가");
		}
		System.out.println("환불 금액: " + refundMoney);
		this.setSafeMoney(refundMoney);
		System.out.println("자판기 잔돈: " + this.getSafeMoney());
		
		
		
		
	}
	
}
