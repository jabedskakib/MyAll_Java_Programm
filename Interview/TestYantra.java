package Interview;

import java.util.Scanner;

public class TestYantra {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Value--");
		String s =sc.nextLine();
		
		int stc = 0,spc=0,nc=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='A'&&ch<='Z'|| ch>='a'&& ch<='z')
			{
				stc++;
				
			}else if(ch>='0'&& ch<='9')
			{
				nc++;
			}else if(ch !=' ') {
				spc++;
			}
		}
		System.out.println("String are -- "+stc);
		System.out.println("Number are -- "+nc);
		System.out.println("Special Char -- "+spc);
		
		
		
	}

}
