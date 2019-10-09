package cse360assign2;
/**
 *William Alexander
 *Student ID: 1216514637 
 *Assignment 2
 *
 *This file contains the AddingMachine class, AddingMachine constructor,
 *and 5 methods: get total, add, subtract, to string, and clear. Add, subtract,
 *and clear all have a return type of void. To string returns a string and
 *get total returns an integer
 *
 * @author William Alexander 
 * @version 1.0
 */
public class AddingMachine {
	
	private int total;
	private String history = "0";
	
	/**
	 * Constructor initializes total to 0
	 */
	public AddingMachine() {
		total = 0; // not needed - included for clarity
	}

	/**
	 * Returns the total as an integer
	 * @return total
	 */
	public int getTotal() {
		return total;
	}
	
	/**
	 * Adds the value to the total and
	 * stores the calculation in the history
	 * @param value
	 */
	public void add(int value) {
		total += value;
		history += " + " + value; 
	}
	
	/**
	 * Subtracts the value to the total and
	 * stores the calculation in the history
	 * @param value
	 */
	public void subtract(int value) {
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * Returns calculation history as a string
	 * @return String representation of the class
	 */
	public String toString() {
		return history;
	}
	
	/**
	 * Clears the history and total
	 */
	public void clear() {
		history = "0";
		total = 0;
	}
	
}
