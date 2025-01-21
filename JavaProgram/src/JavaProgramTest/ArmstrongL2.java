package JavaProgramTest;

public class ArmstrongL2 {

	public static void main(String[] args) {

		
		int num=9474;
		int sum = 0;
		int original = num;
		
		while(num>0)
		{
			int n= num%10;
			sum= sum+(n*n*n);
		//	sum=sum+(int)Math.pow(n, )
			num=num/10;
		}
		
		if(original==sum)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not");
		}
	}

}
