/**
 * TOPIC: Repetition Structures: Do-While Loop (Complete & Didactic Guide)
 * * CONCEPT:
 * - Post-Test Loop: Condition is checked AFTER the first execution.
 * - Guaranteed Execution: The block runs at least once, regardless of the condition.
 * - Syntax Nuance: The requirement of a semicolon after the while condition.
 * - Comparison: How it differs fundamentally from the standard 'while' loop.
 * * LICENSE: CC BY-NC-SA 4.0
 * AUTHOR: Luiz Felipe Goes
 */

public class DoWhileLoopTheory {
    public static void main(String[] args) {

        // --- 1. BASIC DO-WHILE STRUCTURE ---
        // The 'do-while' loop executes the code block FIRST, then checks the condition.
        // Syntax:
        // do { code_block } while (boolean_condition);

        int counter = 1;

        do {
            System.out.println("Counter value: " + counter);
            counter++;
        } while (counter <= 5);
        // Note: The loop runs, updates, and then decides if it repeats.


        // --- 2. POST-TEST BEHAVIOR (THE CORE DIFFERENCE) ---
        // Unlike 'while', the condition is evaluated AFTER the iteration.
        // Even if the condition is FALSE from the start, it runs ONCE.
        int number = 10;

        do {
            System.out.println("This WILL be printed once, even though 10 < 5 is false.");
        } while (number < 5);

        


        // --- 3. COMMON USE CASE: USER INPUT VALIDATION ---
        // Ideal for situations where you must ask the user for something at least once.
        int userInput = 0; 
        // Imagine this value comes from a Scanner
        
        do {
            // Simulated: "Please enter a number greater than 0"
            userInput = 5; // User finally entered a valid number
        } while (userInput <= 0);


        // --- 4. INFINITE LOOPS IN DO-WHILE ---
        // Just like 'while', if the exit condition is never met, it traps the program.
        
        int infiniteCounter = 1;
        // do {
        //     System.out.println("Stuck here!");
        //     // infiniteCounter++; // If forgotten, condition (<=5) stays true forever
        // } while (infiniteCounter <= 5);


        // --- 5. INTERACTION WITH 'break' ---
        // 'break' works the same way: it kills the loop immediately.
        int val = 1;

        do {
            if (val == 3) {
                break; 
            }
            val++;
        } while (val < 10);


        // --- 6. INTERACTION WITH 'continue' ---
        // 'continue' skips to the end of the block and goes straight to the condition test.
        int skipCounter = 0;

        do {
            skipCounter++;
            if (skipCounter == 2) {
                continue; // Jumps directly to the 'while' check
            }
            System.out.println("Processing: " + skipCounter);
        } while (skipCounter < 3);


        // --- 7. WHILE VS DO-WHILE (SUMMARY) ---
        // while    -> Check -> Run (0 or more times)
        // do-while -> Run -> Check (1 or more times)
        
        boolean condition = false;

        // While: checks first, sees false, does nothing.
        while (condition) { 
            System.out.println("While won't run.");
        }

        // Do-While: runs first, then sees false and stops.
        do {
            System.out.println("Do-While runs once.");
        } while (condition);


        // --- 8. MANDATORY SEMICOLON ---
        // A very common syntax error in Java is forgetting the ';' after 'while(cond)'.
        int x = 0;
        do {
            x++;
        } while (x < 1); // <-- CRITICAL: Semicolon is mandatory here!


        // --- OUTPUTS ---
        System.out.println("\nDo-While Loop Theory documented successfully!");
    }
}