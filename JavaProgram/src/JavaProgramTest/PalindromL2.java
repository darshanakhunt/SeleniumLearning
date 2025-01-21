package JavaProgramTest;

public class PalindromL2 {

	public static void main(String[] args) {

		int originalnumer = 12321;
		int rev = 0;
		int num = originalnumer;
		int sum;
		while (num != 0) {
			sum = num % 10;
			rev = rev * 10 + sum;
			num = num / 10;
		}

		if (originalnumer == rev) {
			System.out.println("plinrom");
		} else {
			System.out.println("no");
		}
	}
}
