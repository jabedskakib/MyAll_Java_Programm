import java.util.*;
public class Panagram {
	
	static String isPanagram(String s)
	{
		int c[]=new int[26];
		
		if(s.length()<26)
		{
			return "Not Panagram";
		}
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				c[ch-65]++;
			}
			if(ch>='a'&&ch<='z')
			{
				c[ch-97]++;
			}
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]== 0)
			{
				return "Not Panagram";
			}
		}
		
		return "Panagram";
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String rs = isPanagram(s);
		System.out.println(rs);
				
		
		
		
		
		
	}

}
