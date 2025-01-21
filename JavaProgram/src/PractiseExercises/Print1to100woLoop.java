package PractiseExercises;

public class Print1to100woLoop {

	public static void main(String[] args) {

		printnum(1);
	}

	public static void printnum(int n)
	{
		if(n<=100)
		{
			System.out.println(n);
			printnum(n+1);
		}
	}
}
