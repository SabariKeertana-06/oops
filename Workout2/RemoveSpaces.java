package javaapplication25;
import java.util.Scanner;
public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String inputString = scanner.nextLine();
        String stringWithoutSpaces = inputString.replaceAll("\\s", "");
        System.out.println("String after removing spaces: " + stringWithoutSpaces);

    }
    
}
