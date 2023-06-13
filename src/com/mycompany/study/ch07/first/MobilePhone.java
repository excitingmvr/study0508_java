package com.mycompany.study.ch07.first;

public class MobilePhone extends DmbCellPhone{

	void aaa() {
		System.out.println("asdasdf");
		powerOn();
		changeChannelDmb(1);
	}
	
	@Override
	void changeChannelDmb(int channel) {
		System.out.println("MobilePhone.changeChannelDmb");
	}
	
	@Override
	void powerOn(int a) {

	}
}
