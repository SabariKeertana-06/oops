package EXP7;
public class SecFreqChar {
    public static void main(String[] args) {
        String input = "successes";
        char result = findSecondMostFrequentCharacter(input);
        System.out.println("The given string is: " + input);
        System.out.println("The second most frequent char in the string is: " + result);
    }
    public static char findSecondMostFrequentCharacter(String input) {
        char[] characters = input.toCharArray();
        char mostFrequentChar = '\0';
        char secondMostFrequentChar = '\0';
        int[] charCount = new int[256]; // Assuming ASCII characters
        for (char c : characters) {
            charCount[c]++;
        }
        int maxCount = Integer.MIN_VALUE;
        int secondMaxCount = Integer.MIN_VALUE;
        for (char c : characters) {
            if (charCount[c] > maxCount) {
                secondMaxCount = maxCount;
                secondMostFrequentChar = mostFrequentChar;
                maxCount = charCount[c];
                mostFrequentChar = c;
            } else if (charCount[c] > secondMaxCount && charCount[c] < maxCount) {
                secondMaxCount = charCount[c];
                secondMostFrequentChar = c;
            }
        }

        return secondMostFrequentChar;
    }
}
