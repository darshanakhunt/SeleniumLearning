package JavaProgramTest;

public class ConstructorConcepts {

	String name;
	int age;
	
	public ConstructorConcepts()
	{
		System.out.println("default");
	}
	
	public ConstructorConcepts(int a)
	{
		System.out.println("one para");
	}
	public ConstructorConcepts(int a,int b)
	{
		System.out.println("2 para");
	}
	public ConstructorConcepts(String s)
	{
		System.out.println("string");
	}
	
	public static void main(String[] args) {

		ConstructorConcepts obj = new ConstructorConcepts();
		ConstructorConcepts obj2 = new ConstructorConcepts(10);
		ConstructorConcepts obj3 = new ConstructorConcepts(10,20);
		ConstructorConcepts obj4 = new ConstructorConcepts("shloka");
		
		
		obj.name="darshana";
		//System.out.println(name);
	}

}
