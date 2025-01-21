package PractiseExercises;

public class RevCharFromString {

	public static void main(String[] args) {

		String str="Java Code";
		
		String[] sentence = str.split(" ");
	
		String output ="";
		for(String words : sentence)
		{
			String reverseword ="";

			for(int i=words.length()-1;i>=0;i--)
			{
				reverseword=reverseword + words.charAt(i);
			}
			output=output+reverseword +" ";
		}
	System.out.println(output.trim());
	}
	
}
