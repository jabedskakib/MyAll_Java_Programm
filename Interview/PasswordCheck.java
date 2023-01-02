package Interview;

public class PasswordCheck {
	
	static boolean passCheck(String st)
	{
		int cc=0,nc=0;
		if(st.length()>10 || st.length()<8)
		{
			return false;
		}
		
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='0'&&ch<='9')
			{
				cc++;
				nc++;
			}
		}
		if(nc<2 || cc<1)
		{
			return false;
		}
		
		
		return true;
	}
	
	public static void main(String[] args) {
		
		String st="skAkib1997";
		
		boolean rs=passCheck(st);
		if(rs)
		{
			System.out.println("Valid PassWord");
		}else {
			System.out.println("Invalid PassWord");
		}
		
	}
	
	

}
