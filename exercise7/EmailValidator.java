package EXP7;
import java.util.Scanner;
public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an email address: ");
        String emailAddress = scanner.nextLine();
        if (isValidEmail(emailAddress)) {
            System.out.println("Email address is valid.");
        } else {
            System.out.println("Email address is invalid.");
        }
    }
    public static boolean isValidEmail(String email) {
        int atSymbolCount = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                atSymbolCount++;
            }
        }
        if (atSymbolCount != 1) {
            return false;
        }
        if (email.charAt(0) == '@' || email.charAt(email.length() - 1) == '@') {
            return false;
        }
        int atIndex = email.indexOf('@');
        if (atIndex == 0 || atIndex == email.length() - 1) {
            return false;
        }
        if (!email.substring(atIndex + 1).contains(".")) {
            return false;
        }
        int dotIndex = email.indexOf('.', atIndex + 1);
        if (dotIndex == atIndex + 1 || dotIndex == email.length() - 1) {
            return false;
        }
        String domain = email.substring(atIndex + 1, dotIndex);
        for (char c : domain.toCharArray()) {
            if (!(Character.isLetter(c) || Character.isDigit(c) || c == '-' || c == '_')) {
                return false;
            }
        }

        return true;
    }
}
