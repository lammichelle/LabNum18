package com.gc.lists;

public class MyLinkedList implements MyList {
	// if head is null, the list is empty
	private Node head; // head is the first node in the list
	// private Node current; //this will have the current value
	// private Node removeNode;
	private int length = 0;
	public String value;
	

	@Override
	public boolean removeAt(int index) {
		Node current = head;
		Node removeNode = new Node();

		for (int i = length - 1; i >= 0; i--) {

			if (i == index) {
				removeNode = current.getNext();
				current.setNext(removeNode.getNext());
				length--;
				return true;
			}
			current = current.getNext();
		}

		return false;
	}
	
	@Override
	public boolean insertAt(int index, String o) {
		
		boolean outOfLimits = false;

		if(index == 0) {
			this.addAtBeginning(o);
		}
		else  {
			Node insert = new Node(); // the node to be inserted;
			insert.setData(o);
			Node current = head; // used for storing temp node; 
			
			
			for(int i=1; i< index; i++) {
				current = current.getNext();
			}
			
			insert.setNext(current.getNext());
			current.setNext(insert );
			length++;
			outOfLimits = true;
		}
		
		return outOfLimits;
		
	
	}

	@Override
	public void addAtBeginning(String data) {
		// add a new node and set it as new head
		// Node newNode = new Node();
		// newNode.value = data;
		// newNode.next = head.next;
		head = new Node(data, head);
		length++;
	}

	@Override
	public void removeFromBeginning() {
		// find the 2nd node and set it as the head node
		head = head.getNext();
		length--;

	}

	@Override
	public void addAtEnd(String data) {
		if (length == 0) {
			addAtBeginning(data);

		} else {
			Node Tail = getNodeAt(length - 1); // last index
			Tail.setNext(new Node(data, null)); // based on constructor
			length++;
		}

	}

	@Override
	public void removeFromEnd() {
		// check length first
		if (length < 2) {
			// the beginning is the end bc there is only 1 element
			removeFromBeginning(); // this will make the list empty
		} else {
			// find the node BEFORE the end
			Node beforeTail = getNodeAt(length - 2); // length-1 will give you the last index
			// set its next to null, that means this will now end the list
			beforeTail.setNext(null);
			length--;
		}
	}

	private Node getNodeAt(int index) {// refer to location
		// start at the head
		Node node = head;
		// follow the links btwn nodes until it counts off the right number
		for (int i = 0; i < index; i++) {
			if (node == null) {
				// in case we run out of nodes before we get to the desired index, return null
				return null;

			}
			node = node.getNext(); // referred to the next link

		}
		return node;
	}

	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		return getNodeAt(index).getData();
	}

	@Override
	public int size() {
		return length;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		// start at the head
		Node node = head;
		// follow the links btwn nodes until it reaches the end
		while (node != null) {
			sb.append(node.toString());
			node = node.getNext();

		}
		return sb.toString();
	}

	

}
