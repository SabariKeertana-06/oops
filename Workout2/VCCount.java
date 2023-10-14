package javaapplication25;
import java.util.Scanner;
public class VCCount {
    public static void main(String[] args) {
        int vowel =0,consonant =0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter String:");
        String s= obj.next();
        char c[] = s.toCharArray();
        for(char temp:c){
            if(temp>='a'&&temp<='z'){
                if(temp=='a' || temp=='e' || temp=='i' || temp=='o' || temp=='u'){
                    vowel++;
                }
                else{
                    consonant++;   
                }
            }
        }
        System.out.println("Vowel count: "+vowel);
        System.out.println("Consonant Count :"+consonant);
    }
    
}
