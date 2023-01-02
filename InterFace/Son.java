package InterFace;

public class Son implements Father{
	
	@Override
	public void drink() {
		System.out.println("Drink");
		
	}
	public static void main(String[] args) {
		Father f = new Son();
		f.drink();
	}
	@Override
	public void coffe() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void tea() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void colddrink() {
		// TODO Auto-generated method stub
		
	}

}
