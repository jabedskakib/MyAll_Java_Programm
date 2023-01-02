 package Interview;

public class StringRev {
	public static void main(String[] args) {
		
		String st = "Hello Akib Jabed";
		String s="";
		
		for(int i=0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			if(ch !=' ')
			{
				s=ch+s;
				
			}
			if(ch==' ' || i==st.length()-1)
			{
				System.out.print(s + " ");
				s="";
			}
		}

	}

}
