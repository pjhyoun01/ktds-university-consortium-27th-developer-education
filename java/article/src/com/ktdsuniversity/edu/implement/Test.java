package com.ktdsuniversity.edu.implement;

public class Test {

	public static void main(String[] args) {
		LgSmartTV lgTv = new LgTV();
		LgRemoteController lgRemoteCon = new LgSmartRemoteController();
		lgRemoteCon.turnOn(lgTv);
		lgRemoteCon.runYoutube(lgTv);
		
		SamsungSmartTV samsungTV = new SamsungTV();
		lgRemoteCon.turnOn(samsungTV);
		//lgRemoteCon.runYoutube(samsungTV);
		
		SamsungRemoteController samsungRemoteCon = new SamsungSmartRemoteController();
		samsungRemoteCon.runCoupangPlay(samsungTV);
		// samsungRemoteCon.runNetflix(lgTv);
		
		DaisoRemoteController rc = new DaisoRemoteController();
		rc.turnOff(samsungTV);
		rc.runCoupangPlay(samsungTV);
		rc.runInternet(lgTv);
		rc.runMenu(samsungTV);
		rc.runNetflix(lgTv);
		rc.runNetflix(samsungTV);
		rc.runYoutube(lgTv);
		
	}
	
}