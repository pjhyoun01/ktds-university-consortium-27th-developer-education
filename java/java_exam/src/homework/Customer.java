package homework;

public class Customer {
	int cartCount;
	int money;

	final double PER_WEIGHT = 0.5;
	double currentWeight;
	double maxWeight = 10.0;

	public Customer(int money) {
		this.money = money;
		this.cartCount = 0;
		this.currentWeight = 0.0;
	}

	public void buy(Seller seller, int amount) {
		if (this.money < (amount * seller.PRICE)) {
			System.out.println("돈이 부족합니다.");
			printStatus();
			return;
		}
		
		if (this.currentWeight + (amount * PER_WEIGHT) > maxWeight) {
			System.out.println((int) maxWeight + "kg 까지만 들 수 있습니다");
			System.out.println("현재 무게: " + amount * PER_WEIGHT);
			printStatus();
			return;
		}

		int boughtCount = seller.sell(amount);

		if (boughtCount > 0) {
			this.cartCount += boughtCount;
			this.money -= (boughtCount * seller.PRICE);
			this.currentWeight += (boughtCount * PER_WEIGHT);
		}

		printStatus();
	}

	public void printStatus() {
		System.out.println("상품 수: " + cartCount + "개 ");
		System.out.println("현재 무게: " + currentWeight + "kg");
		System.out.println("지갑: " + money + "원");

	}
}