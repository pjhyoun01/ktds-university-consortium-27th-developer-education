package com.ktdsuniversity.edu.market;

import com.ktdsuniversity.edu.market.consumer.Customer;
import com.ktdsuniversity.edu.market.seller.Seller;

public class Market {
	public static void main(String[] args) {
		Seller seller = new Seller(20, 10_000);
		
		Customer customer = new Customer(15_000);
		
		customer.buy(seller, 10);
	}
}
