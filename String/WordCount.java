package MethodReturn;

public class WordCount {

	static void isWord(String str) 
	{
		char ch[] = str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&& ch[i]!=' ' || ch[i]!=0&& ch[i-1]==' ')
			{
				count++;
			}
		}
		System.out.println(count +" Word is present.");
	}

	public static void main(String[] args) {

		String st = "Hii i am a Good Boy";

//		int n = isWord(st);
//		System.out.println(n);

		isWord(st);
	}
}

