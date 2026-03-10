package com.ktdsuniversity.edu.store.inheritance.service.imple;

import com.ktdsuniversity.edu.store.inheritance.VO.ProductVO;
import com.ktdsuniversity.edu.store.inheritance.VO.StoreVO;
import com.ktdsuniversity.edu.store.inheritance.dto.PaymentInfoDTO;

public class NormalStoreImpl extends BasicStore{

	public NormalStoreImpl(StoreVO storeVO, ProductVO[] products) {
		super(storeVO, products);
	}
	
	@Override
	public void sell(PaymentInfoDTO paymentInfoDTO) {
		System.out.println("------------------------------");
		System.out.println("안녕하세요 " + super.storeVO.getName() + "입니다");
		super.sell(paymentInfoDTO);
	}

}
