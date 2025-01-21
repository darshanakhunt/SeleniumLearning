package ArrayPrograms;

public class MostOccNoArray {

	public static void main(String[] args) {
		
		int[] numbers = {1,3,4,5,2,2,2,1};
		CountNoArray(numbers);
	}

	public static void CountNoArray(int[] numbers) {

		int currentnum=numbers[0];
		int sum=0;
		
		for(int i=0;i<=numbers.length;i++)
		{
			currentnum=numbers[i];
			
			for(int j=0;j<=numbers.length;j++)
			{
				if(numbers[j]==currentnum)
				{
					sum++;
				}
			}
		}
	}

}
