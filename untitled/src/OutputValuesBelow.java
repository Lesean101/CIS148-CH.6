import java.util.Scanner;

public class OutputValuesBelow {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // First integer is the count of numbers in the list
        int numElements = scnr.nextInt();

        // Create array to hold the integers
        int[] numbers = new int[numElements];

        // Read the list of integers
        for (int i = 0; i < numElements; i++) {
            numbers[i] = scnr.nextInt();
        }

        // Read the threshold value (last input)
        int threshold = scnr.nextInt();

        // Output all integers <= threshold
        for (int i = 0; i < numElements; i++) {
            if (numbers[i] <= threshold) {
                System.out.print(numbers[i] + " ");
            }
        }

        // Add newline at the end for clean output
        System.out.println();
    }
}