package StringPrograms;

public class StringPalindrom {

	public static void main(String[] args) {

		String input="MADAM";
		
		StringBuilder sb= new StringBuilder(input);
		
		sb.reverse();
	
		if(input.equals(sb.toString()))
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not");
		}
	}

}
