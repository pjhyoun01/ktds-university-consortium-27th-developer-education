package com.ktdsuniversity.edu.store.abstraction;

public class DepartmentStore extends AbstractMart {

	public DepartmentStore(int productPrice) {
		super(productPrice);
	}

	@Override
	public int usePoint(Guest guest) {
		int point = guest.getPoint();
		int usePoint = (int) (Math.random() * 5000 + 1);
//		int usePoint = 3000;
		if (point >= 10_000) {
			guest.usePoint(usePoint);
			System.out.println("사용할 포인트: " + usePoint);
			return usePoint;
		} else {
			System.out.println("10000 포인트 이상 사용 가능");
			return 0;
		}

	}

	@Override
	public void givePoint(Guest guest, int amount) {
		int point = 0;
		// 0.5 포인트, 3프로 할인 포인트x, 10프로 할인 포인트 3프로
		//물건 값을 입력받아서 고객의 등급에 따라 포인트를 지급
		if (guest.getCustLevel() == 1) {
			point = (int) (amount * 0.005);
		} else if (guest.getCustLevel() == 3) {
			point = (int) (amount * 0.03);
		} else {
			return;
		}
		guest.addPoint(point);
	}

	@Override
	public int discount(Guest guest, int amount) {
//		할인 금액 반환
		int discountPrice = 0;
		if (guest.getCustLevel() == 2) {
			discountPrice = (int) (amount * 0.03);
		} else if (guest.getCustLevel() == 3) {
			discountPrice = (int) (amount * 0.1);
		}
		System.out.println("할인 금액: " + discountPrice);
		return discountPrice;
	}

}
