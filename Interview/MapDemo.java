package Interviwe;

import java.util.*;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> mp = new HashMap();
		mp.put(1, "Akib");
		mp.put(2, "Jabed");
		mp.put(3, "Akil");
		mp.put(4, "Ali");
		mp.put(5, "sk");
		Set<Entry<Integer, String>> st = mp.entrySet();
		for(Entry<Integer,String> est:st)
		{
			System.out.println(est);
		}
	}
}
