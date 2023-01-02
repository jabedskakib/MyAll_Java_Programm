package Map;

import java.util.*;

public class TreeDemo {
	public static void main(String[] args) {
		Set tre = new TreeSet<>();

		tre.add(12);
		tre.add(32);
		tre.add(22);
		tre.add(15);
		
		
		Set tr = new TreeSet<>();
		
		tr.add(5);
		tr.add(10);
		tr.add(20);
		tr.add(9);
		tr.add(4);
		
		System.out.println(tr);
		
		tr.addAll(tre);
		
		System.out.println(tr);
		
		System.out.println(tre.remove(22));
		tre.clear();
		System.out.println(tre);
		System.out.println(tr);
//		System.out.println(tr.removeAll(tre));
//		System.out.println(tr);
//		tr.clear();
//		System.out.println(tr);
		
		
		System.out.println(tr.size());
		System.out.println(tr.isEmpty());
		
		System.out.println(tr.iterator());
		System.out.println(tr.containsAll(tre));
		
	}

}
