package com.simplilearn.accessmodifiers;

public class ProtectedAccessModifierTest {

	public static void main(String[] args) {
		// create object
		Hero hero =  new Hero();
		// print variable
		System.out.println("power :: "+hero.power);
	// methods
		hero.showPower();
		hero.usePower();
	
	
	}

}


