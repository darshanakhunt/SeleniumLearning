package JavaProgramTest;

public class FibonacciL2 {

	public static void main(String[] args) {

		int number=7;
		int sum;
		int first=0;
		int second=1;
		
		for(int i=0;i<=number;i++)
		{
			sum=first+second;
			first=second;
			second=sum;
			System.out.println(sum);

		}
	}

}
