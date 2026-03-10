package java_exam;

public class TypeCasting {
	public static void main(String[] args) {
		
		int num = 10;
		float fnum = num;
		double dnum = num;
		
//		정수 -> 부동소수점 변환에서 묵시적 변환이 가능한 이유
//		- 부동소수점은 정수보다 표현하는 범위가 같은 byte를 사용하더라도 더 크기 때문
//		- 부동소수점 = 정수 + 소수점
		System.out.println(num);  //10
		System.out.println(fnum); //10.0
		System.out.println(dnum); //10.0
		
//		부동소수점 -> 정수 변환 시 소수점 밑 데이터가 사라지는 이유
//		정수는 소수점 이하의 자릿수를 표현할 수 없으므로 소수점 이하 자리는 출력되지 않음
		fnum = 10.9f;
		num = (int) fnum;
		System.out.println(fnum); //10.9
		System.out.println(num);  //10
		
		dnum = 10.1;
//		소수점 올림
		dnum = Math.ceil(dnum);
		System.out.println(dnum); //11.0
		
//		소수점 버림
		dnum = 10.9;
		dnum = Math.floor(dnum);
		System.out.println(dnum); //10.0

//		소수점 반올림
		dnum = 15.18;
		dnum = Math.round(dnum);
		System.out.println(dnum); //15.0

		dnum = 10.56;
		dnum = Math.round(dnum);
		System.out.println(dnum); //11.0
		
	}
}
