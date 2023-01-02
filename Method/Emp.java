package Method;

public class Emp {
	String name;
	int salary;

	public Emp(String n,int s) {
		// TODO Auto-generated constructor stub
	
		this.name=n;
		this.salary=s;
	
	}
	void details() {
		// Create Method
		
		System.out.println("Employee Name is - "+this.name);
		System.out.println("Salary is -- "+this.salary);
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		
		// Object Define with Contractor
		
		Emp e1 = new Emp("AKib",50000); 
		Emp e2 = new Emp("Alam",45000);
		
		e1.details(); // Method Called
		e2.details(); // Method Called
				
	}

}
