package MethodReturn;

import java.util.Scanner;


public class AmstrongNum {
	static int countDigit(int n){
		int count = 0;
		while(n!=0){
			n=n/10;
			count++;
		}
		return count;
	}
	
	static int isAmstrong(int x) {
		int dc=countDigit(x);
		int sum = 0,temp=x;
		
		do {
			int d = x%10;
			sum = sum+pow(d,dc);
			
			x=x/10;
		}while(x!=0);
		
		
		return sum ;
	}
	
	
	public static int pow(int d, int dc) {
		int pow=d;
		int c= d;
		//for(int i=1;i<=dc;i++) {
			while(dc!=1) {
				pow =pow*c; 
				dc--;
				
			}
		return pow;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number -- ");
		int x=sc.nextInt();
		
		int sum=isAmstrong(x);
		
		if(x==sum) {
			System.out.println("ArmStrong");
		}else {
			System.out.println("Not ArmStrong");
		}
	}
}








