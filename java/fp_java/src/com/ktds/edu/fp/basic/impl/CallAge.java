package com.ktds.edu.fp.basic.impl;

import com.ktds.edu.fp.basic.CallSomething;

public class CallAge extends CallSomething{

	@Override
	public int call(String message) {
		return Integer.parseInt(message);
	}

}
