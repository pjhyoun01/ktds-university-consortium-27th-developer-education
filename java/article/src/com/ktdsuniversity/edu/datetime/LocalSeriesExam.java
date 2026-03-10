package com.ktdsuniversity.edu.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.swing.text.DateFormatter;

public class LocalSeriesExam {
	public static void main(String[] args) {
		/*
		 * LocalDate: 날짜만 처리 LocalTime: 시간만 처리 LocalDateTime: 날짜와 시간 모두 처리
		 */
		// 현재 날짜 출력
		LocalDate nowDate = LocalDate.now();
//		System.out.println(nowDate);

		// 현재 시간 출력
		LocalTime nowTime = LocalTime.now();
//		System.out.println(nowTime);

		// 날짜 시간 포멧
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss"); /* ss.SS <- 원하는 소수점 자리만큼 초 뒤에 .S입력 */
		String formattedTime = dtf.format(nowTime);
//		System.out.println(formattedTime);

		// 현재 날짜 + 시간 출력
		LocalDateTime nowDateTime = LocalDateTime.now();
//		System.out.println(nowDateTime);

		dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd E요일 HH:mm:ss");
		String formattedDateTime = dtf.format(nowDateTime);
//		System.out.println(formattedDateTime);

		// 태어난 날짜의 요일
		LocalDate birthdate3 = LocalDate.of(2001, 5, 12);
//		System.out.println(birthdate3);
//		System.out.println(birthdate3.getDayOfYear());
//		System.out.println(birthdate3.getDayOfMonth());
//		System.out.println(birthdate3.getDayOfWeek());
		
		dtf = DateTimeFormatter.ofPattern("E요일");
//		System.out.println(dtf.format(birthdate3));
		
		LocalDate birthday = LocalDate.parse("2001-05-12");
//		System.out.println(birthday);
//		System.out.println(birthday.getYear());

		LocalDate birthday2 = LocalDate.parse("2001년 05월 12일", DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
//		System.out.println(birthday2);

		LocalDate now = LocalDate.now();
		
		// 19일 이후
//		System.out.println(now.plusDays(19));
//		
//		// 35년 후
//		System.out.println(now.plusYears(35));
//		
//		// 97년 전
//		System.out.println(now.minusYears(97));
//		
//		// 1300 개월 이후
//		System.out.println(now.plusMonths(1300));
		
		//25.01.01은 26.01.01보다 과거?
		LocalDate date1 = LocalDate.parse("2025-01-01");
		LocalDate date2 = LocalDate.parse("2026-01-01");
//		System.out.println(date1.isBefore(date2));
		
		//26.12.11은 25.02.05보다 미래?
		LocalDate date3 = LocalDate.parse("2026-12-11");
		LocalDate date4 = LocalDate.parse("2025-02-05");
//		System.out.println(date3.isAfter(date4));
		
//		LocalDate.parse(Period.between(date3, date4), DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 차이"));
//		System.out.println(Period.between(date3, date4));
//		System.out.println(Period.between(date3, date4).getYears());
//		System.out.println(Period.between(date3, date4).getMonths());
//		System.out.println(Period.between(date3, date4).getYears());
		
		System.out.println(ChronoUnit.DAYS.between(date3, date4));
		System.out.println(ChronoUnit.YEARS.between(date3, date4));
		
	}
	
}