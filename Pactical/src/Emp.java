
public class Emp {
	String name;
	int sal;
	String company;


	Emp(String n,int s,String c){
		this.name=n;
		this.sal=s;
		this.company=c;
		

	}
	public static void main(String[] args) {

		Emp e1=new Emp("Akib",50000,"Wipro");
		Emp e2=new Emp("Alam",55000,"MicroSoft");
		Emp e3=new Emp("Susant",65000,"Google");
		
		System.out.println(e1.name+" "+e1.sal+" "+e1.company);
		System.out.println(e2.name+" "+e2.sal+" "+e2.company);
		System.out.println(e3.name+" "+e3.sal+" "+e3.company);
		
		
	}
}
