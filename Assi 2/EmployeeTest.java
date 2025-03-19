import java.util.*;
class Employee{
  String fname;
  String lname;
  float salary;
  float yearlySalary;
  float increment;
  
 Employee(){
  String fname = " ";
  String lname  = " ";
  float salary = 0;
  float yearlySalary = 0;
  float increment = 0;
  }
  
  Scanner scan = new Scanner(System.in);
  
  void getInfo(){
  System.out.println("Enter the first name of Employee:  ");
   fname = scan.nextLine();
   System.out.println("Enter the last name of Employee: ");
   lname = scan.nextLine();
   System.out.println("Enter the salary of Employee: ");
   salary = scan.nextFloat();
   }
   
   void setInfo(){
     System.out.println("The first name of Employee is: "+fname);
     System.out.println("the last name of Employee is: "+lname);
    
     if(salary <= 0){
      System.out.println("The salary of Employee is: "+0);
      }
      yearlySalary = salary * 12;
      System.out.println("Yearly salary of employee is: "+yearlySalary);
      }
      
      void raise(){
      increment =yearlySalary * (10.0f/100);
      float total = yearlySalary + increment;
      System.out.println("The total salary after the increment is: "+total);
       }
  } 
  
class EmployeeTest{
  public static void main(String[] ar){
   Employee e = new Employee();
   Employee e1 = new Employee();
   e.getInfo();
   e.setInfo();
   e.raise();
  
  e1.getInfo();
  e1.setInfo();
  e1.raise();
  
   }
  }
