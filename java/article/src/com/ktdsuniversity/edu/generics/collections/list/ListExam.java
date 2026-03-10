package com.ktdsuniversity.edu.generics.collections.list;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.store.inheritance.VO.ProductVO;

public class ListExam {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("박재현1");
		names.add("박재현2");
		names.add("박재현3");
		names.add("박재현4");
		names.add("박재현5");
		names.add("박재현6");
		
		for (String name2 : names) {
			System.out.println(name2);
		}
		
		System.out.println(names);
		String name = null;
		for (int i = 0; i< names.size(); i++) {
			name = names.get(i);
			System.out.println(name);
		}
		
//		List<ProductVO> product = new ArrayList<>();
		int[] arr = new int [] {1, 2, 3};
		for (int value : arr) {
			System.out.println(value);
		}
		
	}
}
