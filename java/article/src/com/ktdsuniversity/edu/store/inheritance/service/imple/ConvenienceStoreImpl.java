package com.ktdsuniversity.edu.store.inheritance.service.imple;

import com.ktdsuniversity.edu.store.inheritance.VO.CustomerVO;
import com.ktdsuniversity.edu.store.inheritance.VO.ProductVO;
import com.ktdsuniversity.edu.store.inheritance.VO.StoreVO;
import com.ktdsuniversity.edu.store.inheritance.dto.PaymentInfoDTO;
import com.ktdsuniversity.edu.store.inheritance.dto.PointInfoDTO;
import com.ktdsuniversity.edu.store.inheritance.service.PointService;

public class ConvenienceStoreImpl extends BasicStore implements PointService {

	public ConvenienceStoreImpl(StoreVO storeVO, ProductVO[] products) {
		super(storeVO, products);
	}
	
	@Override
	public void sell(PaymentInfoDTO paymentInfoDTO) {
		System.out.println("------------------------------");
		System.out.println("안녕하세요 " + super.storeVO.getName() + "입니다");
		int sellAmount = super.checkSellAmount(paymentInfoDTO.getCustomerVO(), paymentInfoDTO.getPaymentAmount(), paymentInfoDTO.getProductNum(), paymentInfoDTO.getQuantity());
		int pointAmount = usePoint(new PointInfoDTO(paymentInfoDTO.getCustomerVO(), sellAmount));
		int finalAmount = sellAmount - pointAmount;
		super.isAmountEnought(paymentInfoDTO.getPaymentAmount(), sellAmount, finalAmount);
		if (finalAmount > 0) {
			savePoint(paymentInfoDTO.getCustomerVO(), finalAmount);
		}
		super.calcSellMoney(paymentInfoDTO.getCustomerVO(), paymentInfoDTO.getPaymentAmount(),finalAmount);
		super.printProduct(paymentInfoDTO.getCustomerVO());
	}

	@Override
	public int usePoint(PointInfoDTO pointInfoDTO) {
		int point = (int) pointInfoDTO.getCustomerVO().getCurrentPoint();

		if (point >= 100) {
			if (point > pointInfoDTO.getProductPrice()) {
				point = pointInfoDTO.getProductPrice();
				System.out.println(("포인트는 물건 가격을 초과해서 사용할 수 없습니다"));
				
			}
			pointInfoDTO.getCustomerVO().setCurrentPoint(0);
			System.out.println("사용할 포인트:\t" + String.format("%,d", point) + " p");
		} else {
			point = 0;
			System.out.println("100 포인트 이상 적립 시 사용 가능");			
		}
		return point;
	}
	
	@Override
	public void savePoint(CustomerVO customerVO, int productPrice) {
		double addPoint = productPrice * 0.001;
		customerVO.setCurrentPoint(customerVO.getCurrentPoint() + addPoint);
		System.out.println("적립될 포인트:\t" + String.format("%,.2f", addPoint) + " p");
	}

}
