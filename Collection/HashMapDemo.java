package Collection;
import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		
	Map<Integer, String> a = new HashMap<>();
	
		
		a.put(1, "Akib");
		a.put(4, "Sudhir");
		a.put(2, "Alam");
		a.put(5, "Vinod");
		a.put(3, "Prabha");
		
		
		
		System.out.println(a);
		
		
Map<Integer, String> b = new LinkedHashMap();
	
		
		b.put(1, "Akib");
		b.put(1, "Akib");
		b.put(4, "Sudhir");
		b.put(2, "Alam");
		b.put(5, "Vinod");
		b.put(3, "Prabha");
		
		
		
		System.out.println(a);
		
	}
	
	

}
