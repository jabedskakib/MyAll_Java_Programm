package Encapsulation;

public class Vahicle {
	
	private String brand;
	private int price;
	
	
	public void getBrand(String s)
	{
		this.brand=s;
	}
	
	public void getPrice(int p)
	{
		this.price=p;
	}
	
	
	public String setBrand()
	{
		return this.brand;
	}
	
	public int setPrice()
	{
		return this.price;
	}

}
