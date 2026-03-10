package oop;

public class Student {
	int java;
	int python;
	int cpp;
	int csharp;
	
	/**
	 * 멤버 변수를 모두 더해 int타입으로 반환
	 * @return
	 */
	public int getSumAllScores() {
		return java + python + cpp + csharp;
	}
	
	/**
	 * 총합 / 4의 결과를 소수점 아래 두 자리까지만 반환
	 * @return
	 */
	public double getAverage() {
		return getSumAllScores() / 4.0;
	}
	
	/**
	 * (평균점수 - 55) /10의 결과를 소수점 아래 두 자리까지만 반환
	 * @return
	 */
	public double getCourseCredit() {
		return (getAverage() - 55) / 10;
	}
	
	/**
	 * 학점을 아래 기준에 맞춰 반환
	 * @return
	 */
	public String getABCD() {
		if (getCourseCredit() >= 4.0) {
			return "A+";
		} else if (getCourseCredit() >= 3.5) {
			return "A";
		} else if (getCourseCredit() >= 3.0) {
			return "B+";
		} else if (getCourseCredit() >= 2.5) {
			return "B";
		} else if (getCourseCredit() >= 1.5) {
			return "C";
		} else if (getCourseCredit() >= 0.5) {
			return "D";
		}else {
			return "F";
		}
	}
	
}
