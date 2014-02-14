package sef.module09.activity;

//Needs to be completed

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapActivity {

	public static void main(String[] args) {
		// 1 - Type code to create a HashMap of key value pair
		// where key is id of type String and value is a name
		MapActivity mapActivity = new MapActivity();

		Map map = new TreeMap();
		map.put("1", "João");
		map.put("2", "Pedro");
		map.put("3", "Marcos");
		map.put("4", "Carlos");
		map.put("1", "John");
		map.put("1", "null");
		map.put("", 10.55);

		// 2 - Call print method to print the map passed as its parameter.
		mapActivity.print(map);
	}

	void print(Map map) {
		// 3 - Type code to print this map
		Set keys = map.keySet();

		// primeira forma
		for (Object key : keys) {
			Object valor = map.get(key);
			System.out.print("Chave: " + key);
			System.out.println("  Valor: " + valor);
		}

		// segunda forma
		Collection valores = map.values();
		for (Object valor : valores) {
			System.out.println("Valor: " + valor);
		}
	}
}
