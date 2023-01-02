package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;;

public class MapDemo1 {
	public static void main(String[] args) {
		
		Map hs= new HashMap<>();
		
		hs.put(1, "Akib");
		hs.put(2, "Jabed");
		hs.put(3, "sk");
		
		Set <Entry<Integer,String>> set = hs.entrySet();
		
		for(Entry<Integer,String> a:set)
		{
			System.out.println(a);
		}
		
		System.out.println(hs);
	}

}
