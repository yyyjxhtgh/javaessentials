package com.samples.test;

import java.util.ArrayList;
import java.util.List;

public class ForEachWithOrWithoutStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<20) {
        forEachWithoutStream();
        forEachWithStream();
        i++;
        System.out.println(" ");
		}
     }

	//If we don't require a stream but only want to iterate over a collection, the first choice should be using forEach() directly on the collection.
	public static void forEachWithoutStream() {
		
		List<String>  withoutStreamList= new ArrayList<String>();
		withoutStreamList.add("A");
		withoutStreamList.add("B");
		withoutStreamList.add("C");
		withoutStreamList.add("D");
		
		//we use lamda methjod reference
		withoutStreamList.forEach(
			System.out::print
		);
		
	}
	
	//in most case they are same but stream() no gurantee the order
	public static void forEachWithStream() {
		
		List<String>  withoutStreamList= new ArrayList<String>();
		withoutStreamList.add("A");
		withoutStreamList.add("B");
		withoutStreamList.add("C");
		withoutStreamList.add("D");
		
		//we use lamda methjod reference
		withoutStreamList.stream().forEach(
			System.out::print
		);
		
	}
}
