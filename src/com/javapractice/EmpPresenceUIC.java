package com.javapractice;

public class EmpPresenceUIC {
	static int IS_FULL_TIME=1;
	public static void main(String [] args) {
		double empCheck =Math.floor (Math.random()*10%2);
		if(IS_FULL_TIME==empCheck) {
			System.out.println("The employee is present.");
		}
		else
			System.out.println("The employee is absent.");
	}
}
