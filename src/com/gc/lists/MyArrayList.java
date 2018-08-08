package com.gc.lists;

import java.util.Arrays;

public class MyArrayList implements MyList {

	String[] array = new String[4]; // must declare size

	int length = 0;

	private boolean isFull() {
		return length == array.length;
	}

	// double length method in private so other classes do not have access
	private void doubleLength() {

		// make a new copy if the array that is twice as long
		array = Arrays.copyOf(array, array.length * 2);

	}

	@Override
	public void addAtBeginning(String data) {
		if (isFull()) {
			doubleLength(); //to make array bigger bc it's full
			
		}
		//loop backwards and shift all the items over to make room for new one
		//length is the end point
		for (int i = length; i >0; i--) {
			array [i]= array [i-1];	
		}
		//set first element and increment length
		array [0] = data;
		length ++; 
		
	}

	@Override
	public void removeFromBeginning() {

		array [0] = null; 		
			for ( int i = 0; i < length -1  ; i++) {
				array [i] = array [i+1];
				
		}
			
			length--;
		}
		
		
		
//	}

	@Override
	public void addAtEnd(String data) {

		if (isFull()) {
			// if our array is out of space, double the size
			doubleLength();
			// set the next item in the array and increment the length
			array[length] = data;
			length++; // length = length +1;
		}

	}

	@Override
	public void removeFromEnd() {
		// clear the last slot and decrement the length
		array[length - 1] = null;
		length--;

	}

	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		return array[index];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return length;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < length; i++) {
			sb.append(array[i]);

			if (i != length - 1) {
				sb.append(",");// value of the array
			}
		}
		sb.append(" ]");
		return sb.toString();
		
	}

	@Override
    public boolean removeAt(int index) {
        if (index >= 0 && index < length) {
            for (int i = index; i < length; i++) {
                array[i] = array[i + 1];
            }
        
        length--;
        }
        return false;
    }
	
		
		
	
	@Override
    public boolean insertAt(int index, String o) {
        if (isFull()) {
            doubleLength();
        }
        if (index >= 0 && index <= length) {
            for (int i = length; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = o;
            length++;
        }
        return false;
    }





}
