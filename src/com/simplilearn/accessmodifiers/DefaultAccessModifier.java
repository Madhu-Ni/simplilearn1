package com.simplilearn.accessmodifiers;

public class DefaultAccessModifier {

	public static void main(String[] args) {
		Brother brother = new Brother();
		
System.out.println("Money : "+brother.money);
System.out.println("Clothes:"+brother.clothes);
	brother.showAll();	
	}

}
 class Brother{
	 double money = 45678;
     String clothes = " ABC";
     
     void showAll() {
    System.out.println("Money ::"+money+" clothes ::" +clothes);	 
     }
	 
 }