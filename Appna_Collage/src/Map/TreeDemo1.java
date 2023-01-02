package Map;
import java.util.*;
public class TreeDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<String> tre = new TreeSet<>();
		
		tre.add("java");
		tre.add("sql");
		tre.add("sudhir");
		tre.add("rawol");
		
		
	 Iterator<String> ite=tre.iterator();
	 
	 while(ite.hasNext()) {
	 String name= ite.next();
		System.out.println(name);	
	 }
	 
	 System.out.println(tre);
	}

}
