package MethodReturn;

import java.util.Scanner;

public class StrongNum {
	
	static boolean isStrongNum(int x) {
		int stNum=0;
		int zx=x;
		while(x!=0) {
			int y = x%10;
			int sum = 1;
			while(y!=0) {
				int z =y;
				sum = sum*z;
				y--;
			}
			stNum  = stNum +sum;
			x=x/10;
		}
		if(zx==stNum) {
			return true;
		}else {
			return false;
		}	
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number -- ");
		int x=sc.nextInt();
		boolean strong=isStrongNum(x);
		System.out.println(strong);
		if (strong==true) {
			System.out.println(x+" is Strong Number");
		}else{
			System.out.println(x+" is Not Strong Number ");
		}
	}
}
