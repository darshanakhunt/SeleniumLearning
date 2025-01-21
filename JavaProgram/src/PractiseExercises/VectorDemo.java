package PractiseExercises;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> obj = new Vector<Integer>();
		
		obj.add(1);
		obj.add(22);
		obj.add(3);
		obj.add(4);
		obj.add(55);
		obj.add(633);
		obj.add(72);
		
		System.out.println(obj);
		obj.remove(5);
		System.out.println(obj);

		Vector<Integer> objnew =new Vector<Integer>();
		objnew.add(11);
		objnew.add(12);
		objnew.add(13);
		objnew.add(14);
		objnew.add(15);
		
		obj.addAll(objnew);
		System.out.println(obj);
		
		for(Integer i : obj)
		{
			System.out.println(i);
		}
		System.out.println("+++++++++++++++");
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		Iterator<Integer> it = obj.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("sorting");
		Collections.sort(obj);
		System.out.println(obj);
		
	}

}
