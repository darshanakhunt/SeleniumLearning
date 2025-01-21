package PractiseExercises;

import java.util.HashMap;
import java.util.Map;

public class ReturnFirOccChar {

	public static void main(String[] args) {

		String input="AABBCDEEF";
		for(int i=0;i<input.length();i++)
		{
			boolean unique=true;

			for (int j=0;j<input.length();j++)
			{
				if(i!=j && input.charAt(i)==input.charAt(j))
				{
					unique=false;
				}
			}
			if(unique)
			{
				System.out.println(input.charAt(i));
				break;
			}
		}
		
		HashMap<Character, Integer> hashmap = new HashMap<Character,Integer>();
		for(int i=0;i<input.length();i++)
		{
			char c=input.charAt(i);
			if(hashmap.containsKey(c))
			{
				hashmap.put(c, hashmap.get(c)+1);
			}else
			{
				hashmap.put(c, 1);
			}
		}
		System.out.println(hashmap);
	
		
	}

}
