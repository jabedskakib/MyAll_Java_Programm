package Interview;

import java.util.Scanner;

public class UniueMiddle {
	static int number (int a,int b,int c)
	{
		if((a<b && b<c) ||(c<b && b<a) )
			return b;
		else if((b<a && a<c)||(c<a && a<b))
			return a;
		else
			return c;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three integer values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==b||a==c||b==c)
		{
			System.out.println("Please Enter Distinct Value");
		}else {
			int middle=number(a,b,c);
			System.out.println(middle);
		}
	}

}
