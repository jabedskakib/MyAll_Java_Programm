import java.util.Scanner;

class insertelement {
static int[] insert(int[]ar,int ele,int index) {
	if(index<0||index>ar.length){
		System.out.println("index out of range");
		return ar;
	}
	int na[]=new int[ar.length+1];
	na[index]=ele;
	for(int i=0;i<ar.length;i++) {
		if(i<index) 
			na[i]=ar[i];
		else
			na[i+1]=ar[i];
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
	System.out.println("enter the element");
	int ele=sc.nextInt();
	System.out.println("enter the position");
	int index=sc.nextInt();
	ar=insert(ar,ele,index);
	System.out.println("entered new array");
	for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]+" ");
	}
	

	}

}
