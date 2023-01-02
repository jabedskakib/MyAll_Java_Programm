package MethodReturn;

import java.util.*;

public class Num2Word {
	
	static void num2Word(int n, String s)
	{
		String fn[]= {"","One","Two","Three","four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen" };
		String sn[]= {"","", "Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety" };
		
		
		if(n>20) {
			System.out.println(fn[n]);
		}else {
			System.out.println(sn[n/10]+fn[n%10]);
		}
		
//		if()
	
	}

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		num2Word(n/10000000,"Crore");
		num2Word(n/100000%100,"Lakh");
		num2Word(n/1000%100,"Thousand");
		num2Word(n/100%10,"Hundred");
		num2Word(n/100," ");
		
		
	}
}
