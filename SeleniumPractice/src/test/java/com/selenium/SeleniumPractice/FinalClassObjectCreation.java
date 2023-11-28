package com.selenium.SeleniumPractice;

public final class FinalClassObjectCreation {
	int a = 10;

	public static void main(String[] args) {
		FinalClassObjectCreation f = new FinalClassObjectCreation();
		f.a = 20;
		FinalClassObjectCreation f1 = new FinalClassObjectCreation();
		f1.a = 34;
		FinalClassObjectCreation f3 = new FinalClassObjectCreation();
		f3.a = 90;

	}
}

class A1 {
	FinalClassObjectCreation f = new FinalClassObjectCreation();
}
