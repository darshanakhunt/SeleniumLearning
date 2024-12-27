package JavaProgramTest;

public class Wrapperclass {

	public static void main(String[] args) {

		String x="100";
		System.out.println(x+20);
	
		int i =Integer.parseInt(x);
		System.out.println(i+20);
		
		String y="12.33";
		double d=Double.parseDouble(y);
		System.out.println(d+10);
		
		String u="100a";
		Integer.parseInt(u);
		
	}

}
 