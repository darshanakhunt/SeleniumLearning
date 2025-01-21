package StringPrograms;

public class FindLengthOfString {

	public static void main(String[] args) {
		
		String str="darshana";
		System.out.println("length of string :"+ lengthofstring(str));
		
		
	}

	public static int lengthofstring(String str) {

		int counter = 0;
		for(Character c : str.toCharArray())
		{
			counter++;
			
		}
		return counter;
	}

}
