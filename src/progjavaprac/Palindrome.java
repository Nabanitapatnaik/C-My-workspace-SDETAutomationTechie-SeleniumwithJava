package progjavaprac;

import java.util.Iterator;
import java.util.LinkedList;

public class Palindrome {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("m");
		list.add("a");
		list.add("m");
		System.out.println(list);
		Iterator itr = list.descendingIterator();
		while(itr.hasNext())
			
		{
			System.out.println(itr.next());
			
		}
		
		
	}

}
