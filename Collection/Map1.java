package Collection;
import java.util.*;
import java.util.Map.Entry;

public class Map1 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> mp = new HashMap();
		
		mp.put(1, "Akib");
		mp.put(2, "Sudhir");
		mp.put(3, "Alam");
		mp.put(4, "Vinod");
		mp.put(5, "Prabha");
		mp.put(6, "Ali");
		
		System.out.println(mp.entrySet());
		
		for(Entry<Integer, String> i:mp.entrySet())
		{
			System.out.println(i);
		}
		
//		
//		for(int i=1;i<=mp.size();i++)
//		{
//			while(mp.isEmpty()==false)
//			{
//				System.out.println(mp.get(i));
//				break;
//			}
//		}
		
		
		
	}

}
