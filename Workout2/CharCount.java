package javaapplication25;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.next();
        while(str.length()!=0)
        {
        char c[]= str.toCharArray();
        int count = 0;
        for(int i=0;i<c.length;i++){
            if(c[0]==c[i]){
                count++;
            }
        }
        if(count !=0){
            System.out.println(c[0]+"...."+count);
        }
        str= str.replace(" "+c[0], " ");
        break;
        }
    }   
}
