package jrn_tests;

public class SubClass extends SupClass {

	int x;
	public SubClass(int a, String b) {
		super(a, b);
		x = 2;
		
	}
	public SubClass(){
		super(1,"teste");
	}
	// podemos ver que n�o existe o construtor vazio. por�m se passarmos os 
	// par�metros, funciona.
	//sempre implicitamente a classe filha executa super()
}
