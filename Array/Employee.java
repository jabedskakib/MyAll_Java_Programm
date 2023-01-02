package Array;

public class Employee {

	int id;
	String name;
	double sal;
	
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		
		return this.id+" "+this.name+" "+this.sal;
	}
	
	
	
	
	
}
