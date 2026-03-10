package exam;

public class FlightFare {
	
	public static int getFlightFare (int flightFare) {
		
		return 0;
	}

	public static void main(String[] args) {
		int money = 1_000_000;
		
		int father = 40;
		int mother = 36;
		int daughter = 11;
		
		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
		
		// Case 1. 비행 요금을 계산.
		int flightFare = 0;
		flightFare += getFlightFare(father);
		flightFare += getFlightFare(mother);
		flightFare += getFlightFare(daughter);
		
//		if (father >= 19) {
//			flightFare += adultOneWayFlightFare;
//		}
//		else {
//			flightFare += kidOneWayFlightFare;
//		}
//		
//		if (mother >= 19) {
//			flightFare += adultOneWayFlightFare;
//		}
//		else {
//			flightFare += kidOneWayFlightFare;
//		}
//		
//		if (daughter >= 19) {
//			flightFare += adultOneWayFlightFare;
//		}
//		else {
//			flightFare += kidOneWayFlightFare;
//		}
		
		// Case 2. 성인의 수, 아동의 수.
		int adultCount = 0;
		int kidCount = 0;
		if (father >= 19) {
			adultCount++;
		}
		else {
			kidCount++;
		}
		
		if (mother >= 19) {
			adultCount++;
		}
		else {
			kidCount++;
		}
		
		if (daughter >= 19) {
			adultCount++;
		}
		else {
			kidCount++;
		}
		
		flightFare = adultOneWayFlightFare * adultCount + kidOneWayFlightFare * kidCount;
		
		// Case 3. 비행 요금. 케이스 계산 X
		//         삼항 연산. ==> if ~ else 대체. (권장하지 않음 - 성능이 다소 느리다.)
		flightFare = father >= 19 ? adultOneWayFlightFare : kidOneWayFlightFare;
		flightFare += mother >= 19 ? adultOneWayFlightFare : kidOneWayFlightFare;
		flightFare += daughter >= 19 ? adultOneWayFlightFare : kidOneWayFlightFare;
		
		if (flightFare > money) {
			System.out.println("다음에 가자!");
		}
		else {
			System.out.println("여행 가자!");
		}
		
	}
	
}