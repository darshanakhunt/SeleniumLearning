package JavaProgramTest;

public class OccuOfSinDigit {

	public static void main(String[] args) {

		int num=123322;
		int count=0;
		int digit=1;
		int original=num;
	
		
		while(num!=0)
		{
			if(num%10==digit)
			{
				count++;
			}
			num=num/10;
		}

		System.out.println("occurance of number:"+original+ " is "+ count);
	
	}
}
