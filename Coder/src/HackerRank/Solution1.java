package HackerRank;

import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      String s1=sc.next();
	      int n1=sc.nextInt();
	      
	      //String s2=sc.nextLine();
	      String sb2=sc.next();
	      int n2=sc.nextInt();
	      
	     // String s3=sc.nextLine();
	      String sb3=sc.next();
	      int n3=sc.nextInt();
	      
	      if(n1<99) {
	    	  System.out.println(s1+"           0"+n1);
	      }else {
	    	  System.out.println(s1+"           "+n1);
	      }
	      
	      if(n2<99) {
	    	  System.out.println(sb2+"           0"+n2);
	      }else {
	    	  System.out.println(sb2+"           "+n2);
	      }
	      
	      if(n3<99) {
	    	  System.out.println(sb3+"           0"+n3);
	      }else {
	    	  System.out.println(sb3+"           "+n3);
	      }
	      
	      
	      
	      
	      
	}

}
