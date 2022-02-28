package com.samples.test;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // testPlusOperator();
		   testInheritence();
	}
	
	public static void testPlusOperator() {
		int [] test= new int[] {1,2,3,4,5,6,7,8,9,0};
		for (int i=0; i<test.length; i++) {
			i+=1;
			System.out.println(i);
		}
	}
	
	public static void testInheritence() {
		Base bs= new Base();
		Base beo= new ExtentedOne();
		ExtentedOne eo = new ExtentedOne();
		
		bs.printLabel();
		beo.printLabel();
		eo.printLabel();
		eo.printLabelExtented();
	}

}

class Base {
	
	void printLabel() {
		System.out.println("Base class is here.");
	}
	
}

class ExtentedOne extends Base {
	
	void printLabel() {
		System.out.println("PrintLabel overritten in extension class is here.");
	}
	void printLabelExtented() {
		System.out.println("Extension class is here.");
	}
	
}