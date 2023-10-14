package javaapplication25;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println("Enter 2 strings:");
        String s1 = sc.next();
        String s2 = sc.next();
        Anagram obj = new Anagram();
        String s3 = obj.sort(s1.toCharArray());
        String s4 = obj.sort(s2.toCharArray());
        if(s3.equals(s4)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not an Anagram");
        }
    }
    String sort(char a[]){
        char temp;
        for(int i=0;i<a.length;i++){
            for(int j =i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i]= a[j];
                    a[j]= temp;
                } 
            }
        }
        String s =String.valueOf(a);
        return s;
    }
}
