package com.ktdsuniversity.edu.member.management;

public class Member {
	public String id;
	public String name;

	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public void printInfo() {
		System.out.println("작성자 ID: " + this.id);
		System.out.println("작성자 명: " + this.name);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
	
	
	
	
	
	
	
	public void setId(String id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}

}
