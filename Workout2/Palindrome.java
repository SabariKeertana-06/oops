package javaapplication25;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = obj.next();
        char c[] = s.toCharArray();
        String newstr = "";
        for (int i = c.length - 1; i >= 0; i--) {
            newstr += c[i];
        }
        System.out.println(newstr);
        if(s.equals(newstr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
    
}
