package progjavaprac;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseOrderLinkedList {

	public static void main(String[] args) {
		LinkedList<String>link = new LinkedList<String>();
link.add("Hello");
link.add("World");
Iterator itr = link.descendingIterator();
while(itr.hasNext())
	
	
{
	System.out.println(itr.next());
	
	
}

	}

}
