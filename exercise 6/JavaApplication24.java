package javaapplication24;
public class JavaApplication24 {
    public static void main(String[] args) {
     //ArithmeticException Handling
        try{                
            int a=30,b=0;
            int c= a/b;
            System.out.println("Result ="+c);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception: Can't divide by 0");
        }
     //ArrayIndexOutOfBoundException Handling
        try{
            int a[] =new int[5];
            a[6]=9;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index is Out Of Bounds");
        }
     //NumberFormatException Handling
         try{
             int n = Integer.parseInt("Hello");
             System.out.println(n);
         }
         catch(NumberFormatException e){
             System.out.println("Number Format Exception");
         }
     //StringIndexOutOfBoundException Handling
        try{
            String a ="Hello World";
            char c = a.charAt(20);
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("String Index Out Of Bounds Exception");
        }
    }
    
}
