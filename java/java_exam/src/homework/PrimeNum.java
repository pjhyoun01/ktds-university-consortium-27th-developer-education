package homework;

public class PrimeNum {
	public static void main(String[] args) {
		/**
		 * 2부터 100_000까지 소수만 출력하는 프로그램을 작성하시오
		 * isPrime이 flase로 바뀌는 경우가 있으므로 true로 초기화
		 * i는 2부터 100_000까지 반복
		 * 		i를 2부터 i의 절반이 될 때까지 나누었을 때 나머지가 0이 되는 경우가 없다면 소수이므로
		 * 		j는 2부터 i/2까지 반복 
		 * 			i를 j(2부터 i/2까지)로 나누면서 나머지가 0일 경우
		 * 				isPrime는 false로 변경
		 * 				소수가 아니므로 반복문 탈출
		 * 		isPrime이 true일 경우
		 * 			j를 빠져 나와서 소수를 출력하고
		 * 			줄바꿈 카운트를 +1
		 * 				만약 줄바꿈 카운트 나누기 10이 0일 경우
		 * 				줄바꿈
		 */
		int lineChangeCount = 0;
		boolean isPrime = true;
		for (int i = 2; i <= 100_000; i++) {
			isPrime = true;
			
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime == true) {
				System.out.print(i + "\t");
				lineChangeCount++;
				
				if (lineChangeCount % 10 == 0) {
					System.out.println();
				}
			}
		}
	}
}