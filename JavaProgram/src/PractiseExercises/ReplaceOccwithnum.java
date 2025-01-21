package PractiseExercises;

public class ReplaceOccwithnum {

	
	public static void main(String args[])
	{
		String input="Darshana";
		char chartorepl = 'a';
		
		if(input.indexOf(chartorepl)==-1)
		{
			System.out.println("given char is not available in string");
		}
		
		
		int count=1;
		
		for(int i=0;i<input.length();i++)
		{
			char c= input.charAt(i);
			if(c==chartorepl)
			{
				input=input.replaceFirst(String.valueOf(chartorepl), String.valueOf(count));
				count++;
			}
			

		}
		System.out.println(input);
	}
	
}
