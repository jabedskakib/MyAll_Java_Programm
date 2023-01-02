package String;

public class Palindrome {
	
	static boolean isPalin(String s)
	{
		for(int i=0,j=s.length()-1;i<s.length()/2;)
		{
			while(i<j) {
				if(s.charAt(i)!=s.charAt(j))
				{
					return false;
				}
				i++;
				j--;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		String s="keek";
		
		boolean rs=isPalin(s);
		if(rs)
		{
			System.out.println("Palindrom");
		}else {
			System.out.println("Not Palindrom");
		}
		
		
	}
}
