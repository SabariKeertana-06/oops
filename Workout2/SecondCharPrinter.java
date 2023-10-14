/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication25;
import java.util.Scanner;
public class SecondCharPrinter {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();
        printSecondChar(inputSentence);
    }
    public static void printSecondChar(String sentence) {
        String[] words = sentence.split(" ");
        System.out.println("Second characters of each word:");
        for (String word : words) {
            if (word.length() >= 2) {
                System.out.print(word.charAt(1) + " ");
            }
        }
    }
}
