/**
 * EXERCISE: While Loop Fundamentals
 * CONCEPT: Practicing basic while loop structure,
 * pre-test behavior, counters, and simple accumulators.
 **/

public class WhileLoopExercise01 {
    public static void main(String[] args) {

        // 1. Basic Counter Loop:
        // Display numbers from 1 to 5 using a while loop.

            int counter = 1;

            while (counter <= 5) {
                System.out.println("Counter Value: " + counter);
                counter++;
            }


        // 2. Pre-Test Condition Behavior:
        // This loop validates if a condition is met before execution.
        // If the condition starts as false, no output should appear.

            int validationValue = 10;

            while (validationValue < 5) {
                System.out.println("Validation Passed");
                validationValue++;
            }


        // 3. Simple Accumulator:
        // Calculate the sum of numbers from 1 to 5 using a while loop.

            int number = 1;
            int sum = 0;

            while (number <= 5) {
                sum += number;
                number++;
            }


        // 4. Controlled Increment Scenario:
        // A system increases a level value until it reaches a limit.

            int level = 0;

            while (level < 3) {
                level++;
                System.out.println("Current Level: " + level);
            }


        System.out.println("\n--- While Loop Execution Report ---");
        System.out.println("Final Counter Value: " + counter);
        System.out.println("Final Accumulated Sum: " + sum);
        System.out.println("Final Level Reached: " + level);

        System.out.println("Exercise 01: While loop fundamentals practiced.");
    }
}
