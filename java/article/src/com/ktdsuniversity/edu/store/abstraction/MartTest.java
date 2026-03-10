package com.ktdsuniversity.edu.store.abstraction;

public class MartTest {
	public static void main(String[] args) {
		
		int point = 10_000;
		
		
		Guest guest = new Guest(200_000, 0, 1);
		Guest guest2 = new VIP(7_000, 300, 2);
		Guest guest3 = new VVIP(7000, point, 3);
		
		AbstractMart mart = new ConvenienceStore(1500);
		AbstractMart dept = new DepartmentStore(6_000);
		mart.sell(guest, 5, 20_000);
		System.out.println(guest);
		System.out.println();
		
		mart.sell(guest2, 5, 7_000);
		System.out.println(guest2);
		System.out.println();
		
		dept.sell(guest3, 1, 7000);
		System.out.println(guest3);
		
		
	}
}
