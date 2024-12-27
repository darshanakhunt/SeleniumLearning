package JavaProgramTest;

public class PrimeNumbers {
	
	public static boolean isPrimeNumber(int num)
	{
		if(num<=1) {
			return false;
		}
	
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			return false;
		}
		
	}
	return true;
	}
	
	public static void primenumberRange(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if(isPrimeNumber(i))
				System.out.print(i+ " ");
		}
	}
	
	public static void main(String[] args) {

		System.out.println("2 is "+ isPrimeNumber(2));
		System.out.println("4 is "+ isPrimeNumber(4));
		primenumberRange(7);
		
	}

	

}
