package com.simplilearn.accessmodifiers;

public class Hero {

	
		//
		protected String power = "Healing power :: superMan";
		
		protected void usePower() {
			System.out.println("The greate power of all"+ power);
		}
		
		public void showPower() {
			System.out.println("Show all ::"+power);
		}
		}


