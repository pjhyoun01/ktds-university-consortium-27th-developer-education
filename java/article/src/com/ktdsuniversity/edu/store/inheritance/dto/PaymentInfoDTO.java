package com.ktdsuniversity.edu.store.inheritance.dto;

import com.ktdsuniversity.edu.store.inheritance.VO.CustomerVO;

public class PaymentInfoDTO {
	private CustomerVO customerVO;
	private int paymentAmount;
	private int productNum;
	private int quantity;
	private int usePointAmount;

	public PaymentInfoDTO(CustomerVO customerVO, int paymentAmount, int productNum, int quantity) {
		this.customerVO = customerVO;
		this.paymentAmount = paymentAmount;
		this.productNum = productNum;
		this.quantity = quantity;
	}

	public PaymentInfoDTO(CustomerVO customerVO, int paymentAmount, int productNum, int quantity, int usePointAmount) {
		this.customerVO = customerVO;
		this.paymentAmount = paymentAmount;
		this.productNum = productNum;
		this.quantity = quantity;
		this.usePointAmount = usePointAmount;
	}

	public CustomerVO getCustomerVO() {
		return customerVO;
	}

	public int getPaymentAmount() {
		return paymentAmount;
	}

	public int getProductNum() {
		return productNum;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getUsePointAmount() {
		return usePointAmount;
	}

}
