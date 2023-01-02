
 public class Student 
 { 
// Step 1: Declaration of instance variables i.e state of objects. 
     String name; 
     int rollNo; 
     int age; 

// Step 2: Declaration of a default constructor. The constructor name must be the same as the class name. 
     Student()
     { 
// Step 3: Values initialization of state of objects i.e values of variables. 
       name = "Shubh"; 
       rollNo = 05; 
       age = 22; 
    } 
// Step 4: Declare an instance method and print values of instance variables. 
      void display()
      { 
         System.out.println("Student's name:" +name); // Since this is instance area. That's why, we can directly call the instance variables. 
         System.out.println("Student's roll no: " +rollNo); 
         System.out.println("Student's age:" +age); 
     } 
// Step 5: Declare the main method. It is a static method. So, it is a static area. 
     public static void main(String[] args) 
     { 
// Step 6: Create an object of the class. 
     Student st = new Student(); // It will call the default constructor. 

// Step 7: Now, call display method using object reference variable st because we cannot call non-static members directly in the static region. 
      st.display(); 
    } 
  }