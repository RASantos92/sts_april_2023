package com.robert.abstraciInterfaceabstractclass;

public interface Keepable {
	// default : useable
	public default void play() {
		System.out.println("playing...");
	}
	
	// these are like our contracts. if you use this interface you have to complete these methods
	// abstract : has to completed when the interface is implemented
	abstract void showAffection();
	abstract void askForFood();
}
