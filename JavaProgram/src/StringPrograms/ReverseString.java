package StringPrograms;

public class ReverseString {

	public static void main(String[] args) {

		
		String input="darshana";
		
		/*String rev ="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			rev=rev+input.charAt(i);
		}
		
		System.out.println("rev string is:"+rev);*/
		
		
		StringBuilder sb= new StringBuilder(input);
		
		String str= sb.reverse().toString();
		System.out.println(str);
		
	}

}
