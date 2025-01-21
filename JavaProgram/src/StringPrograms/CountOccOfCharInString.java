package StringPrograms;

public class CountOccOfCharInString {

	public static void main(String[] args) {

		String str="darshana";
		char c = 'a';
		
		System.out.println(countocc(str,c));
	}

	public static int countocc(String str, char c) {
		int counter = 0;
		for(Character check : str.toCharArray())
		{
			if(check==c)
			{
				counter++;
			}
		}
		return(counter);
		
	}

}
