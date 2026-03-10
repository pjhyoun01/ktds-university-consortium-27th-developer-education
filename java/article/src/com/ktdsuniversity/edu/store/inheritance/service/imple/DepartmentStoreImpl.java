package com.ktdsuniversity.edu.store.inheritance.service.imple;

import com.ktdsuniversity.edu.store.inheritance.VO.CustomerVO;
import com.ktdsuniversity.edu.store.inheritance.VO.ProductVO;
import com.ktdsuniversity.edu.store.inheritance.VO.StoreVO;
import com.ktdsuniversity.edu.store.inheritance.dto.PaymentInfoDTO;
import com.ktdsuniversity.edu.store.inheritance.dto.PointInfoDTO;
import com.ktdsuniversity.edu.store.inheritance.membershiplevel.VIP;
import com.ktdsuniversity.edu.store.inheritance.membershiplevel.VVIP;
import com.ktdsuniversity.edu.store.inheritance.service.DiscountService;
import com.ktdsuniversity.edu.store.inheritance.service.PointService;

public class DepartmentStoreImpl extends BasicStore implements PointService, DiscountService {

	public DepartmentStoreImpl(StoreVO storeVO, ProductVO[] products) {
		super(storeVO, products);
	}

	@Override
	public void sell(PaymentInfoDTO paymentInfoDTO) {
		System.out.println("------------------------------");
		System.out.println("안녕하세요 " + super.storeVO.getName() + "입니다");
		int sellAmount = super.checkSellAmount(paymentInfoDTO.getCustomerVO(), paymentInfoDTO.getPaymentAmount(),
				paymentInfoDTO.getProductNum(), paymentInfoDTO.getQuantity());
		int discountAmount = discountPrice(paymentInfoDTO.getCustomerVO(), sellAmount);
		int finalAmount = sellAmount - discountAmount;
		int pointAmount = usePoint(
				new PointInfoDTO(paymentInfoDTO.getCustomerVO(), finalAmount, paymentInfoDTO.getUsePointAmount()));
		finalAmount -= pointAmount;
		super.isAmountEnought(paymentInfoDTO.getPaymentAmount(), sellAmount, finalAmount);
		if (finalAmount > 0)
			savePoint(paymentInfoDTO.getCustomerVO(), finalAmount);
		super.calcSellMoney(paymentInfoDTO.getCustomerVO(), paymentInfoDTO.getPaymentAmount(), finalAmount);
		super.printProduct(paymentInfoDTO.getCustomerVO());
	}

	// TODO 보유 포인트 초과 사용 처리 + 논리 검토
	@Override
	public int usePoint(PointInfoDTO pointInfoDTO) {
		int point = (int) pointInfoDTO.getCustomerVO().getCurrentPoint();
		if (point < pointInfoDTO.getUsePointAmount()) {
//			System.out.println("보유 포인트를 초과해서 사용할 수 없습니다");
//			System.out.println(point);
//			pointInfoDTO.setUsePointAmount(point);
//			System.out.println(pointInfoDTO.getUsePointAmount());
		} else if (point >= 10_000) {
			if (pointInfoDTO.getUsePointAmount() > pointInfoDTO.getProductPrice()) {
				pointInfoDTO.setUsePointAmount(pointInfoDTO.getProductPrice());
				System.out.println("포인트는 물건 가격을 초과해서 사용할 수 없습니다");
			}
			pointInfoDTO.getCustomerVO()
					.setCurrentPoint(pointInfoDTO.getCustomerVO().getCurrentPoint() - pointInfoDTO.getUsePointAmount());
			System.out.println("사용할 포인트:\t" + String.format("%,d", pointInfoDTO.getUsePointAmount()) + " p");
		} else {
			pointInfoDTO.setUsePointAmount(0);
			System.out.println("10000 포인트 이상 적립 시 사용 가능");
		}
		return pointInfoDTO.getUsePointAmount();
	}

	@Override
	public void savePoint(CustomerVO customerVO, int productPrice) {
		double addPoint;
		if (customerVO instanceof VIP) {
			return;
		} else if (customerVO instanceof VVIP) {
			addPoint = productPrice * 0.03;
		} else {
			addPoint = productPrice * 0.005;
		}
		customerVO.setCurrentPoint(customerVO.getCurrentPoint() + addPoint);
		System.out.println("적립될 포인트:\t" + String.format("%,.2f", addPoint) + " p");
	}

	@Override
	public int discountPrice(CustomerVO customerVO, int productPrice) {
		int discountAmount = 0;
		if (customerVO instanceof VIP) {
			discountAmount = (int) (productPrice * 0.03);
		} else if (customerVO instanceof VVIP) {
			discountAmount = (int) (productPrice * 0.1);
		} else {
			return 0;
		}
		System.out.println("할인 금액:\t\t" + String.format("%,d", discountAmount) + " 원");
		return discountAmount;
	}

}
