package com.ktdsuniversity.edu.singleton;

public class Me {

	private static Me me;

	private String name;

	private Me() {
		this.name = "박재현";
	}
	
	public static Me getInstance() {
		if (Me.me == null) {
			Me.me = new Me();
		}
		return Me.me;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
