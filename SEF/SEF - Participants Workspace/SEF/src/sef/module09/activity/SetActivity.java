package sef.module09.activity;

//Needs to be completed
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetActivity {

	public static void main(String[] args) {
		// 1 - Type code to create a set of names.
		// Names must be sorted by their natural order.
		// Do research to find if you already have such a class.
		// Also try adding a few duplicate entries to this set.

		SetActivity setActivity = new SetActivity();

		Set set = new TreeSet();
		set.add("José");
		set.add("José");		
		set.add("João");
		set.add("João");
		set.add("Pedro");
		set.add("Pedro");
		set.add("Manuel");
		set.add("Manuel");

		// 2 - Call print method to print the set passed as its parameter.
		setActivity.print(set);
	}

	void print(Set set) {
		// 3 - Type code to print this set
		// Notice the order in which elements get printed.

		Iterator iterator = set.iterator();

		// primeira forma de fazer
		while (iterator.hasNext()) {
			String nome = (String) iterator.next();
			System.out.println(nome);
		}
		
		
		// segunda forma de fazer
		iterator = set.iterator();
		System.out.println();
		
		for(Object nome; iterator.hasNext();){
			nome = iterator.next();
			System.out.println(nome);
		}
		System.out.println();
		
		
		// terceira forma de fazer: não usa o iterator
		for (Object nome : set){
			System.out.println(nome);
		}
	}
}
