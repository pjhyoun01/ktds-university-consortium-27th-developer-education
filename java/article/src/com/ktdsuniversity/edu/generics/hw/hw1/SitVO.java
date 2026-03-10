package com.ktdsuniversity.edu.generics.hw.hw1;

public class SitVO {
	private int sitNum;
	private Seat isReserve;

	public SitVO(int sitNum, Seat seat) {
		this.sitNum = sitNum;
		this.isReserve = seat;
	}

	public int getSitNum() {
		return sitNum;
	}

	public void setSitNum(int sitNum) {
		this.sitNum = sitNum;
	}

	public Seat getIsReserve() {
		return isReserve;
	}

	public void setIsReserve(Seat isReserve) {
		this.isReserve = isReserve;
	}

}
