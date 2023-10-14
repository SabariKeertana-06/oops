package javaapplication25;
import java.util.Scanner;
public class Piglatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.next();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='a' || c=='e'|| c=='i' || c=='o' || c=='u'){
                if(i==0){
                    System.out.println(str+"way");
                }
                else{
                    str=str.substring(i)+str.substring(0,i)+"ay";
                    break;
                }
            }
        }
    }
    
}
