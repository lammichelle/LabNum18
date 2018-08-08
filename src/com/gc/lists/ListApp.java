package com.gc.lists;

public class ListApp {

	public static void main(String[] args) {
		MyList list = new MyArrayList();
		//test(list);
		list = new MyLinkedList(); //polymorphism - switch btwn two types of child class
		test(list);
		
	}

	private static void test(MyList list) {
		list.addAtBeginning("C");
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		//list.removeFromBeginning();
		//A should live before B 
		
		list.addAtEnd("d");
		//list.removeAt(2);
		list.insertAt(1, "hello");
		
		System.out.println(list);
		//System.out.println(list.size());
	}
	
	
	
}
