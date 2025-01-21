package JavaProgramTest;

public class PrimeNumberL2 {

	public static void main(String[] args) {

		int num=7;
		Boolean isprime=true;
		
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isprime=false;
				break;
				
			}
		}
		if(isprime)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}


	
}
