package javaapplication25;
import java.util.Scanner;
public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Strings:");
       String s1 = sc.next();
       String s2 = sc.next();
       System.out.println("Before Swapping:");
       System.out.println("String 1: "+s1);
       System.out.println("String 2: "+s2);
       s1=s1+s2;
       s2=s1.substring(0,s1.length()-s2.length());
       s1 = s1.substring(s2.length());
       System.out.println("After Swapping:");
       System.out.println("String 1: "+s1);
       System.out.println("String 2: "+s2);
    }
    
}
