package com.robert.advancedoop;

public class Test {

	public static void main(String[] args) {
//		Developer dev = new Developer("Jorge");
//		dev.displayStatus();
		
		FrontEndDev frontEndDev = new FrontEndDev("Abebe");
		frontEndDev.giveRaise(10000.52);
		frontEndDev.displayStatus();
	}

}
