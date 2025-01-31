package Numbers;

public class FibonacciSeries {

    /**
     * This program calculates and prints the first 8 numbers of the Fibonacci series.
     * The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones.
     * It starts with 0 and 1, and the subsequent numbers are calculated by adding the previous two numbers.
     */
    public static void main(String[] args) {
        // Initialize the first two numbers of the series
        int n1 = 0, n2 = 1, sum = 0;

        // Loop to calculate and print the next 8 numbers of the series
        for (int i = 1; i <= 10; i++) {
            sum = n1 + n2; // Calculate the next number by adding the previous two
            System.out.println(sum); // Print the current number
            n1 = n2; // Update the previous two numbers for the next iteration
            n2 = sum;
        }
    }
}

