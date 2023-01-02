package String;

public class FirstCap {

	public static void main(String[] args) {
		
		
		String st = " sudhir is a chutiya";
		
		char ch[]=st.toCharArray();
		
		for(int i=0;i<st.length();i++)
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
			{
				if(ch[i]>='a' ||ch[i]<='z')
				{
					ch[i]=(char)(ch[i]-32);
				}else if(ch[i]>='A' ||ch[i]<='Z')
				{
					ch[i]=(char)(ch[i]+32);
				}
				
			}
		}
		
		st=new String(ch);
		System.out.println(st);
		
	}
}
