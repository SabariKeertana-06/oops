package mainpack;
import pack1.*;
import pack2.*;
import pack3.*;
import java.util.*;
public class NewMain {
    public static void main(String[] args) {
       Scanner sc= new  Scanner(System.in);
       System.out.println("Enter a and b:");
       int a =sc.nextInt();
       int b = sc.nextInt();
       System.out.println("Enter Strings to be concatenated:");
       String str1=sc.next();
       String str2=sc.next();
       System.out.println("Enter the string to be reversed:");
       String str=sc.next();
       MathOperations m = new MathOperations(a,b);
       System.out.println("Add:");
       m.add(a, b);
       System.out.println("Subtract:");
       m.subtract(a, b);
      StringOperations s= new StringOperations(str1,str2,str);
      System.out.println("Concatenate:");
      s.concatenate(str1, str2);
      System.out.println("Reverse:");
      s.reverse(str);
      Calculator c = new Calculator(a,b);
      System.out.println("Multiply:");
      c.multiply(a, b);
      System.out.println("Divide:");
      c.divide(a, b);
    }
    
}
