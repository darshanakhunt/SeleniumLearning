package JavaProgramTest;

public class SumofDigitNumber {

	public static void main(String[] args) {

		
		int number=1223;
		int sum=0;
		int n;
		
		while(number>0)
		{
			n=number%10;
			sum=sum+n;
			number=number/10;
		}
	
		System.out.println(sum);
	}

}
