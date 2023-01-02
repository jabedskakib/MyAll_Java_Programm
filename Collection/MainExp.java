package Collection;

import java.util.*;
import java.util.List;

public class MainExp {
	public static void main(String[] args) {
		
		
		Collection<String> colA = new ArrayList<String>();
		
		//Collection colV = new Vector<>();
		
		Collection colHS = new HashSet<>(); 
		Collection colLHS = new LinkedHashSet<>();
		
		
		colA.add("Robert");
		colA.add("Alex");
		colA.add("Rick");
		colA.add("Edward");
//		colA.add(55);

		System.out.println(colA);
		
		List colL = new LinkedList(colA);
		System.out.println(colL);
		
		Collection colV = new Vector<>(colA);
		System.out.println(colV);
		
		//Set colTS = new TreeSet<>(colA);
		//System.out.println(colTS);
		
		ListIterator<String> lit = ((ArrayList<String>) colA).listIterator();
		
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		
	}

}
