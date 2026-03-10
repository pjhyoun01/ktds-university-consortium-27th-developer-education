package com.ktdsuniversity.edu.store.normal;

public class NormalStore {

	Product[] products;

	private int storeMoney;

	public NormalStore(Product[] products) {
		this.products = products;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public int getStoreMoney() {
		return storeMoney;
	}

	public void setStoreMoney(int storeMoney) {
		this.storeMoney = storeMoney;
	}

	public boolean canSell(Customer cust, int productNum) {
		if (productNum < 0 || productNum >= this.products.length) {
			System.out.println("없는 제품 번호");
			return false;
		}
		return true;
	}

	public void printSellStatus(int price, int payMoney) {
		this.storeMoney += price; // 직접 필드에 더하거나 setter 이용
		System.out.println("결제 금액: " + price + "원");
		System.out.println("거스름돈: " + (payMoney - price) + "원");
		System.out.println("가게 누적 판매 금액: " + this.storeMoney + "원");
	}

	public int sell(Customer cust, int productNum) {
		if (!canSell(cust, productNum))
			return 0;

		int price = this.products[productNum].getPrice();
		if (cust.getPayMoney() < price) {
			System.out.println("금액 부족");
			return 0;
		}

		printSellStatus(price, cust.getPayMoney());
		return price;
	}

	public void printProduct(Product[] products) {
		System.out.println("----- 상품 목록 -----");
		for (int i = 0; i < products.length; i++) {
			System.out.println(this.products[i].getName() + ": " + this.products[i].getPrice() + "원");
		}
		System.out.println("-------------------");
		System.out.println();
	}

}
