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
	// podemos ver que não existe o construtor vazio. porém se passarmos os 
	// parâmetros, funciona.
	//sempre implicitamente a classe filha executa super()
}
