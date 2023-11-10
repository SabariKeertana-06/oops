package javaapplication39;
import java.util.ArrayList;
import java.util.Scanner;

public class NewMain2{

    private static ArrayList<String> stringList = new ArrayList<>();
    private static void append(String str) {
        stringList.add(str);
        System.out.println("Appended successfully.");
    }

    private static void insert(int index, String str) {
        if (index < 0 || index > stringList.size()) {
            System.out.println("Invalid index. Insertion failed.");
        } else {
            stringList.add(index, str);
            System.out.println("Inserted successfully.");
        }
    }

    private static void search(String str) {
        int index = stringList.indexOf(str);
        if (index != -1) {
            System.out.println("String found at index: " + index);
        } else {
            System.out.println("String not found.");
        }
    }

    private static void listStringsStartingWith(char letter) {
        System.out.println("Strings starting with '" + letter + "':");
        for (String str : stringList) {
            if (str.startsWith(String.valueOf(letter))) {
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to append: ");
        String appendString = scanner.nextLine();
        append(appendString);

        System.out.print("Enter index to insert: ");
        int insertIndex = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter a string to insert: ");
        String insertString = scanner.nextLine();
        insert(insertIndex, insertString);

        System.out.print("Enter a string to search: ");
        String searchString = scanner.nextLine();
        search(searchString);

        System.out.print("Enter a letter to list strings starting with: ");
        char startLetter = scanner.next().charAt(0);
        listStringsStartingWith(startLetter);

    }
}
