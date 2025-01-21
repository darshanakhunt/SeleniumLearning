package PractiseExercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IterateHashMap {

	public static void main(String[] args) {

		
		//HashMap<String, Integer> hashmap = new HashMap<>();
		LinkedHashMap<String, Integer> hashmap = new LinkedHashMap<>();
		hashmap.put("Apple", 1);
		hashmap.put("Banana", 2);
		hashmap.put("Kiwi", 3);
		hashmap.put("Pear", 4);
		hashmap.put("Grapes", 5);
		
		//hashmap.remove("Kiwi", 3);
		
		for(Map.Entry<String, Integer> entry : hashmap.entrySet())
		{
			System.out.println(entry.getKey()+" " +entry.getValue());
		}
	}

}
