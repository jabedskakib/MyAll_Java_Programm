package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class AdvFor {

	public static void main(String[] args) {
		
		Set<Integer> st = new HashSet<Integer>();
		
		st.add(56);
		st.add(25);
		st.add(95);
		st.add(99);
		st.add(52);
		st.add(25);
		st.add(65);
	
		ArrayList<Integer> lt=new ArrayList<Integer>(st);
		
		System.out.println(lt);
		
		for(int i=0;i<lt.size();i++)
		{
			int n=lt.get(i);
			System.out.print(n+" ");
		}
		System.out.println();
		
		System.out.println(st);
		System.out.println();
		for(Object n:st)
		{
			System.out.print(n+" ");
		}
		
		
	}
}
