package com.ktdsuniversity.edu.store.inheritance.dto;

import com.ktdsuniversity.edu.store.inheritance.VO.CustomerVO;

public class PointInfoDTO {
	private CustomerVO customerVO;
	private int productPrice;
	private int usePointAmount;

	public PointInfoDTO(CustomerVO customerVO, int productPrice) {
		this.customerVO = customerVO;
		this.productPrice = productPrice;
	}

	public PointInfoDTO(CustomerVO customerVO, int productPrice, int usePointAmount) {
		this.customerVO = customerVO;
		this.productPrice = productPrice;
		this.usePointAmount = usePointAmount;
	}

	public CustomerVO getCustomerVO() {
		return customerVO;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public int getUsePointAmount() {
		return usePointAmount;
	}

	public void setUsePointAmount(int usePointAmount) {
		this.usePointAmount = usePointAmount;
	}

}
