package Collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapTest {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("Akib",500);
		map.put("Rako", 550);
		map.put("Koti", 400);
		map.put("Rahul", 600);
		map.put("Guddul", 350);
		
		System.out.println(map);
		
		for(Entry<String, Integer> a :map.entrySet()) {
			
			System.out.println(a);
		}
		
	}

}
