package progjavaprac;

import java.util.Iterator;
import java.util.LinkedList;

public class Reverseanumber {

	public static void main(String[] args) {
		LinkedList<Integer> List = new LinkedList<Integer>();
		List.add(1);
		List.add(2);
		List.add(3);
	System.out.println("The number is:"+List);	
		Iterator itr = List.descendingIterator();
		while(itr.hasNext())
		{
			Object rev = itr.next();
			System.out.println(rev);
			
		}
		
		
	}

}
