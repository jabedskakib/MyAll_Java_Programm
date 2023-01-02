
public class Emp {
	Emp() {
	    	System.out.println(" 546");
	    }
public static void main(String[] args) {
	StringBuilder builder=new StringBuilder("Hi");
    builder.append("Java 8");
    builder.append("Java 9");
    System.out.println(builder);

    StringBuffer buffer=new StringBuffer("Hi");
    buffer.append("Java 8");
    buffer.append("Java 9");
    System.out.println(buffer);
 

    String s=new String("Hi");
    s=("Java 8");
    s=("Java 9");
    System.out.println(s);
    
   Emp e=new Emp();
    
    
}
}
