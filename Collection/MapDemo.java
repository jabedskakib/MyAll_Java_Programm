package Collection;
import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap<Integer,String>();
		
		hm.put(18,"Virat");
		hm.put(null,"Afridi");
		hm.put(10,"Sachin");
		hm.put(7,"Dhoni");
		hm.put(333, "Gyale");
		hm.put(1,"ABD");
		System.out.println(hm);
		System.out.println(hm.get(333));// print KeyWord Value
		System.out.println(hm.containsKey(1)); // Check Key available or not
		System.out.println(hm.keySet()); // print all keySet
		System.out.println(hm.values());// print all Value
		System.out.println(hm.entrySet());// print All the Sets
		
		
	}
}
