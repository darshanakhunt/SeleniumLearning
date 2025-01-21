package ArrayPrograms;

public class ReverseArrayElement {

	public static void main(String[] args) {

		int[] arr= {10,20,30,40,50,60};
		reverse(arr);
		
		for(int num:arr)
		{
			System.out.println(num);
		}
	}

	public static void reverse(int[] arr) {

		int start=0;
		int last=arr.length-1;
		
		while(start<last)
		{
			int temp=arr[start];
			arr[start]=arr[last];
			arr[last]=temp;
			
			start++;
			last--;
		}
		
	}

}
