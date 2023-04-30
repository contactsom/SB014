package com.simplilearn.encapsulation;

public class ATM {

	private int atmPin;
	private int atmCCV;
	private int atmExpiry;
	
	private int getAtmPin() {
		return atmPin;
	}
	private void setAtmPin(int atmPin) {
		this.atmPin = atmPin;
	}
	private int getAtmCCV() {
		return atmCCV;
	}
	private void setAtmCCV(int atmCCV) {
		this.atmCCV = atmCCV;
	}
	private int getAtmExpiry() {
		return atmExpiry;
	}
	private void setAtmExpiry(int atmExpiry) {
		this.atmExpiry = atmExpiry;
	}
	
}
