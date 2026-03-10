package com.ktdsuniversity.edu.marketex.consumer;

import com.ktdsuniversity.edu.marketex.seller.Seller;

public class Buyer {

	private int maxCartWeight;
	private int nowCartWeight;

	private int itemCount;
	private int wallet;

	public Buyer(int wallet, int maxCartWeight) {
		this.wallet = wallet;
		this.maxCartWeight = maxCartWeight;
	}
	
	public int getMaxCartWeight() {
		return this.maxCartWeight;
	}

	public int getNowCartWeight() {
		return this.nowCartWeight;
	}

	public int getItemCount() {
		return this.itemCount;
	}

	public int getWallet() {
		return this.wallet;
	}
	
	public void setMaxCartWeight(int maxCartWeight) {
		this.maxCartWeight = maxCartWeight;
	}
	
	public void setNowCartWeight(int nowCartWeight) {
		this.nowCartWeight = nowCartWeight;
	}
	
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
	public void setWallet(int wallet) {
		this.wallet = wallet;
	}

	public boolean isEnoughMoney(int money) {
		return this.wallet >= money;
	}

	public boolean isEnoughWeight(int weight) {
		int predictWeigth = weight + this.nowCartWeight;
		return this.maxCartWeight >= predictWeigth;
	}

	public void buy(int money, int weight, int productCount) {
		if (!this.isEnoughMoney(money)) {
			System.out.println("돈이 부족합니다.");
		} else if (!this.isEnoughWeight(weight)) {
			System.out.println("더 이상 장바구니를 들 수 없습니다.");
		} else {
			this.wallet -= money;
			this.itemCount += productCount;
			this.nowCartWeight += weight;
		}

		System.out.println("상품의 수: " + this.itemCount);
		System.out.println("장바구니의 무게: " + this.nowCartWeight);
		System.out.println("지갑에 있는 돈: " + this.wallet);

	}
	
	public void buyFrom(Seller seller, int productCount) {
		// 구매자: 혹시 두꼰쿠 productCount만큼 있나요?
		if (seller.isEnoughStock(productCount)) {
			int price = seller.getPRICE();
			if(this.isEnoughMoney(price * productCount)) {
				int weight = seller.getPRODUCT_WEIGHT();
				if (this.isEnoughWeight(weight * productCount)) {
					int stock = seller.getStock();
					stock -= productCount;
					seller.setStock(stock);
					this.wallet -= price * productCount;
					
					int account = seller.getAccount();
					account += price * productCount;
					seller.setAccount(account);
					
					this.nowCartWeight += productCount * weight;
					this.itemCount += productCount;
				}
					
			}
		}
		// 판매자: 있습니다
		// 구매자: 하나에 얼마인가요?
		// 판매자: 1000원 입니다
		// 구매자: (내가 5000원이 있나?)
		//	 	  있다
		// 구매자: 혹시 무게가 많이 무겁나요?
		// 판매자: 500g입니다
		// 구매자 (내가 2.5kg를 들 수 있나?)
		//		 있다
		// 구매자: 5개만 주세요
		// 판매자: 두쫀쿠 5개를 판매(판매자의 재고 감소)
		// 구매자: 여기 5천원 드릴게요 (구매자의 돈이 감소, 판매자의 자산 증가, 구매자의 무게와 구매 개수 증가) 
		
	}

}