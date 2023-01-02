package Interviwe;

import java.util.*;
import java.util.Collection;

public class ListDemo {

	public static void main(String[] args) {
		List ls = new ArrayList();
		
		ls.add(55);
		ls.add(58);
		ls.add(85);
		ls.add(97);
		ls.add(25);
		
		System.out.println("After Reverse");
		System.out.println(ls);
		
//		for(int i=ls.size()-1;i>=0;i--)
//		{
//			System.out.print(ls);
//		}
		
		Collections.reverse(ls);
		System.out.println(ls);
		
		
		
		
	}
}
