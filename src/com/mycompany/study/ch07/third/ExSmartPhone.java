package com.mycompany.study.ch07.third;

public class ExSmartPhone {

	public static void main(String[] args) {

//		Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("smart");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		smartPhone.open();
		
	}

}
