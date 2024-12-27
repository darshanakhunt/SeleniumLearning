package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> tvseries =new ArrayList();
		
		tvseries.add("Mismatched");
		tvseries.add("Breaking Bad");
		tvseries.add("Big Bang Theory");
		tvseries.add("The walking Dead");
		tvseries.add("Prison Break");
		
		//1.using java8 with for eachloop and lambda exp
		
		tvseries.forEach(shows ->{
	
			System.out.println(shows);
	});

		//2.iterator
		
		Iterator<String> it = tvseries.iterator();
		while(it.hasNext())
		{
			String shows = it.next();
			System.out.println(shows);
		}
		
		 
		//using iterator and java 8 for eachremaining() method
		
	//for each loop
		
		for(String show : tvseries)
		{
			System.out.println(show);
		}
		
		
		//using for with order
		
		for(int i=0;i<tvseries.size();i++) {
			System.out.println(tvseries.get(i));
		}
		
		
	}}
