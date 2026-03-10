package homework;

public class BuyTest {
	public static void main(String[] args) {
		Seller seller = new Seller(0, 10_000);
		
		Customer customer = new Customer(116_000);
		
		customer.buy(seller, 30);
	}
}
