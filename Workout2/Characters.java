package javaapplication25;
import java.util.Scanner;
public class Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the desired word length: ");
        int desiredLength = sc.nextInt();
        System.out.println("Enter String:");
        while (true) {
            String word = sc.next();
            if (word.isEmpty()) {
                break;
            }
            if (word.length() == desiredLength) {
                System.out.println("Word with " + desiredLength + " characters: " + word);
            }
        }
    }
}
    
