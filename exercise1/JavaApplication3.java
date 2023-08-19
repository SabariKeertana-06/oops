package javaapplication3;
import java.util.*;
public class JavaApplication3 {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
      int a,b,y,m,d;
      System.out.println("Enter no of days:");
      a=in.nextInt();
      m=a/30;
      d=a%30;
      System.out.println(m+" Months and "+d+" Days");
     
    }
    
}
