package sef.module03.activity;

/**
 * @author
 * 
 */
public class OperatorActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declare numbers to be operated
		int i = 8;
		int j = 5;

		// Subtract numbers
		int result = i - j;

		// Print result
		System.out.println("Difference = " + result);

		// Add numbers
		int result2 = i + j;

		// Print result
		System.out.println("Addition = " + result2);

		System.out.println("Addition equal to Difference!? "
				+ (result == result2));
	}

}