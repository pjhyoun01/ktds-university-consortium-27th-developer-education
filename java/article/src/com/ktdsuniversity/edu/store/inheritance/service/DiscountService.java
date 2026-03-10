package com.ktdsuniversity.edu.store.inheritance.service;

import com.ktdsuniversity.edu.store.inheritance.VO.CustomerVO;

public interface DiscountService {
	int discountPrice(CustomerVO customerVO, int productPrice);
}
