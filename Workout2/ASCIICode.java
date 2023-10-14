package javaapplication25;
import java.util.Scanner;
public class ASCIICode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
       String str =sc.next();
       String newstr ="";
       char c;
       int count =0;
       for(int i=0;i<str.length();i++){
           c= str.charAt(i);
           System.out.println((int)c);
       }
    }
    
}
