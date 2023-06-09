package com.robert.advancedoop;

public class FrontEndDev extends Developer{
	private boolean isArtistic;
	
	public FrontEndDev() {
		super("Anonymous frontend dev");
		this.salary = 100000;
		this.setWorkingHours(7);
		this.isArtistic = true;
	}
	
	public FrontEndDev(String name) {
		super(name);
		this.salary = 110000;
		this.setWorkingHours(7);
		this.isArtistic = true;
	}
	
	public void displayStatus() {
		super.displayStatus();
		System.out.println(this.isArtistic ? "is artistic: Yes" : "is artistic: no");
	}
	
	public void giveRaise(double ammount) {
		this.setSalary(this.getSalary() + ammount);
	}

}
