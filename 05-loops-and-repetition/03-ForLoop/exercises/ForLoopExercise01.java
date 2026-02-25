/**
 * EXERCISE: Basic For Loop Mechanics (Counting & Math)
 * CONCEPT: Mastering fixed-iteration loops, handling loop counters (i),
 * mathematical accumulation, and custom step updates (i+=2, i--).
 * **/

public class ForLoopExercise01 {
    public static void main(String[] args) {

        // 1. Standard Accumulation (Summation):
        // Calculate the sum of all numbers from 1 to a defined 'limit'.
        // IMPLEMENTATION: Iterate from 1 up to 'limit' (inclusive).
        // Add the current value of 'i' to 'totalSum' in each iteration.

            int limit = 100;
            int totalSum = 0;

            for (int i = 1; i <= limit; i++) {
                totalSum += i; 
            }


        // 2. Custom Step Iteration (Odd Numbers):
        // Calculate the sum of ODD numbers only, within a range (1 to 20).
        // IMPLEMENTATION: Start the loop at 1. Instead of i++, use i += 2
        // to jump directly to the next odd number (1, 3, 5...) avoiding 'if' checks.

            int maxRange = 20;
            int oddSum = 0;

            for (int i = 1; i <= maxRange; i += 2) {
                oddSum += i;
            }


        // 3. Reverse Loop (Countdown / Factorial):
        // Calculate the factorial of a small number (e.g., 6! = 6*5*4...).
        // IMPLEMENTATION: Start the loop at 'baseFactorial' and decrement (i--)
        // until 1. Multiply 'factorialResult' by the counter 'i'.

            int baseFactorial = 6;
            long factorialResult = 1; 

            for (int i = baseFactorial; i >= 1; i--) {
                factorialResult *= i;
            }


        System.out.println("--- Loop Mechanics Report ---");
        System.out.println("Sum (1 to " + limit + "): " + totalSum);
        System.out.println("Sum of Odds (1 to " + maxRange + "): " + oddSum);
        System.out.println("Factorial of " + baseFactorial + ": " + factorialResult);

        System.out.println("Exercise 01: Basic iteration and steps practiced.");
    }
}