package com.ktdsuniversity.edu.string;

public class StrBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("asd");

//		for (int i = 0; i < 100_000_000; i++) {
//			sb.append("asdasdasd");
//		}
		String str = sb.toString();
		System.out.println(str);
	}
	
//	public static void appenfString() {
//		
//	}
}
