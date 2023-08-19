package javaapplication4;
import java.util.*;
public class JavaApplication4 {
    public static void main(String[] args) {
        int marks;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks:");
        marks = in.nextInt();
        String message;
        switch(marks)
        {
            case 10:
                message=" Excellent";
                break;
            case 9:
            case 8:
                message=" Very Good";
                break;
            case 7:
            case 6:
                message=" Good";
                break;
            case 5:
            case 4:
            case 3:
                message=" Poor";
                break;
            case 2:
            case 1:
            case 0:
               message=" Very Poor";
               break;
            default:
                message=" Invalid Marks";
                break;
          }
        System.out.println( message);// TODO code application logic here
    }
    
}
