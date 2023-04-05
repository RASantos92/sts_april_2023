package com.robert.abstraciInterfaceabstractclass;

public class Test {

	public static void main(String[] args) {
		Cat cat = new Cat("Pepper");
		cat.play();
		cat.showAffection();
		cat.askForFood();
		System.out.println("*****************************************************\n");
		Dog dog = new Dog("Duck");
		dog.play();
		dog.showAffection();
		dog.askForFood();

	}

}
