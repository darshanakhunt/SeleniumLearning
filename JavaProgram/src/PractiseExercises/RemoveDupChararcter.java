package PractiseExercises;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupChararcter {

	public static void main(String[] args) {

		String str="programming";
		char[] arr =str.toCharArray();
		
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<arr.length;i++)
		{
			Boolean b=false;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					b=true;

				}
					
			}
		if(!b)
		{
			sb.append(arr[i]);
		}
		
		}
		System.out.println(sb);
		
		StringBuilder sb1= new StringBuilder();
		Set<Character> set = new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		for(Character c : set)
		{
			sb1.append(c);
		}
		System.out.println(sb1);
	}


}
