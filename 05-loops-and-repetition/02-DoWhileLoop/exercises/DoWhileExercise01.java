/**
 * EXERCISE: Do-While Loop Fundamentals
 * CONCEPT: Understanding the post-test behavior, the guaranteed
 * execution (running at least once), and basic iteration syntax.
 * **/

public class DoWhileExercise01 {
    public static void main(String[] args) {

        // 1. Basic Iteration Structure:
        // Use a do-while loop to increment a 'counter' from 1 to 5.
        
        
            int counter = 1;
            
            do {
              
                counter++; 
            } while (counter <= 5);


        // 2. The "At Least Once" Guarantee:
        // Initialize 'value' to 100. Set the condition to run only if 'value' is < 50.
        // Since the check happens at the end, the block executes once regardless.
        
            int value = 100;
            boolean executedOnce = false;

            do {
                executedOnce = true;
                
            } while (value < 50); 


        // 3. Simple Accumulation:
        // Calculate the sum of numbers starting from 1.
        // Keep adding as long as the 'totalSum' is less than 20.
        
            int number = 1;
            int totalSum = 0;

            do {
                totalSum += number;
                number++;
            } while (totalSum < 20);


        System.out.println("--- Do-While Fundamentals Report ---");
        System.out.println("Final Counter Value: " + counter + " (Should be 6)");
        System.out.println("Loop executed despite false condition: " + executedOnce);
        System.out.println("Accumulated Sum: " + totalSum + " (Stops when >= 20)");

        System.out.println("Exercise 01: Do-While syntax and execution flow practiced.");
    }
}