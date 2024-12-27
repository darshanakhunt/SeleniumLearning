package Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable h1= new Hashtable();
		h1.put(1, "tom");
		h1.put(2, "java");
		h1.put(3, "qa");
		
		
		Hashtable h2 = new Hashtable();
		h2=(Hashtable)h1.clone();
		
		System.out.println("vlaue of h1"+h1);
		System.out.println("value of h2"+h2);
		h1.clear(); 
		
		Hashtable st =new Hashtable();
		
		st.put("A", "darshana");
		st.put("B", "Java2");
		st.put("C", "selenium");
		
		if(st.containsValue("darshana"))
		{
			System.out.println("value is found");
		}
		
		Enumeration e= st.elements();
		System.out.println("print value from st:");
		while(e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
		}
		
		//get all the values from hashtable using entryset()
		
		System.out.println("using entryset***");
		
		Set s= st.entrySet();
		System.out.println(s);
		
		Hashtable st2= new Hashtable();
		
		st2.put("AA", "QA");
		st2.put("BB", "Dev");
		st2.put("CC","Selenium");
		
		
		if(st.equals(st2))
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("Not");
		}
		
		System.out.println(st.get("A"));
		System.out.println(st.hashCode());
	}

}
