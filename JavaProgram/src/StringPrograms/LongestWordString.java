package StringPrograms;

public class LongestWordString {

	public static void main(String[] args) {

		String str="Automation programming java selenium";
		System.out.println(longword(str));
		
	}

	public static String longword(String str) {

		String[] words=str.split(" ");
		String longword ="";
		
		for(String word : words)
		{
			if(word.length() > longword.length())
			{
				longword=word;
			}
		}
		return longword;
	}

}
