package OutputNumbers;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int numElements = scnr.nextInt();
        int[] numbers = new int[numElements];

        for (int i = 0; i < numElements; i++) {
            numbers[i] = scnr.nextInt();
        }

        for (int i = numElements - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        // Add newline at the end
        System.out.println();
    }
}
