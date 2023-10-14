package javaapplication25;
import java.util.Scanner;
public class Encoding {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter String: ");
        String str =sc.next();
        String newstr ="";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='y'||c=='z'){
                c-=26;
            }
            c+=2;
            newstr+=c;
        }
        System.out.println(newstr);
    }
    
}
