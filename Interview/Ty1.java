package Interview;

import java.util.TreeSet;

public class Ty1 {
	
	public static void main(String[] args) {
		String s[]= {"Akib","Jabed","Sk","Akil","Surej"};
		
		TreeSet<String> ts = new TreeSet<String>();
		
		for(int i=0;i<s.length;i++)
		{
			ts.add(s[i]);
		}
		System.out.println(ts);
		System.out.println();
		
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		System.out.println();
		System.out.println();
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
		
		
		
		
	}

}
