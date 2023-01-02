package Interviwe;

import java.util.Scanner;
import java.util.Stack;

public class ExpDemo {

	static boolean isValid(String s)
	{
		Stack<Character> st = new Stack<>();
		
		for(char c : s.toCharArray())
		{
			if(c == ')' )
			{
				st.push(')');
			}
			else if(c == '{')
			{
				st.push('}');
			}
			else if(c == '[')
			{
				st.push(']');
			}
			
			else if(st.isEmpty()||st.pop()!= c)
			{
				return false;
			}
		}
		return st.isEmpty();
		
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Parenthesis ");
		String s=sc.nextLine();

		boolean rs = isValid(s);
		System.out.println(rs);

	}
}