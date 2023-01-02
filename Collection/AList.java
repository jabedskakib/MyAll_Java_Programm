package Collection;
import java.util.ArrayList;

public class AList {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("Java");
		al.add("Python");
		al.add("SQL");
		al.add("MySQL");
		al.add("PHP");
		al.add("JS");
		al.add("React");
		al.add("GO");
		al.add("C++");
		al.add("C");
		al.add("SEO");
		System.out.println(al);
//		al.remove(10);
//		System.out.println(al);
//		al.remove(9);
//		System.out.println(al);
		
		System.out.println(al.size()); // ArrayList Size
		
		System.out.println(al.isEmpty()); // Check Empty or not
		
		System.out.println(al.contains("Python")); // Find the Object present or Not
		
		System.out.println(al.containsAll(al));
		
		System.out.println(al.addAll(al));
		System.out.println(al.size());
		
		

	}

}
