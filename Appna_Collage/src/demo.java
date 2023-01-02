import  java.util.*;
class demo {

	public static void main(String[] args) {
	   ArrayList al=new ArrayList();
	   al.add("java");
	   al.add("sql");
	   al.add("web");
	   al.add("javascript");
	   System.out.println(al);
	   Iterator <String>itr=al.iterator();
	   while(itr.hasNext()) {
		   String name= itr.next();
		   System.out.println(name);
		   
	   }
	   ListIterator <String> itl=al.listIterator();
	   while(itl.hasNext()) {
		   String name=itl.next();
		   System.out.println(name);
	   }
	   ListIterator <String> itb=al.listIterator(al.size());
	   while(itb.hasPrevious()) {
		   String na=itb.previous();
		   System.out.println(na);
	   }
	   TreeSet<String> set=new TreeSet<String>();
	   set.add("sudhir");
	   set.add("akib");
	   set.add("javed");
	   set.add("null");
	   set.add("null");
	   set.add("null");
	   System.out.println(set);
	   
	   Set<Integer> s= new LinkedHashSet();
	   s.add(2);
	   s.add(3);
	   s.add(4);
	   System.out.println(s);

	}
	

}
