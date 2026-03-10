package com.ktds.edu.fp.basic;

import com.ktds.edu.fp.basic.impl.CallAge;
import com.ktds.edu.fp.basic.impl.PrintName;
import com.ktds.edu.fp.basic.impl.PrintName2;

public class CallFunction {
	public void callInterface(PrintSomething ps) {
		String something = "hello ";
		ps.print(something);
	}

	public void callAbstractClass(CallSomething cs) {
		String something = "오십";
		int result = cs.call(something);
		System.out.println(result);
	}

	public static void main(String[] args) {

		CallFunction cf = new CallFunction();

//		cf.callInterface(new PrintName2());
//		cf.callInterface(new PrintName());
//		cf.callAbstractClass(new CallAge());

//		cf.callInterface(new PrintSomething() {
//
//			@Override
//			public void print(String message) {
//		System.out.println(message);
//		if (message != null) {
//			System.out.println(message + "는 " + message.length() + "글자입니다");
//		}
//			}
//		});
//		cf.callAbstractClass(new CallSomething() {
//
//			@Override
//			public int call(String message) {
//				if (message != null) {
//					return message.length();
//				}
//				return 0;
//			}
//		});
		cf.callInterface((String message) -> System.out.println(message + "입니다"));
		cf.callInterface((String message) -> System.out.println(message.length()));
		
		PrintSomething function = ((String message) -> {
			if (message != null) {
//				System.out.println(message + "는 " + message.length() + "글자입니다");
			} else {
//				System.out.println(message.repeat(40));
			}
		});
//		System.out.println(function);
		cf.callInterface(function);
		
//		추상 클래스는 람다식을 사용할 수 없음
//		오직 단 하나의 메소드만 가지는 인터페이스만 람다식을 사용할 수 있음
//		인터페이스에 @FunctionalInterface 어노테이션을 사용해 메소드가 하나임을 강제

//		cf.callAbstractClass((String message) -> {return 0;});

	}
}
