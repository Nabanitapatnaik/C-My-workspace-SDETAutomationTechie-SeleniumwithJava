package progjavaprac;
import java.util.Iterator;
import java.util.LinkedList;

public class Example3 {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("P");
		list.add("E");
		System.out.println(list);
		Iterator itr = list.descendingIterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		

	}

}
