package JavaProgramTest;

public class PalindromNumber {

	
	public static void palindrom(int num)
	{
		int r=0;
		int temp;
		int sum=0;
		
		temp=num;
		
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}
	}
	public static void main(String[] args) {
		
		palindrom(1511);
	}

}
