package Collection;

import java.util.*;

public class Hashing {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer> set = new HashSet<Integer>(); 
		
		
		// Add number
		set.add(5);
		set.add(10);
		set.add(7);
		set.add(12);
	
		System.out.println(set);
	
		//set.contains(1);   // check contains
		if(set.contains(5))
		{
			System.out.println("yes 5 is Containts");
		}
		
		if(!set.contains(3))
		{
			System.out.println("yes 3 is not Containts");
		}
		
		 set.add(11);

		 System.out.println(set);
//		 for(int i=1;i<=10;i++)
//		 {
//			set.add(sc.nextInt());
//		 }
//		 System.out.println(set);
//		 
		 
		 //  iterrate
		 
		 Iterator it= set.iterator();
		 System.out.println("next - "+it.next());
		 
		 while(it.hasNext())
		 {
			System.out.print(it.next()+" "); 
		 }
		 
		 
		 
		 
	}
}




















