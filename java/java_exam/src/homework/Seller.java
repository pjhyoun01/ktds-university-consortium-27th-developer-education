package homework;

public class Seller {
	final int PRICE = 1000;
	int stock;
	int capital;

	public Seller(int stock, int capital) {
		this.stock = stock;
		this.capital = capital;
	}

	public int sell(int amount) {
		if (this.stock <= 0) {
			System.out.println("품절되었습니다.");
			printStatus();
			return 0;
		}

		int isSold;
		if (this.stock < amount) {
			isSold = this.stock;
		} else {
			isSold = amount;
		}

		this.stock -= isSold;
		this.capital += (isSold * PRICE);

		System.out.println(isSold + "개가 판매되었습니다.");
		printStatus();

		return isSold;
	}

	public void printStatus() {
		System.out.println("재고: " + stock + "개");
		System.out.println("자본금: " + capital + "원");
	}
	
}