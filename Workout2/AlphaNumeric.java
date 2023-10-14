package javaapplication25;
import java.util.Scanner;
public class AlphaNumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.next();
        if(str.matches("[a-z]+")){
            System.out.println("Valid User Name");
        }
        else{
            System.out.println("Invalid User Name");
        }
    }
}
