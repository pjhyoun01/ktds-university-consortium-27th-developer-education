package com.ktdsuniversity.edu.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScoreListTest {
	public static void main(String[] args) {
		
//		ScoreList<Integer> intList = new ScoreList<Integer>();		
//		생성자 제네릭은 생략 가능
		ScoreList<Integer, Integer> intList = new ScoreList<>();
		intList.add(123123);
		intList.add(123123);
		intList.add(123123);
		intList.add(123123);
		intList.add(123123);
		intList.add(123123);
		intList.add(123123);
		intList.add(123123);
		intList.add(123123);
		intList.add(123123);
		intList.add(123123);
		intList.add(123123);
		
//		int sum = 0;
//		for(int i = 0; i < 6; i++) {
//			sum += intList.get(i);
//		}
//		System.out.println(sum);
		Reducer<Integer, Integer> listReducer = new Reducer<>() {

			@Override
			public Integer reduce(Integer input, Integer output) {
				return input + output;
			}
			
		};
		
		int sum = intList.sum(listReducer, 0);
		System.out.println(sum);
		
		
//		for()
//		System.out.println(intList.);
		int value = intList.get(3);
		System.out.println(value);
		
		
		ScoreList<String, String> strList = new ScoreList<>();
		strList.add("hello");
		strList.add("hi");
		String strValue = strList.get(0);
		System.out.println(strValue);
		
		String strSum = "";
		for(int i = 0; i < 2; i++) {
			strSum += strList.get(i);
		}
		System.out.println(strSum);
		
		ScoreList<String[], String> arrayList = new ScoreList<>();
		arrayList.add(new String[] {"Asd", "asd"});
		arrayList.add(new String[] {"Asd", "asd"});
//		String[] arrayValue = arrayList.get(1);
//		System.out.println(Arrays.toString(arrayValue));
		
//		String arrayConcat = "";
//		for (int i = 0; i < 2; i++) {
//			arrayConcat += Arrays.toString(arrayList.get(i));
//		}
//		System.out.println(arrayConcat);
		
		Reducer<String[], String> arrayReducer = new Reducer<>() {
			@Override
			public String reduce(String[] input, String output) {
				for (int i = 0; i< input.length; i++) {
					output += input[i];
				}
				return output;
			}
			
		};
		String arrayResult = arrayList.sum(arrayReducer, "");
		System.out.println(arrayResult);
		
		List<Integer> list = new ArrayList<>();
	}
}
