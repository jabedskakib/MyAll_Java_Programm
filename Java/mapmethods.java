import java.util.*;
import java.util.Map.Entry;
class map {

	public static void main(String[] args) {
	Map<Integer,String> indmap= new HashMap<Integer,String>();
           indmap.put(10, "dhoni");
           indmap.put(11, "virat");
           indmap.put(12, "raina");
           System.out.println(indmap);
          Map <Integer,String>indasp=new HashMap<Integer,String>();
          indasp.put(13, "kohli");
          indasp.put(14, "hardik");
          indasp.put(15, "pandya");
          System.out.println(indasp);
          Map ind=new HashMap();
          ind.putAll(indmap);
          ind.putAll(indasp);
          System.out.println(ind);
          System.out.println(ind.size());
          System.out.println(ind.isEmpty());
          ind.remove(13);
          System.out.println(ind);
          System.out.println(ind.containsKey(11));
          System.out.println(ind.containsValue("pandya"));
          System.out.println(ind.get(12));
          System.out.println(ind.size());
          Set<Entry<Integer,String>> Set=ind.entrySet();
          for(Entry<Integer,String> entry:Set) {
        	  Integer key=entry.getKey();
        	  System.out.println(key);
          }
	}

}
