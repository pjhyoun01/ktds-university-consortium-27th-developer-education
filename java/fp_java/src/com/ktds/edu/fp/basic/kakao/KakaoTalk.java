package com.ktds.edu.fp.basic.kakao;

import java.time.LocalDate;
import java.time.Period;

public class KakaoTalk {
	public static void main(String[] args) {
		FriendList fl = new FriendList();

		fl.add(new Friend("A", "2000-02-10"));
		fl.add(new Friend("B", "2001-11-01"));
		fl.add(new Friend("C", "2004-05-16"));
		fl.add(new Friend("D", "2001-02-28"));
		fl.add(new Friend("김재현", "2001-02-05"));
		fl.add(new Friend("이재현", "2001-02-09"));
		fl.add(new Friend("박범근", "2001-01-30"));
		fl.add(new Friend("이범근", "1996-02-05"));

//		System.out.println("7일 이내에 생일을 맞이하는 친구 목록");
		//// fl.printSpecialFriends( birthdate -> birthdate.isAfter(LocalDate.now())
		/// && birthdate.isBefore(LocalDate.now().plusDays(8)));
//		fl.printSpecialFriends(friend -> {
//			LocalDate now = LocalDate.now();
//			LocalDate birthdate = friend.getBirthdate().withYear(now.getYear());
//			return birthdate.isAfter(now) && birthdate.isBefore(now.plusDays(8));
//		});
//		System.out.println("오늘이 생일인 친구 목록");
		//// fl.printSpecialFriends(birthdate -> birthdate.isEqual(LocalDate.now()));
//		fl.printSpecialFriends(friend -> {
//			LocalDate now = LocalDate.now();
//			LocalDate birthdate = friend.getBirthdate().withYear(now.getYear());
//			return birthdate.isEqual(now);
//		});
//		
//		
//		
//		System.out.println("7일 이내에 생일이 지난 친구 목록");
		//// fl.printSpecialFriends( birthdate ->
		/// birthdate.isAfter(LocalDate.now().minusDays(8))
		/// && birthdate.isBefore(LocalDate.now()));
//		fl.printSpecialFriends(friend -> {
//			LocalDate now = LocalDate.now();
//			LocalDate birthdate = friend.getBirthdate().withYear(now.getYear());
//			return birthdate.isAfter(now.minusDays(8)) && birthdate.isBefore(now);
//		});
//		System.out.println();
//		
//		System.out.println("오늘 만 30세가 된 친구 목록");
//		fl.printSpecialFriends(friend -> {
//			LocalDate now = LocalDate.now();
//			Period period = Period.between(friend.getBirthdate(), now);
//			return period.getYears() == 30 && period.getMonths() == 0 && period.getDays() == 0;
//		});

//		System.out.println("이름이 'A'인 친구 목록");
//		fl.printSpecialFriends(friend -> friend.getName().equals("A"));
//
//		System.out.println("이름이 '김'인 친구 목록");
//		fl.printSpecialFriends(friend -> friend.getName().startsWith("김"));
//
//		System.out.println("이름이 '이'로 시작하면서 20세 이상인 친구 목록");
//		fl.printSpecialFriends(friend -> friend.getName().startsWith("이") && friend.getBirthdate().getYear() >= 20);
//		System.out.println();
		
		System.out.println("전체 친구 목록");
//		System.out.println(fl);
		fl.printSpecialFriends2(friend -> true);
	}

}