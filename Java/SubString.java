import java.util.Scanner;

public class SubString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String: ");
	String s = sc.nextLine();
	System.out.println("Enter the sub string: ");
	String sb = sc.nextLine();
	if(s.indexOf(sb)>=0)
		System.out.println("It is a part of the string");
	else
		System.out.println("It is not a part of the string");
}
}
