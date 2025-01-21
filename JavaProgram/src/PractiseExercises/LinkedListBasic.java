package PractiseExercises;

import java.lang.classfile.components.ClassPrinter.Node;

public class LinkedListBasic {

	Node Head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public void printlinkedlist() {
		Node n=Head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		
	}
	public static void main(String args[])
	{
		LinkedListBasic obj= new LinkedListBasic();
		
		Node first=obj.new Node(10);
		obj.Head=first;
		
		Node second=obj.new Node(20);
		first.next=second;
		
		Node third = obj.new Node(30);
		second.next=third;
		
		obj.printlinkedlist();
	}

}
