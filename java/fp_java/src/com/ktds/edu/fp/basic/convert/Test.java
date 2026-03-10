package com.ktds.edu.fp.basic.convert;

public class Test {
	public static void main(String[] args) {
		Converter converter = new Converter();
//		converter.printConvertResult("10", str -> Integer.parseInt(str));
		
		converter.printConvertResult("10", Integer::parseInt);
		
//		converter.printConvertResult("asdasd", str -> str.length());
//		converter.printConvertResult("asdasd", String::length);
		
		converter.printConvertResult2("10", Integer::parseInt);
		
	}
}
