package oop;

public class Order {

	public void orderMenu(int blackSoybeanCount, int spicySeaFoodCount, int friedRiceCount) {
		Menu blackNuddle = new Menu();
		Menu redNuddle = new Menu();
		Menu rice = new Menu();

		blackNuddle.menuName = "짜장면";
		redNuddle.menuName = "짬뽕";
		rice.menuName = "볶음밥";

		int cookingTime = calcCookingTime(blackSoybeanCount, spicySeaFoodCount, friedRiceCount);
		int price = calcTotalPrice(blackSoybeanCount, spicySeaFoodCount, friedRiceCount);

		System.out.println(blackNuddle.menuName + blackSoybeanCount + "개, " 
							+ redNuddle.menuName + spicySeaFoodCount + "개, " 
							+ rice.menuName + friedRiceCount + "개");
		if (cookingTime > 60) {
			System.out.println("조리 예상 시간은 " + cookingTime / 60 + "시간 " + cookingTime % 60 + "분 이고");
		} else {
			System.out.println("조리 예상 시간은 " + cookingTime + "분 이고");
		}
		System.out.println("가격은 " + price + "입니다");

	}

	public int calcCookingTime(int firstMenuQuantity, int secondMenuQuantity, int thirdMenuQuantity) {

		Menu blackNuddle = new Menu();
		Menu redNuddle = new Menu();
		Menu rice = new Menu();

		blackNuddle.cookingTime = 7;
		redNuddle.cookingTime = 9;
		rice.cookingTime = 5;

		int totalCookingTime = blackNuddle.cookingTime * firstMenuQuantity + redNuddle.cookingTime * secondMenuQuantity
				+ rice.cookingTime * thirdMenuQuantity;

		return totalCookingTime;

	}

	public int calcTotalPrice(int firstMenuQuantity, int secondMenuQuantity, int thirdMenuQuantity) {
		Menu blackNuddle = new Menu();
		Menu redNuddle = new Menu();
		Menu rice = new Menu();

		blackNuddle.price = 7_000;
		redNuddle.price = 8_000;
		rice.price = 7_500;

		int totalPrice = blackNuddle.price * firstMenuQuantity + redNuddle.price * secondMenuQuantity
				+ rice.price * thirdMenuQuantity;
		return totalPrice;
	}

}
