package com.ktdsuniversity.edu.anonymous;

import com.ktdsuniversity.edu.store.abstraction.AbstractMart;
import com.ktdsuniversity.edu.store.abstraction.Guest;

public class AnonymousClass {
	public static void main(String[] args) {
		AbstractMart mart = new AbstractMart(1500) {

			@Override
			public int usePoint(Guest guest) {
				return 0;
			}

			@Override
			public void givePoint(Guest guest, int amount) {
				guest.addPoint(1000000);
			}

			@Override
			public int discount(Guest guest, int amount) {
				return 0;
			}
		};
		Guest guest = new Guest(0, 0, 0);
		
		mart.sell(guest, 10000, 0);
		System.out.println(mart);
	}
}
