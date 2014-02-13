package sef.module04.activity;

/**
 * @author
 * 
 */
public class CalculatorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Instantiate Normal Calculator. Note that CALC_TYPE_NORMAL is a public
		 * static final variable defined in Calculator class.
		 */
		Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_NORMAL);

		System.out.println("*** Calculations will be performed using "
				+ normalCalc.getCalculatorType() + " calculator ***");

		// Add
		int result = normalCalc.add(450, 9);
		System.out.println("1) Add result is " + result);
		
		// Subtract
		result = normalCalc.subtract(450, 9);
		System.out.println("2) Subtract result is " + result);

		// Multiply
		int[] mul = { 45, 10, 9 };
		result = normalCalc.multiply(mul);
		System.out.println("3) Multiplication result is " + result);
		
		// Divide
		result = normalCalc.divide(450, 9);
		System.out.println("4) Division result is " + result);

	}

}
