package javaapplication15;
import java.util.*;
class person
{
    String name,address;
    person(String n,String add)
    {
        name=n;
        address=add;
    }
    String getName()
    {
        return name;
    }
    String address()
    {
        return address;
    }
    void setAddress(String add){
        address = add;
    }
    public String toString()
    {
        return "NAME:"+name+"ADDRESS:"+address;
    }
}
class student extends person
{
    String program;
    int year;
    double fee;
    student(String n, String add,String p,int y,double f) {
        super(n, add);
        name =n;
        address = add;
        program=p;
        year=y;
        fee = f;
    }
    String getprogram()
    {
        return program;
    }
    void setProgram(String p)
    {
        program = p;
    }
    int getYear()
    {
        return year;
    }
    void setYear(int y)
    {
        year=y;
    }
    double getFee()
    {
        return fee;
    }
    void setFee(double f)
    {
        fee=f;
    }
    public String toString()
    {
        return "NAME:"+name+" ADDRESS:"+address+
                " PROGRAM:"+program+" YEAR:"+year+" FEE:"+fee;
    }
}
class staff extends person{
    String school;
    double pay;
    public staff(String n, String add, String scl, double sal) {
        super(n, add);
        name = n;
        address=add;
        school = scl;
        pay = sal;
    }
    String getSchool()
    {
        return school;
    }
    void setSchool(String scl)
    {
        school = scl;
    }
    double getPay()
    {
        return pay;
    }
    void setPay(double sal)
    {
        pay= sal;
    }
     public String toString()
    {
        return "NAME:"+name+" ADDRESS:"+address+
                " SCHOOL:"+school+" PAY:"+pay;
    }
}
public class JavaApplication15 {
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter the no of Persons:");
       int n = obj.nextInt();
       person[] ps = new person[n];
       student[] st = new student[n];
       staff[] s = new staff[n];
       String name = null,address = null,program ;
       int year;
       double fee;
       for(int i=0;i<n;i++)
       {
           System.out.println("Enter the Name:");
           name = obj.next();
           System.out.println("Enter the address:");
           address = obj.next();
           ps[i]= new person(name,address);
           System.out.println("Enter S for Student and T for Staff: ");
           String choice = obj.next();
           switch(choice){
               case "S":
                   System.out.println("Enter program:");
                   program = obj.next();
                   System.out.println("Enter Year:");
                   year = obj.nextInt();
                   System.out.println("Enter Fee:");
                   fee = obj.nextDouble();
                    st[i] = new student(name,address,program,year,fee);
                    System.out.println(st[i]);
                   break;
               case "T":
                   String school;
                   double pay;
                   System.out.println("Enter School:");
                   school = obj.next();
                   System.out.println("Enter Pay:");
                   pay = obj.nextDouble();
                    s[i] = new staff(name,address,school,pay);
                    System.out.println(s[i]);
                    break;
           }
       } 
    }
    }
