/**
 * EXERCISE: Arithmetic and Precedence
 * CONCEPT: Mastering basic math operators (*, /, %, +, -) and the 
 * importance of parentheses to control the order of execution.
 * **/

public class OperatorsExercise01 {
    public static void main(String[] args) {
        
        // 1. Calculate the average of three exam scores: 80, 92, and 75.
        // The result must be a precise decimal (double).

            double average = (80 + 92 + 75) / 3.0;

        // 2. Modulo & Multiplication: 
        // Calculate the remainder of (10 * 3) divided by 7.

            int resultModulo = (10 * 3) % 7;

        // 3. Precedence Challenge: Using the numbers 10, 5, and 2.
        // Default: multiplication first. Grouped: addition first.

            int resultDefault = 10 + 5 * 2;
            int resultGrouped = (10 + 5) * 2;

        // 4. Unary and Compound Assignment:
        // Start with 10, increment, then multiply by 2.

            int counter = 10;
            counter++;      // Becomes 11
            counter *= 2;   // Becomes 22

        System.out.println("--- Arithmetic Report ---");
        System.out.println("Final Average: " + average);
        System.out.println("Modulo Result: " + resultModulo);
        System.out.println("Result (Default): " + resultDefault);
        System.out.println("Result (Grouped): " + resultGrouped);
        System.out.println("Final Counter: " + counter);
        
        System.out.println("Exercise 01: Arithmetic and precedence practiced.");
    }
}