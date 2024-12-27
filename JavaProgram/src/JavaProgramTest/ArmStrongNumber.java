package JavaProgramTest;

public class ArmStrongNumber {

	public static void checkarmstrongnumber(int num)
	{
		int r=0;
		int temp;
		
		int sum=0;
		
		
		temp=num;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum= (r*r*r)+sum;
		}
		
		if(temp==sum)
		{
			System.out.println("number is palin");
		}
		else
		{
			System.out.println("number is not pali");
		}
	}
	public static void main(String[] args) {

		checkarmstrongnumber(1530);	
	}

}
