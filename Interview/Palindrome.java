package Interviwe;

import java.util.Scanner;

import All.MainMethod;

public class Palindrome {
	public static String PalindromeTwo(String str) {

		String s="";
		for(int i=0;i<str.length();i++)
		{
			char c =str.charAt(i);
			if(c>='A'&&c<='Z')
			{
				s=s+(char)(32+c);
			}else if(c>='a'&&c<='z')
			{
				s=s+c;
			}
		}
		char st[]=s.toCharArray();
		for(int i=0,j=s.length()-1;i<=s.length()/2;)
		{
			char ch=s.charAt(i);
			char ch1=s.charAt(j);

			while(st[i]!=st[j])
			{
				return "false";
			}
			j--;i++;
		}
		return "true";
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print(PalindromeTwo(s.nextLine())); 
	}
}


