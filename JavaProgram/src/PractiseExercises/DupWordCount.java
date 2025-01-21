package PractiseExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DupWordCount {

	public static void main(String[] args) {

		
		Duplicateword("Hello This is Darshana This is Dhameliya Darshana This Hello Hi");
	}

	public static void Duplicateword(String word) {

		String words[] = word.split(" ");
		
		Map<String, Integer> hashmap = new HashMap<String, Integer>();
		
		for(String wordcount : words) {
			if(hashmap.containsKey(wordcount))
			{
				hashmap.put(wordcount,hashmap.get(wordcount)+1);
			}
			else
			{
				hashmap.put(wordcount, 1);
			}
		}
		
		Set<String> wordinstring = hashmap.keySet();
		
		for(String wordcount : wordinstring)
		{
			if(hashmap.get(wordcount)>1)
			{
				System.out.println(wordcount + " "+hashmap.get(wordcount));
			}
		}
		
	}
	

}
