/**
 * complete the code and write a for loop to add all
 */
package sef.module03.activity;

/**
 * @author
 * 
 */
public class AddWholeNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 50; i++) {
			total = total + i;
		}
		System.out.println("Addition of Whole Numbers from 1 to 50 = " + total);

		total = 0;

		// complete the code. write for loop for i

		for (int i = 50; i <= 100; i++) {
			total += i;
		}
		System.out.println("Addition of Whole Numbers from 50 to 100 = "
				+ total);

	}

}