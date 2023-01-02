
import java.util.Iterator;
import java.util.Scanner;
public class CharDemo {
	
	static boolean isPal(String s)
	{
		char ch[]=s.toCharArray();
		int j=ch.length-1;
		for(int i=0;i<ch.length;)
		{
			if(ch[i]!=ch[j])
			{
				return false;
			}
			i++;j--;
		}

		return true;
	}

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		String s =sc.next();
		
		boolean rs = isPal(s);
		if(rs)
		{
			System.out.println("palindrom");
		}else {
			System.out.println("not palindrom");
		}
		
		
		
	}	

}
