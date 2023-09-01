package javaapplication14;
import java.util.*;
class employee{
    int empid,salary;
    String Fname,Lname;
    employee(int id, String fn, String ln, int sal){
        empid =id;
        Fname = fn;
        Lname= ln;
        salary = sal;
      }
    int getID(){
        return empid;
    }
    String getFirstName(){
        return Fname;
    }
    String getLastName(){
        return Lname;
    }
    String getName(){
        return Fname+" "+Lname;
    }
    int getSalary(){
        return salary;
    }
    void setSalary(int sal){
        salary = sal;
    }
    int getAnnualSalary(){
        return salary = salary*12;
    }
    int raiseSalary(int percent){
        return salary = (salary *(1+percent/100));
    }
    public String toString(){
        return "EMPID : "+empid+" NAME : "+Fname+" "+Lname+" SALARY :  "+salary;
    }
}
public class JavaApplication14 {
    public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter the no of Employees : ");
      int n= obj.nextInt();
      employee[] emp = new employee[n];
      int empid, salary;
      String Fname,Lname;
      for(int i=0;i<n;i++){
          System.out.println("Enter the Employee  ID : ");
          empid= obj.nextInt();
          System.out.println("Enter the Firstname: ");
          Fname = obj.next();
          System.out.println("Enter the Lastname: ");
          Lname= obj.next();
          System.out.println("Enter the Salary : ");
          salary = obj.nextInt();
          emp[i] = new employee(empid,Fname,Lname,salary);
      } 
      System.out.println("Enter S to Set salary, R to Raise salary, E to Display  Employee details :");
      String choice = obj.next();
      switch (choice){
          case "S":
              System.out.println("Enter EmpId: ");
              int id =obj.nextInt();
              System.out.println("Enter the amount to Set Salary : ");
              int setsal = obj.nextInt();
              for(int i=0;i<emp.length;i++){
                  if(id == emp[i].empid){
                      emp[i].setSalary(setsal);
                      System.out.println("Updated Salary : "+emp[i].getSalary());
                  }
              }
              break;
          case "R":
              System.out.println("Enter Empld: ");
              id=obj.nextInt();
              System.out.println("Enter Percentage to be raised: ");
              int percent =obj.nextInt();
              for(int i=0;i<emp.length;i++){
                  if(id == emp[i].empid){
                      int rs = emp[i].raiseSalary(percent);
                      System.out.println("Raised Salary : "+rs);
                  }
              }
              break;
          case "E":
              for(int i=0;i<n;i++){
                  System.out.println(emp[i]);
              }
             break;
          default:
              System.out.println("Invalid choice");
              break;
      }
          
      }
    }
    
