package MethodReturn;
import java.util.*;
public class Biggest3Integer {
	static int isBiggest(int x,int y,int z) {
		int big=x;
		if(big<y) {
			big = y;
		}
		if(big<z) {
			big = z;
		}
		return big;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 1 integer -- ");
		int x=sc.nextInt();
		System.out.print("Enter 1 integer -- ");
		int y=sc.nextInt();
		System.out.print("Enter 1 integer -- ");
		int z=sc.nextInt();
		int ar=isBiggest(x, y, z);
		System.out.println(ar+" is Biggest Number");	
	}
}
