package PractiseExercises;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first string");
		String first= sc.next();
		
		System.out.println("Enter second string");
		String second = sc.next();
		
		compare(first,second);
	}

	public static void compare(String s1,String s2)
	{
		if(s1.compareTo(s2)==0)
		{
			System.out.println("equal");
		}
		
		else
		{
			System.out.println("not");
		}
	}
}
