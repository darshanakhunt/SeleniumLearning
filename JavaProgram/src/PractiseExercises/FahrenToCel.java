package PractiseExercises;

import java.util.Scanner;

public class FahrenToCel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("input temp in faren");
		double fahrenheit=sc.nextDouble();
		double celsius = ((5*(fahrenheit-32.0))/9.0);
		System.out.println(fahrenheit+celsius);
	}

}
