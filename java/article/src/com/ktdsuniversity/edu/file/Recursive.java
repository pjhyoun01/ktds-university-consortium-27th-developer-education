package com.ktdsuniversity.edu.file;

import java.io.File;
import java.util.Properties;

public class Recursive {
	
	public void deleteDerectory(File target) {
		if (target.isFile()) {
			System.out.println(target.getAbsolutePath());
			target.delete();
		} else if (target.isDirectory()) {
			File[] children = target.listFiles();
			
			for (File child: children) {
				this.deleteDerectory(child);
			}
			System.out.println(target.getAbsolutePath());
			target.delete();
		}
	}

	public void printFiles(File target) {
		if (target.isFile()) {
			System.out.println(target.getAbsolutePath());
		} else if (target.isDirectory()) {
			File[] children = target.listFiles();
			
			for (File child: children) {
//				System.out.println(child.getAbsolutePath());
				this.printFiles(child);
			}
		}
	}
	
	public void print(int number) {
		System.out.println("출력합니다. - " + number);
		if (number > 0) {
			print(number - 1);			
//			System.out.println(number + "스택 실행 완료");
		}
	}
	public int printSum(int number) {
		if (number == 1) {
			return 1;
		}
		return number + printSum(number - 1);
	}
	
	public static void main(String[] args) {
		Recursive r = new Recursive();
//		r.print(2000);
		
//		System.out.println(r.printSum(5));
		
		
//		File root = new File("C:/dev_programs/");
//		
//		r.printFiles(root);
		
		File root = new File("C:\\dev_programs\\삭제대상");
		r.deleteDerectory(root);
	}
}
