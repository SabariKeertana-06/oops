package javaapplication8;
public class NewMain {
    public static void main(String[] args) {
        // TODO code application logic here
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        if (a>b)
        {
            System.out.println("b is Minimum");
        }
        else
        {
            System.out.println("a is minimum");
        }
    }
   
}