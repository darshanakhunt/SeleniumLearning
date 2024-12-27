package JavaProgramTest;

public class FactorialNum {

	//without recursive
	public static int FactorialCheck(int num)
	{
		int fact=1;
		if(num==0)
		{
			return 1;
		}
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public static int RecursiveFact(int num)
	{
		if(num==1)
			return 1;
		else
			return(num * (FactorialCheck(num-1)));
	}
	public static void main(String[] args) {

		System.out.println(FactorialCheck(0));
	}

}
