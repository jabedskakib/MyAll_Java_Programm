
public class Panagram {

	static boolean isPanagram(String s)
	{
		if(s.length()>=26)
		{
			return false;
		}
		
		 int a[]=new int[26];
		 
		 for(int i=0;i<a.length;i++)
		 {
			 char ch = s.charAt(i);
			 
			 if(ch>='A'&& ch<='Z')
			 {
				 a[ch-65]++;
			 }
			 
			 if(ch>='a'&&ch<='z')
			 {
				 a[ch-97]++;
			 }
		 }
		 for(int i=0;i<a.length;i++) 
		 {
			 if(a[i]==0)
			 {
				 return false;
			 }
		 }
		 
		 return true;
		 
	}
	
	public static void main(String[] args) {
		
		String s="asdfgaadfdahjklqwertyuiopzxcvbnm";
		
		boolean rs = isPanagram(s);
		
		if(rs)
		{
			System.out.println("Panagram");
		}else {
			System.out.println("Not Panagram");
		}
		
	}
}
