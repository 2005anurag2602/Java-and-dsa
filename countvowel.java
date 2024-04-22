import java.util.Scanner;

public class countvowel {

    // Method to count vowels in a given string
    public static void vowelInString(String str) {
        int vowelCount = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels in the string: " + vowelCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        vowelInString(inputString);
    }
}
