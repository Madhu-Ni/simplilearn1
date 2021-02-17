package com.simplilearn.accessmodifiers;

import com.simplilearn.accessmodifierB.Hero1;

public class ProtectedAccessModifierTest2 extends Hero1 {

	
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

