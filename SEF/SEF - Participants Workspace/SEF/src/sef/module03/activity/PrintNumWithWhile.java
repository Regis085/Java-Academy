/**	
 * Complete the code and write a while loop to print all even numbers less than 100
 */
package sef.module03.activity;

/**
 * @author 
 *
 */
public class PrintNumWithWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// Print all even numbers less than 100
		int i = 0;
		System.out.println("Even numbers from 0 to 100:");
		while(i<100){
			if (i%2==0)
				System.out.print(i + ",  ");
			if (i==50)
				System.out.println();
			i++;			
		}
		System.out.println();
		
		 
		// write code to Print all odd numbers less than 100
		i = 0;
		System.out.println("Odd Numbers from 0 to 100:");
		while(i<100){
			if (i%2!=0)
				System.out.print(i + ",  ");
			if (i==50)
				System.out.println();
			i++;
		}
	}

}
