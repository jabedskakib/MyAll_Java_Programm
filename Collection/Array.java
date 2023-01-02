package Collection;
import java.util.*;
public class Array {
	public static void main(String[] args) {
		int a[]={1,3,4,0,2,1,3,4,1};
		
		HashSet hs = new HashSet<>();
		
		
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		
		
	System.out.println(hs);
	
	}
	

}
