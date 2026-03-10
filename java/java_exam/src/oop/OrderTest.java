package oop;

public class OrderTest {
	public static void main(String[] args) {
		Order firstTable = new Order();
		firstTable.orderMenu(4, 5, 0);
		
		Order secondTable = new Order();
		secondTable.orderMenu(1, 0, 5);
	}
}
