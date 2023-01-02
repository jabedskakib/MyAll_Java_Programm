import java.util.Scanner;

class deletearray {
	static int[] delete(int[] ar,int index) {
	if(index<0||index>ar.length){
		System.out.println("index out of range");
		return ar;
	}
	int na[]=new int[ar.length-1];
	for(int i=0;i<na.length;i++) {
		if(i<index) 
			na[i]=ar[i];
		else
			na[i]=ar[i+1];
	}
	return na;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=sc.nextInt();
		System.out.println("enter the elements");
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("enter the position");
		int index=sc.nextInt();
		ar=delete(ar,index);
		System.out.println("entered new array");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse");
		
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+" ");
		}
		

	}

}
