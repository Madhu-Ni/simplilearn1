package com.simplilearn.innerclasses;

public class Testouter {
	
	private int data = 100;
	public String msg = "Today is good day";
	
	
	class TestInner{
		private String msg2=" better day";	
	public void showData() {
		System.out.println("Data--"+data);
		System.out.println("Msg---"+msg);
	}
	
	
	}

// you can have main method
	public static void main(String[] args) {
Testouter outer = new Testouter();

// inner class 
Testouter.TestInner inner=outer.new TestInner();
inner.showData();

	
	
	}
	}
