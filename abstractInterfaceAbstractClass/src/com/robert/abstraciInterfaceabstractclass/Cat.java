package com.robert.abstraciInterfaceabstractclass;

public class Cat extends Pet implements Keepable{

	public Cat() {
		 super("random cat name", "cat");
	}
	
	public Cat(String name) {
		super(name,"cat");
	}

	@Override
	public void showAffection() {
		System.out.println("Move around leg, Meow meow....");
	}

	@Override
	public void askForFood() {
		System.out.println("Keyboard smash and sit there");
		
	}

}
