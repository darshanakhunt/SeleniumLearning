package ArrayPrograms;
//find smallest element in an array
public class SmallestElementarray {

	public static void main(String[] args) {

		int arr[]= {10,5,20,40,24,90,2,1};
		System.out.println("Smallest element in an array is :"+ smallest(arr));
	}

	public static int smallest(int[] arr) {

		int smallest=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		return smallest;
	}

}
