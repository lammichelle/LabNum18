/**
 * 
 */
package com.gc.lists;

/**
 * @author lamfr
 *
 */
public interface MyList {
// have a series of abstract method
	//does not need public or private
	
	
	void addAtBeginning (String data);
	// add string to the beginning of our supply
	
	void removeFromBeginning(); //we dont care about data
	
	void addAtEnd(String data);
	
	void removeFromEnd();
	
	//get method
	String get(int index);
	
	int size(); //how many items are in the list 

	boolean removeAt(int index);


	boolean insertAt(int index, String o);
	
	//now we create the arraylist with dynamic
	
	
	
}
