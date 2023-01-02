
public class Demo12 {

	public static void main(String[] args) {
	
		String s = "Hello World";
		String st="";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch !=' ')
			{
				st=ch+st;
			}
			if(ch==' ' || i==s.length()-1)
			{
				System.out.print(st+" ");
				st="";
			}
			
		}
		
		
		
	}
}
