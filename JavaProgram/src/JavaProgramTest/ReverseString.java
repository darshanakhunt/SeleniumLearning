/**
 * 
 */
package JavaProgramTest;

import java.util.Scanner;

public class ReverseString {


	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		String str= sc.nextLine();
		
		
		String rev = reverseString(str);
		System.out.println("reversed string is:" + rev);
	}

	public static String reverseString(String str) {
		
		String reversed =" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			reversed=reversed+str.charAt(i);
		}
		return reversed;
	}

}
