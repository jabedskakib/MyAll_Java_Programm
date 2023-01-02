import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :-- ");
		String s =sc.nextLine();
		System.out.println("Enter Remove Character :- ");
		
		char ch1 = 'r';
		
		String str ="";
		
		//char str[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(ch != ch1)
			{
				str=str+ ch;
			}
		}
		
		System.out.println(str);
		
		
		
		
	}

}
