package String;

import java.util.Scanner;

public class VoielsDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vc=0;int ic=0;int spc=0;int cc=0;
		String s = sc.nextLine();

		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
			{
				vc++;
			}else if(ch >='0'&&ch<='9') {
				ic++;
				
			}else if(ch==' ') {
				spc++;
			}else if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
				cc++;
			}
		}
		System.out.println("Voiels are -- "+vc);
		System.out.println("Integer are -- "+ic);
		System.out.println("Space are -- "+spc);
		System.out.println("Consonants are -- "+cc);
		
	}
}
