package Collection;

import java.util.*;

public class List {
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
			
			a1.add("Akib");
			a1.add("Sudhir");
			a1.add("Alam");
			a1.add("Vinod");
			a1.add("Prabha");
			a1.add(500);
			
		System.out.println(a1);
		
		LinkedList l1 = new LinkedList();
		
		l1.add("Akib");
		l1.add("Sudhir");
		l1.add("Alam");
		l1.add("Vinod");
		l1.add("Prabha");

		System.out.println(l1);
		
		Vector v1 = new Vector();
		
		v1.add("Akib");
		v1.add("Sudhir");
		v1.add("Alam");
		v1.add("Vinod");
		v1.add("Prabha");
		
	System.out.println(v1);
	
	a1.remove("Vinod");
	v1.remove("Vinod");
	l1.remove("Vinod");
	
	System.out.println(a1);

	System.out.println(l1);

	System.out.println(v1);
	
	System.out.println(a1.isEmpty());
	System.out.println(l1.isEmpty());
	System.out.println(v1.isEmpty());
//	
//	System.out.println(a1.iterator());
//	System.out.println(l1.iterator());
//	System.out.println(v1.iterator());
	
	System.out.println(a1.containsAll(l1));
	System.out.println(a1);
	System.out.println(v1.isEmpty());
			
		
	}

}
