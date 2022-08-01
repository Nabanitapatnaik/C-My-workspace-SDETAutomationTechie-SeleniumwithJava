package progjavaprac;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList4 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Tom");
		list.add("Sam");
		list.add("Ron");
		//Traversing the list of elements in reverse order
		Iterator i= list.descendingIterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}

		}
		

	}


