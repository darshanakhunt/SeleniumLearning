package ArrayPrograms;
//find smallest element in an array
public class LargestNoArray {

	public static void main(String[] args) {

		int arr[]= {20,10,40,5,50,90};
		System.out.println("largest element in an array:"+ largest(arr));
	}

	public static int largest(int[] arr) {

		int largest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		return largest;
	}
	
	

}
