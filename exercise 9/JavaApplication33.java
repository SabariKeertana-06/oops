package javaapplication33;
import java.io.File;

public class  JavaApplication33 {
    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.print("Enter the file name: ");
            String fileName = scanner.nextLine();
            File file = new File(fileName);
            
            if (file.exists()) {
                System.out.println("File exists.");
                
                if (file.canRead()) {
                    System.out.println("File is readable.");
                } else {
                    System.out.println("File is not readable.");
                }
                
                if (file.canWrite()) {
                    System.out.println("File is writable.");
                } else {
                    System.out.println("File is not writable.");
                }
                
                if (file.isFile()) {
                    System.out.println("File is a regular file.");
                } else if (file.isDirectory()) {
                    System.out.println("File is a directory.");
                }
                
                System.out.println("File length in bytes: " + file.length());
            } else {
                System.out.println("File does not exist.");
            }
        }
    }
}