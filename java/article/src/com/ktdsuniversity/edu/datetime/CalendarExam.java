package com.ktdsuniversity.edu.datetime;

import java.time.Year;
import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
//		System.out.println(now.getTime());
//		System.out.println(now.getTime());
//		System.out.println(now.get(1));
//		
//		System.out.println(now.get(Calendar.YEAR));
//		
//		System.out.println(now.get(Calendar.DAY_OF_MONTH));
//		now.setFirstDayOfWeek(Calendar.MONDAY);
//		System.out.println(now.get(Calendar.DAY_OF_WEEK));
//		System.out.println(now.get(Calendar.day));

		int week = Calendar.DAY_OF_WEEK;
		
//		System.out.println(weekDays[now.get(week) - 1]);

//		cal
		Calendar birthdate = Calendar.getInstance();
		birthdate.set(2001, 5 - 1, 12);

//		System.out.println(weekDays[birthdate.get(week) - 1]);

		Calendar now2 = Calendar.getInstance();
		now2.add(Calendar.DAY_OF_MONTH, 56);

//		Calendar now3 = Calendar.getInstance();
//		Calendar past = Calendar.getInstance();
//		past.set(2025, 2 - 1, 4);
//		long nowTime = now3.getTimeInMillis();
//		System.out.println(nowTime);
//		long pastTime = past.getTimeInMillis();
//		System.out.println(pastTime);
//		if (pastTime < nowTime) {
//			System.out.println("더 과거입니다");
//		}
		Calendar now4 = Calendar.getInstance();
		int daysCount = 0;
//		while (true) {
//			now4.add(Calendar.DAY_OF_MONTH, 1);
//			daysCount++;
//
//			if (now4.get(Calendar.YEAR) == 2026 && now4.get(Calendar.MONTH) == 6
//					&& now4.get(Calendar.DAY_OF_MONTH) == 14) {
//				break;
//			}
//			System.out.println(daysCount + "일");
		//// if (now.getTime() ) {
		//// 
		/// }
//		}
		String[] weekDays = { "일", "월", "화", "수", "목", "금", "토" };
		Calendar now5 = Calendar.getInstance();
		int workDate = 0;
		
		while (workDate < 7) {
			now5.add(Calendar.DAY_OF_MONTH, 1);
			if (now5.get(Calendar.DAY_OF_WEEK) != 1 && 
				now5.get(Calendar.DAY_OF_WEEK) != 7) {
				workDate++;
			}
		}
//		System.out.println(Calendar.DAY_OF_WEEK);
		System.out.println(workDate + "영업일 뒤:");
		System.out.println(now5.get(Calendar.YEAR) + "년 " +
						  (now5.get(Calendar.MONTH) + 1) + "월 " +
						   now5.get(Calendar.DAY_OF_MONTH) + "일 " +
						   weekDays[now5.get(week) - 1] + "요일");

//		System.out.println(now2.get(Calendar.YEAR));
//		System.out.println(now2.get(Calendar.DAY_OF_MONTH) + 1);
//		System.out.println(now2.get(Calendar.DAY_OF_WEEK));
//		System.out.println(weekDays[now2.get(week) - 1]);

	}
}
