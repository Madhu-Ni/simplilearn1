package com.simplilearn.innerclasses;

public class TestOuter2 {
	
		
		private int data = 100;
		public String msg = "Today is good day";
		
		
		static class TestInner{
			private String msg2=" better day";	
		public void showData() {
			System.out.println("Data--"+data);
			System.out.println("Msg---"+msg);
		}
		
		
		}

	public static void main(String[] args) {
		// create object of inner class
Testouter2.TestInner inner= new TestOuter2.TestInner();
inner.showdata();
	}

}
