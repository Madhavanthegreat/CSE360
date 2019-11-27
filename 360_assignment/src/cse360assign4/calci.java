package cse360assign4;

import cse360assign3.AddingMachine;
import cse360assign4.calci;

/**
 * This Class is for performing simple arithmatic functions
 * @author Madhumadhavan Sridhar
 *
 */
public class calci extends AddingMachine {
	/**
	 * a is a string used as input for toString()
	 * cstring1 and cstring2 are used for converting integer to String
	 */
	
	private String cstring3,cstring4,cstring5;
	/**
	 * Constructs an adding machine to perform arithmatic transactions
	 */
	
	public calci () {
		multiplication(4);
		division(1);
		power(2);
		toString();
		getTotal();
	}
	
	/**
	 * performs addition operation of the paramter with total variable
	 * @param value to be added to the total variable
	 */
	public void multiplication (int value) {
		cstring3 = new Integer(value).toString();
		a = a + " * " + cstring3;
		total = total * value;
	}
	public void division (int value) {
		cstring4 = new Integer(value).toString();
		a = a + " / " + cstring4;
		if (value == 0) {
			total=0;
		}
		else {
			total = total / value;
		}}
	
	public void power (int value) {
		cstring5 = new Integer(value).toString();
		a = a + " ^ " + cstring5;
			if (value < 0) {
				total=0;
			}
			else {
				total = (int)Math.pow(total, value);
}}

	public static void main(String[] args) {
    	calci obj = new calci();
    }
}
