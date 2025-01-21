package JavaProgramTest;

import java.util.Scanner;

public class PerfactNo {

	public static void main(String[] args) {
		// number which is equal to som of divisor.

		System.out.println("Enter numver");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <=number / 2; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		if(sum==number)
		{
			System.out.println("perfact numer");
		}
		else
		{
			System.out.println("not");
		}

	}

}
