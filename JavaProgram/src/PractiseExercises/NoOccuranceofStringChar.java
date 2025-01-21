package PractiseExercises;

import java.util.HashMap;
import java.util.Map;

public class NoOccuranceofStringChar {

	public static void main(String[] args) {

		String str="hello";
		
		char[] chars = str.toCharArray();
		
		HashMap<Character,Integer> map= new HashMap<>();
		
		for(Character ch :chars)
		{
				if(!map.containsKey(ch))
				{
					map.put(ch, 1);
				}else
				{
					int counter=map.get(ch);
					map.put(ch, counter+1);
				}
		}
		System.out.println(map);

	}

}
