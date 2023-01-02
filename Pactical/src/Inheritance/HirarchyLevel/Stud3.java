package Inheritance.HirarchyLevel;

public class Stud3 extends Collage {
	
	public static void main(String[] args) {
		
		Stud3 s3 = new Stud3();
		
		s3.sid =99;
		s3.sname ="Alam";
		s3.num=975448415l;
		s3.age= 25;
		
		System.out.println("Development - "+ s3.development);
		System.out.println(s3.sid);
		System.out.println(s3.sname);
		System.out.println(s3.num);
		System.out.println(s3.age);
		
		s3.java();
		
		
	}

}
