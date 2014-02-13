package jrn_tests;

public class ForEach {

	public static void main(String[] args) {
		// for(<type> var : list){}
		
		int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for (int num : numeros){
			if(num>=6 && num<=20 && num!=9){				
				System.out.println(num);
			}
		}
	}
}
