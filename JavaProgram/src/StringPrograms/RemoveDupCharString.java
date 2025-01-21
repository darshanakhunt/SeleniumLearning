package StringPrograms;

import java.util.HashMap;

public class RemoveDupCharString {

	public static void main(String[] args) {

		String str = "Programming";

		System.out.println(RemoveDupchar(str));
	}

	public static String RemoveDupchar(String str) {
		
		HashMap<Character,Boolean> hashmap = new HashMap<>();
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char currentchar = str.charAt(i);
			
			if(!hashmap.containsKey(currentchar))
			{
				hashmap.put(currentchar, true);
				result.append(currentchar);
			}
		}
		
		return result.toString();
		
	
	
	}

	/*
	 * private static String RemoveDupchar(String str) {
	 * 
	 * String strcount=""; char eachchar;
	 * 
	 * for(int i=0;i<str.length()-1;i++) { eachchar = str.charAt(i);
	 * 
	 * if(strcount.indexOf(eachchar)==-1) { strcount=strcount+eachchar; } }
	 * 
	 * return strcount;
	 * 
	 * }
	 */

}
