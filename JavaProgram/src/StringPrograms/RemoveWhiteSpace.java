package StringPrograms;

public class RemoveWhiteSpace {

	public static void main(String[] args) {

		String str="Automation Testing Java";
		String newstr = str.replaceAll("\\s", "");
		System.out.println("new"+ newstr);
	}

}
