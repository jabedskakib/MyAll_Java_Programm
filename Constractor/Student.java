package Constractor;

public class Student {
	String name;
	int roll;

	public Student(String n,int r) {
		// TODO Auto-generated constructor stub
		this.name = n;
		this.roll = r;
	}
	public static void main(String[] args) {
		
		Student s1 = new Student("Akib",99);
		Student s2 = new Student("Alam", 100);
		
		System.out.println(s1.name +" "+s1.roll);
		System.out.println(s2.name +" "+s2.roll);
	}
	


}
