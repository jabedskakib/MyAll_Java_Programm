
public class String1 {

	public static void main(String[] args) {
		String s = "YASH";
		String st="";
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				if(s.charAt(i)=='Z')
				{
					st=st+'A';
				}else{
					st=st+(char)(s.charAt(i)+1);
				}

			}else {

				if(s.charAt(i)=='A')
				{
					st=st+'Z';
				}else {
					st=st+(char)(s.charAt(i)-1);
				}
			}
		}
		System.out.println("Capital-> "+s+" -> "+st);

		
		// Smaller Character
		
		
		String sm = "yash";
		String stm="";
		for(int i=0;i<sm.length();i++)
		{
			if(i%2==0)
			{
				if(sm.charAt(i)=='z')
				{
					stm=stm+'a';
				}else{
					stm=stm+(char)(sm.charAt(i)+1);
				}

			}else {

				if(sm.charAt(i)=='a')
				{
					stm=stm+'z';
				}else {
					stm=stm+(char)(sm.charAt(i)-1);
				}
			}
		}
		System.out.println("Small-> "+sm+" -> "+stm);

		
		
		
		
		
		
		
	}

}
