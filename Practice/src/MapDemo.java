import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class MapDemo {

	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		
		ll.add(25);
		ll.add(35);
		ll.add(65);
		ll.add(99);
		ll.add(20);
		ll.add(19);
		ll.add(99);
		
		System.out.println("Linked List - "+ll);
		System.out.println();
		
		HashSet hs = new HashSet<>(ll);
		
		System.out.println("Remove Duplicate - "+hs);
		System.out.println();
		
		TreeSet ts = new TreeSet<>(hs);
		System.out.println("Assending Order - "+ts);
		
		
		
	}
}
