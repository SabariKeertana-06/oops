package javaapplication25;
 import java.util.Scanner;
public class WordFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        System.out.print("Enter the word to find: ");
        String wordToFind = sc.next();
        if (inputString.contains(wordToFind)) {
            System.out.println("The word '" + wordToFind + "' was found in the string.");
        } else {
            System.out.println("The word '" + wordToFind + "' was not found in the string.");
        }
    }
}

