package sef.module09.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		
		ListActivity listActivity = new ListActivity();
		ArrayList list = new ArrayList();
		list.add("José");
		list.add("Kleber");
		list.add("Wikie");
		list.add("Paulo");
		list.add("Felipe");
		
		//2 - Call print method to print the list passed as its parameter.
		listActivity.print(list);
		
	}
	
	void print(List list)
	{
		//3 - Type code to print this list
		//Notice the order in which elements get printed.
		
		
		// primeira forma de fazer
		for (Object nome : list) {
			
			System.out.println(nome);
		}
		
		System.out.println();
		
		
		
		
		// segunda forma de fazer
		for (int i = 0; i < list.size(); i++) {
			Object nome = list.get(i);
			System.out.println(nome);
		}
		
		System.out.println();

		
		
		
		// terceira forma de fazer
		Iterator iterator = list.iterator();

		while (iterator.hasNext()){
			String nome = (String) iterator.next();
			System.out.println(nome);
		}
		
		
	}
}
