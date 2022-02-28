package com.samples.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //testLamdaClass();
		testLamdaForLoop();
	}
	
	
	static void testLamdaClass() {
		
		Addable addable1= (int a, int b) -> (a+b);  //no need return and it is () not {} if only one statement
	    Addable addable2= (int a, int b) -> { return (a+b);};
	    AddableOne addableOne = d -> (d*d);
		System.out.println(addable1.add(10, 11));
		System.out.println(addable2.add(10, 11));
		System.out.println(addableOne.add(10));
		
	}
	
	static void testLamdaForLoop() {
		
		List <String>  list= new ArrayList<String>(Arrays.asList("a","b","c","d"));
		
		//forEach take a comsumer interface which has one abstract method accept. The instance
		//of consummer can be initialized by overwrite accept method or use lamda
		//in this case the lamda expression represent the consumer object. Basically it is a 
		//consumer object with method accpeted overwriten.
		list.forEach(
			n-> System.out.println(n)   // this is equilatent to consumer object
		);
		
		//We can also use method for it
		//println is a static method of System.out.  
        //Method reference is a special type of lamda expression
		//Consumer consumer3 = System.out::println;
        //In method reference, we have Class or object before :: and method name after :: without arguments.
		//Method reference can be used only if lamda expression only call one method.
		list.forEach(System.out::println);   
	 
	}
	
	
	//We can use method reference to replace lamda expression if the expression only call one method
	/*
	 * There are four types of method references.
	   Reference to static method
	   (args) -> ClassName.someStaticMethod(args)  ==>  ClassName::someStaticMethod
	   Reference to instance method of object type
	   (obj,args) -> obj.someInstanceMethod(args)  ==>   objectType::someInstanceMethod
	   Reference to instance method of existing object
	   (args) -> obj.someInstanceMethod(args)   ==>  objectType::someInstanceMethod
       Reference constructor
       (args) -> new ClassName(args)  ==>  ClassName::new
	 */
	public static void testMethodReference() {
		
		
	}

}

@FunctionalInterface  //This annotation will assure only one abstract method defined for lamda usage
//lamda operation has to maintain one abstract function in interface
interface Addable {
	int add(int a, int b);
}

@FunctionalInterface  //This annotation will assure only one abstract method defined for lamda usage
//lamda operation has to maintain one abstract function in interface
interface AddableOne {
	int add(int a);
}

