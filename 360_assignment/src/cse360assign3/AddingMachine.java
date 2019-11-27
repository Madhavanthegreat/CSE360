package cse360assign3;
/**
 * This Class is for performing simple arithmatic functions
 * @author Madhumadhavan Sridhar
 *
 */
public class AddingMachine {
	/**
	 * a is a string used as input for toString()
	 * cstring1 and cstring2 are used for converting integer to String
	 */
	protected String a="0";
	protected String cstring1,cstring2;

	protected int total;
	/**
	 * Constructs an adding machine to perform arithmatic transactions
	 */
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {   
		return total;
	}
	/**
	 * performs addition operation of the paramter with total variable
	 * @param value to be added to the total variable
	 */
	public void add (int value) {
		cstring1 = new Integer(value).toString();
		a = a + " + " + cstring1;
		total = value + total;
		
	}
	
	/**
	 * performs subtraction operation of the paramter from total variable
	 * @param value to be subtrated from total variable
	 */
	
	public void subtract (int value) {
		cstring2 = new Integer(value).toString();
		a = a + " - " + cstring2;
		total = total - value;
	}
	/**
	 * Provides history of transactions
	 */
	public String toString () {
		System.out.println(a);
		return a;
	}

	public void clear() {
		a="0";
		total=0;
	}

	public static void main(String[] args) {
    	AddingMachine obj = new AddingMachine();
    }
}
