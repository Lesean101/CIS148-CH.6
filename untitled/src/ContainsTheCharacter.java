import java.util.Scanner;

public class ContainsTheCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read integer for number of words
        int numWords = sc.nextInt();

        // Read words into an array
        String[] words = new String[numWords];
        for (int i = 0; i < numWords; i++) {
            words[i] = sc.next();
        }

        // Read the character to search for
        char searchChar = sc.next().charAt(0);

        // Output words containing the character
        for (int i = 0; i < numWords; i++) {
            if (words[i].indexOf(searchChar) != -1) {
                System.out.println(words[i]);
            }
        }
    }
}
