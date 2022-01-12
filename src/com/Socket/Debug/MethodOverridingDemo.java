package com.Socket.Debug;

class Bank{
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank{
	int getRateOfInterest() {
		return 8;
	}
}

class HDFC extends Bank{
	int getRateOfInterest() {
		return 9;
	}
}


public class MethodOverridingDemo{
	public static void main(String[] args) {
		
		Bank sbi = new SBI();
		Bank hdfc = new HDFC();
		
		System.out.println(sbi.getRateOfInterest());
		System.out.println(hdfc.getRateOfInterest());
		
	}
}
