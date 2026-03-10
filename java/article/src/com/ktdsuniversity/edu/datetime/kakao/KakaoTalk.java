package com.ktdsuniversity.edu.datetime.kakao;

public class KakaoTalk {
	public static void main(String[] args) {
		FriendList fl = new FriendList();
		fl.add(new Friend("박재현", "2001-05-12"));
		fl.add(new Friend("박범근", "1994-01-01"));
		fl.add(new Friend("박승재", "2000-02-23"));
		fl.add(new Friend("김재현", "2005-02-04"));
		fl.add(new Friend("이재현", "2005-02-05"));
		fl.add(new Friend("최재현", "2005-02-06"));
		fl.add(new Friend("순재현", "2005-02-01"));
		fl.add(new Friend("손재현", "2005-02-02"));
		fl.add(new Friend("백재현", "2005-02-03"));
		
		fl.printSpecialFriends(Base.FUTURE); //
		fl.printSpecialFriends(Base.NOW); //
		fl.printSpecialFriends(Base.PAST); //
		
		System.out.println(fl);
	}

}
