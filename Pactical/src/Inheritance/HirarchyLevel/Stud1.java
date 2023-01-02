package Inheritance.HirarchyLevel;

public class Stud1 extends Collage {
	
	public static void main(String[] args) {
		
		Stud1 s1 = new Stud1();
		
		s1.sid =99;
		s1.sname ="Akib";
		s1.num=8548963215l;
		s1.age= 24;
		
		System.out.println("Development - "+ s1.development);
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.num);
		System.out.println(s1.age);
		
		s1.java();
		s1.sql();
		
	}

}
