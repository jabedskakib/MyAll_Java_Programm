package MethodReturn;
import java.util.Scanner;

public class Smallest3Double {

	static double isBiggest(double x,double y,double z) {
		double small=x;
		if(small>y) {
			small = y;
		}
		if(small>z) {
			small = z;
		}
		return small;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 1 double -- ");
		double x=sc.nextDouble();
		System.out.print("Enter 2 double -- ");
		double y=sc.nextDouble();
		System.out.print("Enter 3 double -- ");
		double z=sc.nextDouble();
		double ar=isBiggest(x, y, z);
		System.out.println(ar+" is Smallest Number");	
	}

}
