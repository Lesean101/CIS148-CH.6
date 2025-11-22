import java.util.Scanner;

public class MiddleItem {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int[] numbers = new int[20]; // fewer than 20 allowed
        int count = 0;

        // Read integers until a negative is encountered
        while (true) {
            int value = scnr.nextInt();
            if (value < 0) {
                break;
            }
            numbers[count] = value;
            count++;

            // Check maximum input limit
            if (count > 9) {
                System.out.println("Too many inputs");
                return;
            }
        }

        // Find and output the middle item
        int middleIndex = count / 2; // works since count is always odd
        System.out.println(numbers[middleIndex]);
    }
}

