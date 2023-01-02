
public class SomOfDigit {
	public static void main(String[] args) {
		
		String st="sj5dd34 j58sjkf94 sdhkjh90 klsdkl39 fdjjk99";
		int sum=0;
		//char ch[]=st.toCharArray();
		
		
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='0' || ch<='9'&& ch+1>='0' || ch+1<='9') 
			{
				int add=0; 
				add=((add+(char)ch-48)*10)+(char)(ch-48)+1;
				
				sum=sum+add;
			}else if(ch>='1' && ch<='9')
			{
				sum=sum+(char)ch-48;
			}	
		}
		System.out.println(sum);
		
		
		
		
	}

}
