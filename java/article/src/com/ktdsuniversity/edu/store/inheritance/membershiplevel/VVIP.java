package com.ktdsuniversity.edu.store.inheritance.membershiplevel;

import com.ktdsuniversity.edu.store.inheritance.VO.CustomerVO;

public class VVIP extends CustomerVO {
	public VVIP(String name, int currentMoney) {
		super(name, currentMoney);
	}

	public VVIP(String name, int currentAmount, double currentPoint) {
		super(name, currentAmount, currentPoint);
	}

}
