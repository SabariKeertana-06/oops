package javaapplication34;
import java.io.*;

public class  JavaApplication34 {
    public static void main(String[] args) {
        String binaryData = "Hello, Binary Data!";
        try (FileOutputStream fos = new FileOutputStream("binary_file.dat")) {
            byte[] bytes = binaryData.getBytes();
            fos.write(bytes);
        } catch (IOException e) {
        }

        try (FileInputStream fis = new FileInputStream("binary_file.dat")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
        } catch (IOException e) {
        }

        String textData = "Hello, Text Data!";
        try (FileWriter fw = new FileWriter("text_file.txt")) {
            fw.write(textData);
        } catch (IOException e) {
        }

        try (FileReader fr = new FileReader("text_file.txt")) {
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
        } catch (IOException e) {
        }
    }
}