package StringPrograms;

public class FineNoofVowConst {

	public static void main(String[] args) {

		String input="nikunj123";
		
		countVovConst(input);
		
		
		
	}

	public static void countVovConst(String input) {
		String lower=input.toLowerCase();
		int vowels=0;
		int constant=0;
		
		for(Character c : lower.toCharArray())
		{
				if(c=='a' ||c=='e' || c=='i' ||c=='o' || c=='u')
				{
					vowels++;
				}
				else if(c>='a' &&c<='z')
				{
					constant++;
				}
		}
		System.out.println("vowels:"+vowels+" constants:" + constant);
	}

}
