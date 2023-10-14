package javaapplication25;
public class PatternOccurence {
    public static void main(String[] args) {
       int count =0;
       String s ="abc test java test abc test123";
       String str = "test";
       int i= s.indexOf(str);
       while(i>=0){
           i= s.indexOf(str,i+1);
           count++;
       }
       System.out.println(count);
    } 
}
