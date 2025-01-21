package PractiseExercises;

import java.time.chrono.IsoChronology;

public class FindDuplicateCharFromString {

	public static void main(String[] args) {


		String input ="Darshana";
		findduplicateChar(input);
		
	}

	public static void findduplicateChar(String str) {

		char[] chars = str.toCharArray();
		
		System.out.println("duplicate char are:");
		for(int i=0;i<chars.length;i++)
		{
			if(chars[i]!=' ')
			{
				boolean isduplicate=false;
			
			for(int j=i+1;j<chars.length;j++)
			{
				if(chars[i]==chars[j])
				{
					isduplicate=true;
				chars[j]=' ';
				}
			}
			
		
		
		if(isduplicate) {
			System.out.println(chars[i]);
			chars[i] =' ';
		}
		}
		}
	}
	

}
