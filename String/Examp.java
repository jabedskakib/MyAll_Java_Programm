package String;

import java.util.Scanner;

public class Examp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number --");
		int n=sc.nextInt();
		
		NtoW(n/10000000,"Crore");
		NtoW(n/100000%100,"Lakh");
		NtoW(n/1000%100,"Thousand");
		NtoW(n/100%10,"Hundred");
		NtoW(n%100," ");
		
	}

	static void NtoW(int n, String st) {

		String fn[] = {" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Therteen","Fourteen","Fifteen","SixTeen","SevenTeen","EightTeen","NineTeen"};
		String sn[]= {" "," ","Twenty","Tharty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		
		if(n<20)
		{
			System.out.print(fn[n]+" ");
		}else {
			System.out.print(sn[n/10]+fn[n%10]+" ");
		}
		if(n!=0)
		{
			System.out.print(st+" ");
		}
		
		
		
	}
}
