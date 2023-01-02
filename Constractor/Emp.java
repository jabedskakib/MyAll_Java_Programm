package Constractor;

class Emp {
	
	String name;
	int salary;
	
	Emp(String name,int salary){
		this.name=name;
		this.salary=salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp e1 = new Emp("Rohit", 100000);
		Emp e2 = new Emp("Raina", 90000);
		System.out.println(e1.name+" "+e1.salary);
		System.out.println(e2.name+" "+e2.salary);
	}

}
