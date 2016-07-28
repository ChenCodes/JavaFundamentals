import java.io.*;

public class Employee{
   // salary  variable is a private static variable
   private static double salary;

   // DEPARTMENT is a constant
   public static final String DEPARTMENT = "Development ";

   public static void main(String args[]){
      salary = 1000;
      System.out.println(DEPARTMENT + "average salary:" + salary);
   }
}

//Here, we have a static variable called DEPARTMENT which we can access by just saying "DEPARTMENT", but if we wanted to call this variable from a different class, we would need Employee.DEPARTMENT.

