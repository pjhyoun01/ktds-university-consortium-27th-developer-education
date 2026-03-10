package com.ktdsuniversity.edu.store.normal;

public class DepartmentStore extends ConvenStore {

	public DepartmentStore(Product[] products) {
		super(products);
	}

	public void sellUsePointDept(Customer cust, int productNum, int usePointAmount) {
		if (!this.canSell(cust, productNum))
			return;

		int originalPrice = this.getProducts()[productNum].getPrice();
		int discountPrice = originalPrice;

		if (cust.getCustLevel() == 1) {
			discountPrice = (int) (originalPrice * 0.97);
		} else if (cust.getCustLevel() == 2) {
			discountPrice = (int) (originalPrice * 0.9);
		}

		if (cust.getCustLevel() >= 1) {
			System.out.println(getStrCustLevel(cust) + " 등급 할인 적용: " + (originalPrice - discountPrice) + "원 할인");
		}

		if (cust.getEarnedPoint() >= 10000 && usePointAmount > 0) {
			if (usePointAmount <= cust.getEarnedPoint()) {
				discountPrice -= usePointAmount;
				cust.setEarnedPoint(cust.getEarnedPoint() - usePointAmount);
				System.out.println("사용할 포인트: " + usePointAmount + "원");
			} else {
				System.out.println("보유 포인트 초과 사용 불가");
			}
		} else if (usePointAmount > 0) {
			System.out.println("포인트 10,000원 미만 사용 불가");
		}

		if (cust.getPayMoney() < discountPrice) {
			System.out.println("잔액 부족");
			System.out.println();
			return;
		}

		this.printSellStatus(discountPrice, cust.getPayMoney());

		if (cust.getCustLevel() == 0 || cust.getCustLevel() == 2) {
			savePoint(cust, discountPrice);
		}
		System.out.println();
	}

	private String getStrCustLevel(Customer cust) {
		String strCustLevel = null;
		if (cust.getCustLevel() == 0) {
			strCustLevel = "일반";
		} else if (cust.getCustLevel() == 1) {
			strCustLevel = "VIP";
		} else if (cust.getCustLevel() == 2) {
			strCustLevel = "VVIP";
		} else {
			System.out.println("등급 오류입니다");
			System.out.println();
		}
		return strCustLevel;
	}
}
