package Inheritance.HirarchyLevel;

public class Stud2 extends Collage{

	
	public static void main(String[] args) {
		
		Stud2 s2 = new Stud2();
		
		s2.sid =99;
		s2.sname ="Sudhir";
		s2.num=9589965965l;
		s2.age= 26;
		
		System.out.println("Testing - "+ s2.testing);
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.num);
		System.out.println(s2.age);
		
		s2.python();
		s2.sql();
		
	}
}
