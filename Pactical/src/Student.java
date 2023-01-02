
public class Student {
	String name;
	int phy;
	int che;
	int maths;


	Student(String n,int p,int c,int m){
		this.name=n;
		this.phy=p;
		this.che=c;
		this.maths=m;

	}

	void display() {

		System.out.println(this.name);
		System.out.println(this.phy);
		System.out.println(this.che);
		System.out.println(this.maths);
	}
	void total() {
		int total_num=this.phy+this.che+this.maths;
		System.out.println(total_num);
	}
	void perc() {
		double perc=(this.phy+this.che+this.maths)/300.0*100;
		System.out.println(perc);
		
	}

	public static void main(String[] args) {

		Student s1=new Student("Akib",75,80,90);
		Student s2=new Student("Alam",89,99,95);
		Student s3=new Student("Susant",90,95,89);

		System.out.println(s1.name+" "+s1.phy+" "+s1.che+" "+s1.maths);
		System.out.println(s2.name+" "+s2.phy+" "+s2.che+" "+s2.maths);
		System.out.println(s3.name+" "+s3.phy+" "+s3.che+" "+s3.maths);

		System.out.println(" --- Using Method ---");
		s1.display();
		s2.display();
		s3.display();
		
		System.out.println(" Total Number is --");
		s1.total();
		s2.total();
		s3.total();
		System.out.println(" Percentage  is --");
		s1.perc();
		s2.perc();
		s3.perc();

	}
}
