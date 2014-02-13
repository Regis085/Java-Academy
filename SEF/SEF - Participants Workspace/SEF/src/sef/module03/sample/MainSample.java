/*
 * Created on Jun 25, 2008
 *
 * Hello World Program
 */

package sef.module03.sample;

// right button ; run as ; run configurations ; Arguments ;
// write your arguments, separate them with one space or enter

/**
 * @author John Doe
 */
public class MainSample {
	public static void main(String[] args) {
		// This line prints out the String 'Hello World!' in the console
		String aluno = args[0];
		String teste = args[1];
		System.out.println("Welcome to " + aluno + " " + teste);
		System.out.println("Memory Address example: ");
		Teste t = new Teste();
		System.out.println(t);

	}
}

class Teste{
}