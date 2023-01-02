package Collection;
import java.util.*;
public class MapExp {

	public static void main(String[] args) {
		
		Map<Integer,String> indmap = new HashMap<Integer, String>();
		
		indmap.put(7, "Dohni");
		indmap.put(8, "Virat");
		indmap.put(10, "Rohit");
		
		Map<Integer,String> ausmap = new HashMap<Integer, String>();
		ausmap.put(1, "Smith");
		ausmap.put(22, "Warner");
		ausmap.put(2, "Maxwell");
		
		Map<Integer,String> iplmap = new HashMap<Integer, String>();
		iplmap.putAll(indmap);
		iplmap.putAll(ausmap);
		System.out.println(iplmap);
		System.out.println(iplmap.size());
		System.out.println(iplmap.isEmpty());
		iplmap.remove(22);
		System.out.println(iplmap.containsKey(1));
		System.out.println(iplmap.containsValue("Rohit"));
		System.out.println(iplmap.get(8));
		System.out.println(iplmap.size());
	}

}
