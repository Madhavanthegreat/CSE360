package cse360assign3;

import java.util.Scanner;

import cse360assign3.AddingMachine;

/**
 * This Class is inherited from AddingMachine base class
 * @author Madhumadhavan Sridhar
 *This class can perform all the arithmatic functions like addition,subtraction,multiplication,division and power
 */
public class Calculator extends AddingMachine {
	/**
	 * cstring3,cstring4 and cstring5 are used for converting integer to String
	 */
	
	private String cstring3,cstring4,cstring5;
	/**
	 * Constructs a calculator to perform all the arithmatic transactions
	 */
	
	public Calculator () {

	}
	
	/**
	 * performs multiplication operation of the paramter with total variable
	 * @param value be multiplied with the total variable
	 */
	public void multiplication (int value) {
		cstring3 = new Integer(value).toString();
		a = a + " * " + cstring3;
		total = total * value;
	}
	/**
	 * performs division operation of total variable by paramter
	 * @param value to divide the total variable
	 */
	public void division (int value) {
		cstring4 = new Integer(value).toString();
		a = a + " / " + cstring4;
		if (value == 0) {
			total=0;
		}
		else {
			total = total / value;
		}}
	/**
	 * performs power operation of total variable by the parameter
	 * @param value to raise the power of total variable*/
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
    	Calculator obj = new Calculator();
    	
    }
}

