package Interviwe;

public class IntegerDemo {
	public static void main(String[] args) {

		Object s[] = {"abc",1,8,5,'c',10,10};
		int ar[] =new int[s.length];
		int k=0,sum=0;
		for(int i=0;i<s.length;i++)
		{
			if (s[i] instanceof Integer)
			{
				ar[k]=(int) s[i];
				k++;
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			int c=0;
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					c++;
				}
			}
			if(c == 1)
			{
				sum=sum+ar[i];
			}
		}
		System.out.println(sum);
//				for(int i=0;i<ar.length;i++)
//				{
//					System.out.println(ar[i]);
//        		}
	}
}
