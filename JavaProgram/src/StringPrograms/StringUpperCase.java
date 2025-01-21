package StringPrograms;

public class StringUpperCase {

	public static void main(String[] args) {
		
		String str="Automation testing$$$@#";
		String substr ="test";
		System.out.println(str.toUpperCase());
		System.out.println(str.contains(substr));
		System.out.println(str.replaceAll("[^a-zA-Z]", ""));
		String str2="";
		System.out.println(str2.isEmpty());
	}

}
