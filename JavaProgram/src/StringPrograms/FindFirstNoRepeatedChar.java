package StringPrograms;

import java.util.HashMap;

public class FindFirstNoRepeatedChar {

	public static void main(String[] args) {

	/*	String input="swiss";
		char result = findfirstnonrepeatedchar(input);
		
		if(result !='\0')
		{
			System.out.println("first non repeated: "+ result);
		}
		else
		{
			System.out.println("no char found");
		}
	}

	public static char findfirstnonrepeatedchar(String input) {

		for(int i=0;i<input.length();i++)
		{
			Boolean isrepeated = false;
			
			for(int j=0;j<input.length();j++)
			{
				if(i!=j && input.charAt(i)==input.charAt(j))
				{
					isrepeated=true;
					break;
				}
			}
			
			if(!isrepeated)
			{
				return input.charAt(i);
			}
		}
		
		return '\0'; */
		
		
		String str="swiss";
		System.out.println(firstornorepeatedchar(str));
		
	
		
	}

	public static char firstornorepeatedchar(String str) {

		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char c : str.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(char c : str.toCharArray())
		{
			if(map.get(c)==1)
			{
				return c ;
			}
		}
		
		return '\0';
	}

}
