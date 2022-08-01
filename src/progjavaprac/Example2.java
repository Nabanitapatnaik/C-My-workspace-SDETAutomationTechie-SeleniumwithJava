package progjavaprac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		
		LinkedList<String>Lis = new LinkedList<String>();
		Lis.add("hello");
		Lis.add("world");
		System.out.println(Lis);
	Iterator itr = Lis.descendingIterator();
	while(itr.hasNext())
	{
	Object reverse = itr.next();
	System.out.println(reverse);
		
	}
		
		
		

	}

}
