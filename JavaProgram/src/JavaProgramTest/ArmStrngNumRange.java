package JavaProgramTest;

public class ArmStrngNumRange {

	public static void main(String[] args) {

		int lower = 1;
		int higher = 200;

		for (int num = lower; num <= higher; num++) {

			int sum = 0;
			int original = num;
			while (num > 0) {
				int n = num % 10;
				sum = sum + (n * n * n);
				num = num / 10;

			}
		
		if (sum == original) {
			System.out.println(original);
		}
		num=original;
		}
	}

}
