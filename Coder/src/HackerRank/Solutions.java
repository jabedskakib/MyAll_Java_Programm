package HackerRank;

import java.util.Arrays;

public class Solutions {
	public static void maxSatisfaction(int[] A) {
        Arrays.sort(A);
        System.out.println();
        int res = 0, total = 0, n = A.length;
        for (int i = n - 1; i >= 0 && A[i] > -total; --i) {
        	System.out.print(A[i]+" --> ");
            total += A[i];
            System.out.println(total);
            res += total;
        }
        System.out.println(res);
    }
	
	public static void main(String[] args) {
		int a[]= {-1,-8,0,5,-9};
		
		maxSatisfaction(a);
		
	}

}
