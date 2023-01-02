package HackerRank;

public class MavenTec {
	public static void main(String[] args) {
		
		String st = "COOPPEC";
		char ch[]=st.toCharArray();
		int count=0;
		
		for(int i=0;i<st.length()-1;i++)
		{	
			if(ch[i]==ch[i+1])
			{
				count++;
				
			}
		}
		System.out.println(count);
		
		
	}

}
