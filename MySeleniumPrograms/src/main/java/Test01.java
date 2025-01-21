
public class Test01 {

	public static void main(String[] args) {

		String str="automation";
		
		String result=" ";
		
		for(int i=0;i<str.length();i++)
		{
			char currchar = str.charAt(i);
		
		
		if(result.indexOf(currchar)== -1)
		{
			result =result+currchar;
		}
		}
		System.out.println("original string:" + str);
		System.out.println("String without duplicates:" + result);
		
	}

}
