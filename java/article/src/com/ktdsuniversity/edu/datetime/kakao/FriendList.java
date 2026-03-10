package com.ktdsuniversity.edu.datetime.kakao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FriendList {
	private List<Friend> friends;

	public FriendList() {
		this.friends = new ArrayList<>();
	}

	public void add(Friend friend) {
		this.friends.add(friend);
	}

	public void printSpecialFriends(Base base) {
		LocalDate temp = null;
		for (Friend friend : this.friends) {
			temp = LocalDate.parse(friend.getBirthdate().toString());
			temp = temp.withYear(LocalDate.now().getYear());
			if (base == base.FUTURE) {
				if (temp.isAfter(LocalDate.now()) &&
					temp.isBefore(LocalDate.now().plusDays(7))) {
					System.out.println("생일이 다가오는 친구" + friend);
				}
			} else if (base == base.NOW) {
				if (temp.toString().equals(LocalDate.now().toString())) {
					System.out.println("오늘 생일인 친구" + friend);
				}

			} else if (base == base.PAST) {
				if (temp.isAfter(LocalDate.now()) &&
					temp.isBefore(LocalDate.now().minusDays(8))){
						System.out.println("생일이 지난 친구");
					
				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		if (this.friends.size() == 0) {
			buffer.append("등록된 친구가 없습니다");
		} else {
			for (Friend f : this.friends) {
				buffer.append(f);
			}
		}

		return buffer.toString();
	}

}
