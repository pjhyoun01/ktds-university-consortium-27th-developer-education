package com.ktdsuniversity.edu.store.normal;

public class ConvenStore extends NormalStore {

	public ConvenStore(Product[] products) {
		super(products);
	}

	public void savePoint(Customer cust, int productPrice) {
		float expectPoint = productPrice * 0.001f; // 0.1% 계산
		cust.setEarnedPoint(cust.getEarnedPoint() + expectPoint);
		System.out.printf("적립된 포인트: %.2f \n누적 포인트: %.2f\n", expectPoint, cust.getEarnedPoint());
	}

	public int sellUsePoint(Customer cust, int productNum) {
		if (!canSell(cust, productNum)) {
			return 0;
		}

		int originalPrice = this.getProducts()[productNum].getPrice();
		int usePoint = 0;

		if (cust.getEarnedPoint() >= 100) {
			usePoint = (int) cust.getEarnedPoint();
			cust.setEarnedPoint(cust.getEarnedPoint() - usePoint);
			System.out.println("사용할 포인트: " + usePoint + "원");
		}

//	    포인트를 사용한 가격
		int discountPrice = originalPrice - usePoint;

		if (cust.getPayMoney() < discountPrice) {
			System.out.println("잔액 부족");
			cust.setEarnedPoint(cust.getEarnedPoint() + usePoint);
			return 0;
		}
		this.printSellStatus(discountPrice, cust.getPayMoney());
		savePoint(cust, discountPrice);

		return discountPrice;
	}
}
