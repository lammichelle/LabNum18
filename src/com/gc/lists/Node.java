package com.gc.lists;

public class Node {

	
	private String data;
	private Node next;
	public Object value;
	//public Node value;
	
	//empty constructor
	public Node() {
		
	}
	//overloaded constructor
	public Node(String data, Node next) {
		this.data = data; //bc 2 methods with same name
		this.next = next; 
		
		
	}
	
	//getter - string, setter - void
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	//override toString
	@Override
	public String toString() {
		if (next != null) {
			return data + "->";
			
		}
		return data;
	}
	

	

}
