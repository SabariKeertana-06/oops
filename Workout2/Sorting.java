package javaapplication25;
import java.util.Scanner;
public class Sorting {
    public static void main(String[] args) {
       String temp =" ";
       Scanner obj =new Scanner (System.in);
       System.out.println("Enter no of String: ");
       int n =obj.nextInt();
       String name[]=new String[n];
       for(int i=0;i<n;i++){
           name[i]= obj.next();
       }
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               if(name[i].compareTo(name[j])>0){
                   temp = name[i];
                   name[j] =name[j];
                   name[j]=temp;
               }
           }
       }
       for(String str: name){
           System.out.println(str);
       }
    }
    
}
