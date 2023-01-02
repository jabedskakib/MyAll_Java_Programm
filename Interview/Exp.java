package Interviwe;
public class Exp {

	public static void main(String[] args) {
		String st="jf kjbdskjb fkj5kji hsu25dif h sohoh845 jf379 48747gg";
		char ch[]=st.toCharArray();
		int sum[]=new int[st.length()];
		int k=0;
		int ans=0;
		for(int i=0;i<ch.length;i++) 
		{
			while(i<ch.length&&ch[i]>='0'&&ch[i]<='9') 
			{
				System.out.print(ch[i]);
				ans=ans*10+(int)ch[i];
				i++;
			}
			sum[k]=ans;
			k++;

			if(i<ch.length&&ch[i]>='0'&&ch[i]<='9')
				ans=ans+(int)ch[i];
		}
		int count=0;
		for(int i=0;i<sum.length;i++) {
			if(sum[i]!=0)
				count=count+sum[i];
		}
	}
}