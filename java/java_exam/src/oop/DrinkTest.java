package oop;

public class DrinkTest {
	public static void main(String[] args) {
		Drink bacchus = new Drink("박카스", 15, 900);  
		Drink monster = new Drink("몬스터", 20, 1_500);
		Drink hotsix = new Drink("핫식스", 10, 1_300);
		Drink milkiss = new Drink("밀키스", 5, 1_400); 
		
		DrinkMachine drinkMachine = new DrinkMachine(bacchus, monster, hotsix, milkiss);
		
		drinkMachine.printQuantity();
		
		drinkMachine.orderDrink(4, 6);
		drinkMachine.warehousingDrink(1, 3);
		
	}
}
