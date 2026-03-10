package com.ktdsuniversity.edu.article.management;

import java.util.Scanner;

import com.ktdsuniversity.edu.member.management.Member;

public class Article {
	String title;	
	String content;
	Member author;

	public Article(String title, Member author, String content) {
		this.title = title;
		this.author = author;
		this.content = content;
	}
	
	public void viewArticleDescription() {
		System.out.println("제목: "+ this.title);
		System.out.println("내용: " + this.content);
		System.out.println("작성자 ID: " + this.author.getName());
		System.out.println("작성자 이름: " + this.author.getId() + "\n");
	}
	
	public String inputKeyboard() {
		Scanner sc = new Scanner(System.in);
		String content = sc.next();
		return content;
	}
	
	public void write() {
		System.out.print("제목을 입력하세요: ");
		this.title = inputKeyboard();
		System.out.print("내용을 입력하세요: ");
		this.content = inputKeyboard();
		System.out.print("작성자을 입력하세요: ");
		this.author.setName(inputKeyboard());
		System.out.print("작성자id을 입력하세요: ");
		this.author.setId((String)inputKeyboard());
	}
	
	public static void main(String[] args) {
		Member author = new Member("superuser", "관리자");
		Article article = new Article("테스트", author, "내용");
		
		article.viewArticleDescription();
		article.write();
		article.viewArticleDescription();
	}
	
}
