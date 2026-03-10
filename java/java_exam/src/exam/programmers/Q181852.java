package exam.programmers;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Q181852 {
	Scanner sc = new Scanner(System.in);

	int[] numArray = { 12, 4, 15, 46, 38, 1, 14, 56, 32, 10 };
	int[] numArray2 = { 12, 4, 15, 46, 38, 1, 14, 56, 32, 10, 5 };
	int[] numArray3 = { 12, 4, 15, 46, 38, 1, 14, 56, 66, 10 };
	int[] numArray4 = { 5, 1, 2 };

	public static void main(String[] args) {
		Q181852 q = new Q181852();

		int temp = 0;
//		for (int i = 0; i < numArray.length; i++) {
//			for (int j = i + 1; j < numArray.length; j++) {
//				if (numArray[i] > numArray[j]) {
//					temp = numArray[i];
//					numArray[i] = numArray[j];
//					numArray[j] = temp;
//				}
//			}
//		}
//		for (int i = 5; i < numArray.length; i++) {
//			System.out.print(numArray[i] + " ");
//		}
//		System.out.println();

//		181853
//		for (int i = 0; i < 5; i++) {
//			System.out.print(numArray[i] + " ");
//		}

//		181854
//		int num = 20;
//		if (numArray.length % 2 == 1) {
//			for (int j = 2; j < numArray.length - 2; j += 2) {
//				numArray[j] += num;
//			}
//		} else {
//			for (int j = 1; j < numArray.length - 1; j += 2) {
//				numArray[j] += num;
//			}
//		}
//		for (int i = 0; i < numArray.length; i++) {
//			System.out.println(numArray[i]);
//		}

//		181856
//		q.q181856(q.numArray, q.numArray3);

//		181861
//		q.q181861(q.numArray4);

//		181867
//		마지막 x 뒤에 0출력 생각하기
		String str = "oxoxxoox";
//		q.q181867(str);

//		181868
//		str = " i    love  you";
//		q.q181868(str);
//		str = "    programmers  ";
//		q.q181868(str);

//		181869
//		str = "i love you";
//		q.q181869(str);
//		str = "programmers";
//		q.q181869(str);

//		2566
//		int[][] nineByNineArray = {{3, 23, 85, 34, 17, 74, 25, 52, 65},
//								   {10, 7, 39, 42, 88, 52, 14, 72, 63},
//								   {87, 42, 18, 78, 53, 45, 18, 84, 53},
//								   {34, 28, 64, 85, 12, 16, 75, 36, 55},
//								   {21, 77, 45, 35, 28, 75, 90, 76, 1},
//								   {25, 87, 65, 15, 28, 11, 37, 28, 74},
//								   {65, 27, 75, 41, 7, 89, 78, 64, 39},
//								   {47, 47, 70, 45, 23, 65, 3, 41, 44},
//								   {87, 13, 82, 38, 31, 12, 29, 29, 80}};
//		q.q2566(nineByNineArray);

//		10798
		String[] strArray = { "ABCDE", "abcde", "01234", "FGHIJ", "fghij" };
		q.q10798(strArray);
		String[] strArray2 = { "AABCDD", "afzz", "09121", "a8EWg6", "P5h3kx" };
		q.q10798(strArray2);
	}

	private void q10798(String[] strArray) {
		String[][] strDoubleArray = new String[9][9];
		String[] tempStrArray = null;

		for (int i = 0; i < strArray.length; i++) {
			for (int j = 0; j < strArray[i].length(); j++) {
				tempStrArray = strArray[i].split("");
				strDoubleArray[i][j] = tempStrArray[j];
			}
		}
//		for (int i = 0; i < strArray.length; i++) {
//			for (int j = 0; j < strArray[i].length(); j++) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if(strDoubleArray[j][i] != null) {					
					System.out.print(strDoubleArray[j][i]);
				} 
			}
		}
		System.out.println();
	}

	public void q181856(int[] numArray, int[] numArray2) {
		int sum1 = 0;
		int sum2 = 0;
		if (numArray.length == numArray2.length) {
			for (int i = 0; i < numArray.length; i++) {
				sum1 += numArray[i];
				sum2 += numArray2[i];
			}
			if (sum1 == sum2) {
				System.out.println(0);
			} else if (sum1 > sum2) {
				System.out.println(1);
			} else {
				System.out.println(-1);
			}
		} else if (numArray.length > numArray2.length) {
			System.out.println(1);
		} else {
			System.out.println(-1);
		}
	}

	private void q181861(int[] numArray) {
		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray[i]; j++) {
				System.out.println(numArray[i]);
			}
		}
	}

	private void q181867(String str) {

		String[] xArray = str.replaceAll("x", " ").split(" ");
		String[] countArray;
		int num = 0;
		for (int i = 0; i < xArray.length; i++) {
			num = 0;
			countArray = xArray[i].split("");
			num = countArray.length;
			if (xArray[i] == "") {
				num = 0;
			}
			System.out.print(num + " ");
		}
	}

	private void q181868(String str) {
		String[] strArray = str.split(" ");
		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = strArray[i].trim();
			if (strArray[i] != "") {
				System.out.print(strArray[i] + " ");
			}
		}
		System.out.println();
	}

	private void q181869(String str) {
		String[] strArray = str.split(" ");
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i] + " ");
		}
		System.out.println();
	}

	private void q2566(int[][] nineByNineArray) {
		int max = nineByNineArray[0][0];
		for (int i = 0; i < nineByNineArray.length; i++) {
			for (int j = 0; j < nineByNineArray.length; j++) {
				if (max < nineByNineArray[i][j]) {
					max = nineByNineArray[i][j];
				}
			}
		}
		System.out.println(max);
		for (int i = 0; i < nineByNineArray.length; i++) {
			for (int j = 0; j < nineByNineArray.length; j++) {
				if (max == nineByNineArray[i][j]) {
					System.out.print((i + 1) + " " + (j + 1));
				}
			}
		}
	}
}
