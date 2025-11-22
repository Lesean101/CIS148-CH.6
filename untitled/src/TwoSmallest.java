import java.util.Scanner;

public class TwoSmallest {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int n = scnr.nextInt(); // number of integers
        int[] numbers = new int[n];

        // Read integers into array
        for (int i = 0; i < n; i++) {
            numbers[i] = scnr.nextInt();
        }

        // Initialize smallest and second smallest
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest) {
                secondSmallest = num;
            }
        }

        // Output in ascending order
        System.out.println(smallest + " " + secondSmallest);
    }
}
