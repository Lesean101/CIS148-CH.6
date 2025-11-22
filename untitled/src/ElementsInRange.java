public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Read number of integers
    int numInts = sc.nextInt();

    // Read integers into an array
    int[] numbers = new int[numInts];
    for (int i = 0; i < numInts; i++) {
        numbers[i] = sc.nextInt();
    }

    // Read lower and upper bounds
    int lowerBound = sc.nextInt();
    int upperBound = sc.nextInt();

    // Output integers within the range
    for (int i = 0; i < numInts; i++) {
        if (numbers[i] >= lowerBound && numbers[i] <= upperBound) {
            System.out.print(numbers[i] + " ");
        }
    }
    System.out.println(); // End with newline
}

