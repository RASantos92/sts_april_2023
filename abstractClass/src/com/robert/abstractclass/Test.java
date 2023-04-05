package com.robert.abstractclass;

public class Test {

	public static void main(String[] args) {
		CashPayment laptop = new CashPayment(1500.99);
		laptop.paymentDetails();
		
		CreditCardPayment tacos = new CreditCardPayment(70.99, "fdsakflskas", "Calvin","04/6" );
		tacos.paymentDetails();
		}

}
