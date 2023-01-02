package HackerRank;


/*
 Task
Given an integer, , perform the following conditional actions:

---> If  is odd, print Weird
---> If  is even and in the inclusive range of  to , print Not Weird
---> If  is even and in the inclusive range of  to , print Weird
---> If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

--->Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.



 */
public class Ifelse {


	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		int n = 101;

		if (n>=1 && n<=100) {
			if (n%2==1) {
				System.out.println("Weird");
			}else if(n%2==0) {
				if(n>=2 && n<=5) {
					System.out.println("not-weird");
				}else if(n>=6 && n<=20) {
					System.out.println("Weird");
				}else if (n>=21){
					System.out.println("Not-Weird");
				}
			}
		}else {
			System.out.println("Wrong Input");
		}
	}

}
