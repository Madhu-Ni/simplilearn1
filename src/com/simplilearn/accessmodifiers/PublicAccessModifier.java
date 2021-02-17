package com.simplilearn.accessmodifiers;

public class PublicAccessModifier {

	public static void main(String[] args) {
		Mother mother = new Mother();
		
		//access variable
		System.out.println("Money ::"+mother.bankmoney);
	System.out.println("Money Method ::"+mother.showbmoney());
	System.out.println("Gold::"+mother.gold);
	//System.out.println("showall ::"+mother.showAll(););
	}

}
 class Mother{
	 // public variable 
	 public double bankmoney = 768788;
	  public double gold = 10;
	  
	  public double showbmoney() {
		  return bankmoney;
		  
	  }
	  
	  public void showAll() {
		  System.out.println("Money :: "+bankmoney+" gold value:: " +gold);
	  }
 }