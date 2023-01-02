package All;

import java.util.Objects;

public class Employee {
	private int eid;
	private String  ename;
	private double esal;
	

	public Employee(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public static void main(String[] args) {
		
		Employee em1 = new Employee(101,"Akib",45623.45);
		Employee em2 = new Employee(102,"Alam",489623.45);
		Employee em3 = new Employee(103,"Sudhir",45623.45);
		
		// Override toString() Method
		System.out.println(em1);
		System.out.println(em2);
		System.out.println(em3);
		
		// Override hashCode() Method
		
		System.out.println(em1.hashCode());     
		System.out.println(em2.hashCode());
		System.out.println(em3.hashCode());
		
		// Override hashCode() Method
		
		System.out.println(em1.equals(em2));
		System.out.println(em1.equals(em3));
		System.out.println(em2.equals(em3));
		
			
	}
	
	public String toString()
	{
		return "["+eid+","+ename+","+esal+"]";
	}

	@Override
	public int hashCode() {
		return eid;
	}

	public boolean equals(Object em)
	{
		Employee e =(Employee) em;
		
		return this.esal==e.esal;
	}
	


}
