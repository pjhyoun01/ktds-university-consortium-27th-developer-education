package com.ktds.edu.fp.basic.impl;

import com.ktds.edu.fp.basic.CallSomething;

public class CallAge2 extends CallSomething{

	@Override
	public int call(String message) {
		try {
			return Integer.parseInt(message);			
		} catch (NumberFormatException nfe) {
			return 0;
		}
	}

}
