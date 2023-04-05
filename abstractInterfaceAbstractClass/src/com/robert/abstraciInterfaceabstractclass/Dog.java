package com.robert.abstraciInterfaceabstractclass;

public class Dog extends Pet implements Keepable{

	public Dog() {
		super("random dog name", "dog");
	}
	
	public Dog(String name) {
		super(name, "dog");
	}

	@Override
	public void showAffection() {
		System.out.println("Wags tail licks hand, Paw Hug");
		
	}

	@Override
	public void askForFood() {
		System.out.println("wiggles, Howls");
	}

}
