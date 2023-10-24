package Student;
import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    Student myObj = new Student();
    
    System.out.print("Enter First Name: ");
    String FirstName = scan.nextLine();
    System.out.print("Enter Middle Name: ");
    String MiddleName = scan.nextLine();
    System.out.print("Enter Last Name: ");
    String LastName = scan.nextLine();
    System.out.print("Enter Suffix: ");
    String Suffix = scan.nextLine();
    
    myObj.setFirstName(FirstName); // Set the value of the name variable to "John"
    myObj.setMiddleName(MiddleName);
    myObj.setLastName(LastName);
    myObj.setSuffix(Suffix);
    
    System.out.println("Fullname: "+ myObj.getFirstName()+" "+myObj.getMiddleName()+" "+ myObj.getLastName()+" "+ myObj.getSuffix());
}
}