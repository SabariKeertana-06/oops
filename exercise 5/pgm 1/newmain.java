package main;
import Year_I.*;
import Year_II.*;
import java.util.Scanner;
class student{
    int rollno;
    String name;
    Year1marks year1marks;
    Year2marks year2marks;
    public student(int rollno, String name, Year1marks year1marks, Year2marks year2marks) {
        this.rollno = rollno;
        this.name = name;
        this.year1marks = year1marks;
        this.year2marks = year2marks;
    }
    int getrollno(){
        return rollno;
    }
    String getname(){
        return name;
    }
    Year1marks getyear1marks(){
        return year1marks;
    }
    Year2marks getyear2marks(){
        return year2marks;
    }
    String calculateGrade(int marks) {
        return (marks >= 50) ? "Pass" : "Fail";
    }
    public void displayResults() {
        System.out.println("Roll Number: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Year I Marks - Subject 1: " + year1marks.getsub1mark() + " (" + calculateGrade(year1marks.getsub1mark()) + ")");
        System.out.println("Year I Marks - Subject 2: " + year1marks.getsub2mark() + " (" + calculateGrade(year1marks.getsub2mark()) + ")");
        System.out.println("Year II Marks - Subject 3: " + year2marks.getsub3mark() + " (" + calculateGrade(year2marks.getsub3mark()) + ")");
        System.out.println("Year II Marks - Subject 4: " + year2marks.getsub4mark() + " (" + calculateGrade(year2marks.getsub4mark()) + ")");
        System.out.println();
    }
}

public class newmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of students:");
        int n = sc.nextInt();
        student[] obj = new student[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter name:");
            String name = sc.next();
            System.out.println("Enter rollno:");
             int rollno = sc.nextInt();
            System.out.println("Enter marks:");
            System.out.println("sub1:");
             int s1m = sc.nextInt();
              System.out.println("sub2");
             int s2m = sc.nextInt();
             System.out.println("sub3:");
              int s3m = sc.nextInt();
              System.out.println("sub4:");
              int s4m = sc.nextInt();
              Year1marks sty1= new Year1marks(s1m, s2m);
              Year2marks sty2 = new Year2marks(s3m, s4m);
              obj[i] = new student(rollno, name, sty1,sty2);
        }
         for(int i=0;i<n;i++){
              obj[i].displayResults();
    }
  }
}
