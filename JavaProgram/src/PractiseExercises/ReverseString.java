package PractiseExercises;

public class ReverseString {

	public static void main(String[] args) {

		String s="Darshana";
		
		char[] arr= s.toCharArray();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("******************");
		
		for(int j=s.length()-1;j>=0;j--)
		{
			System.out.println(s.charAt(j));
		}
	}

}
