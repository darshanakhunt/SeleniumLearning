package PractiseExercises;
// Pass null argument with method overloading of String and Object types
public class NullArgMethodOverloading {

	public static void NullArgMethodOverloading(Object o)
	{
		System.out.println("object called");
	}
	public static void NullArgMethodOverloading(String str)
	{
		System.out.println("string called");
	}
	
	public static void compareno()
	{
		Integer i=100;
		Integer j=100;
		
		if(i==j)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not");
		}
	}
	public static void main(String[] args) {

		NullArgMethodOverloading(null);
		compareno();
	}

	
}
