package Conditional;
import java.util.*;
public class Big2Num {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value :- ");
		
		int x= sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		
		// Two Biggest Number 
		System.out.println("Two Biggest Number \n");
		
		String xy=(x>y)?x+" is Biggest":y+" is Biggest";
		System.out.println(xy);
		
		// Three Biggest Number 
		System.out.println("\nThree Biggest Number\n");
		
		String xyz=(x>y)?x+" is Biggest":(y>z)?y+" is Biggest":z+" is Biggest";
		System.out.println(xyz);
		
		// Positive or Negetive num
		
		System.out.println("\nPositive or Negetive num\n");
		
		String pos=(x>0)?x+" is Positive":x+" is Negetive";
		System.out.println(pos);
		
		
		
		
		
	}

}
