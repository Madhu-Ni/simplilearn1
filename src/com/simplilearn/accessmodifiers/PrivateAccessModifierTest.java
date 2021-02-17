package com.simplilearn.accessmodifiers;

public class PrivateAccessModifierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
   // create object
		Father father = new Father();
		
		father.showMoney();
		
	//father.showBalance(); // compile time error
		
	//	father.bankMoney; // compile time error
		
	//father.fixDeposit; // compile time error
		
		
	}
	

}

class Father {
	// private variable
	private double bankMoney = 776688;
	private double fixDeposit= 3566778;
	
	//private method
	private double showBalance() {
		return bankMoney;
	}
	
	
	// public method
	public double showMoney() {
		System.out.println("showmoney :: "+ bankMoney);
		return bankMoney;
	}
	
	// zero Argument default constructor(Same name as class name
	//)
	//private Father(){
	// note : Private constrctors based class cannot be instantiated	
	// while we can access through public constructor
	public Father() {
		
}
	
}