package com.ktdsuniversity.edu.store.inheritance.membershiplevel;

import com.ktdsuniversity.edu.store.inheritance.VO.CustomerVO;

public class VIP extends CustomerVO {
	public VIP(String name, int currentAmount) {
		super(name, currentAmount);
	}

	public VIP(String name, int currentAmount, double currentPoint) {
		super(name, currentAmount, currentPoint);
	}

}
