package javaapplication25;
import java.util.Scanner;
public class RemoveDigit {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter String:");
       String str = sc.next();
       String newstr ="";
       char c;
       for(int i=0;i<str.length();i++){
           c =str.charAt(i);
           if(!Character.isDigit(c)){
               newstr += c;
           }
       }
       System.out.println(newstr);
    }
    
}
