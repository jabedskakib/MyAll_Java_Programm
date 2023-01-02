package Interviwe;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {
	public static boolean isValid(String s) {
		if(s.length() %2!=0)
		{
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(') 
			{
				stack.push(')');
			}
			else if (c == '{') 
			{
				stack.push('}');
			}
			else if (c == '[')
			{
				stack.push(']');
			}
			else if (stack.isEmpty() || stack.pop() != c)
			{
				return false;
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Parenthesis ");
		String s=sc.nextLine();

		boolean rs = isValid(s);
		System.out.println(rs);

	}


}
