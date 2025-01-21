package PractiseExercises;

import java.util.HashSet;
import java.util.Set;

//Find Duplicate Elements in An Array 
public class FindUniqEleArray {

	public static void main(String[] args) {

		String electric[] = {"Mobile","Laptop","Tablet","Mobile","Tv","Laptop","Freeze","Tv"};
		
		System.out.println("**brute force");
		for(int i=0;i<electric.length;i++)
		{
			for(int j=i+1;j<electric.length;j++)
			{
				if(electric[i]==electric[j])
				{
					System.out.println(electric[i]);
				}
			}
		}
		
		
		System.out.println("**Hashset");
		
		Set<String> set= new HashSet<String>();
		
		for(String s : electric)
		{
			if(set.add(s)==false)
			{
				System.out.println(s);
			}
		}
	}

}
