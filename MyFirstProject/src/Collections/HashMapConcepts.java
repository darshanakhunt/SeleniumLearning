package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcepts {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hp= new HashMap<Integer,String>();
		hp.put(1, "selenium");
		hp.put(2, "Java");
		hp.put(3, "C++");
		
		System.out.println(hp.get(1));
		System.out.println(hp.get(4));
		
		for(Entry m : hp.entrySet())
		{
			System.out.println(m.getKey() +"  "+ m.getValue());
		}

		hp.remove(1);
		System.out.println(hp);
		
		HashMap<Integer,Employee> emp = new HashMap<Integer,Employee> ();
		
		Employee e1 = new Employee(20,"tom","QA");
		Employee e2 = new Employee(30,"peter","admin");
		Employee e3 = new Employee(40,"Steve","dev");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		
		//traverse the hashmap
		
		for(Entry<Integer,Employee> m:emp.entrySet()) {
			int key =m.getKey();
			Employee e=m.getValue();
			
			System.out.println(key+"info");
			
			System.out.println(e.name+" "+ e.dept +" "+ e.age);
		}
	}    

}
