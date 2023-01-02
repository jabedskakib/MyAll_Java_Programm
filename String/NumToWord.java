package String;

import java.util.Scanner;

public class NumToWord {
	
	static void NumWord(int n, String st )
	{
		String fn[]= {" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Therteen","Fourteen","Fifteen","SixTeen","SevenTeen","EightTeen","NineTeen"};
	
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
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Number - ");
		int n=sc.nextInt();
		
		NumWord(n/10000000, "Crore");
		NumWord(n/100000%100, "Lakh");
		NumWord(n/1000%100, "Thousand");
		NumWord(n/100%10, "Hundred");
		NumWord(n%100," ");
		
		
		
	}

}
