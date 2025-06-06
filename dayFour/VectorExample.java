/**
 * 
 */
package com.Training.dayFour;

import java.util.Vector;

/**
 * 
 */
public class VectorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<>(3,2);
		v.add(1);
		v.insertElementAt(1,1);
		v.add(1,2);
		v.remove(0);
		
		v.clear();

	}

}
