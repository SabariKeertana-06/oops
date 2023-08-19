package javaapplication1;
import java.util.*;
public class JavaApplication1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values of a and b:");
        int a,b,c,d;
        a = sc.nextInt();
        b =sc.nextInt();
        c = a+b;
        d = a*b;
        System.out.println("Sum:"+c);
        System.out.println("Product:"+d);
    }
    
}
