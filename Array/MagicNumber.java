package Array;

public class MagicNumber {
	public static void main(String[] args) {

		int a[]= {23,45,56,78,86,45,35};
		int b[]=new int[a.length];

		for(int i=0;i<a.length;i++)
		{
			b[i]=a[(a.length-1)-i];
		}

		for(int i=0;i<a.length/2+1;i++) {
			if(a[i]==b[i]) {
				System.out.println(a[i]+" is magic number");
			}
		}
	}
}
