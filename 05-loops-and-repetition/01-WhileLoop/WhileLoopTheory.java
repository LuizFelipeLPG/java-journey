/**
 * TOPIC: Repetition Structures: While Loop (Complete & Didactic Guide)
 * * CONCEPT:
 * - Loop Control: Repeating a block of code while a condition remains true.
 * - Pre-Test Loop: Condition is checked BEFORE each iteration.
 * - Iteration Variables: Counters, accumulators, and state control.
 * - Infinite Loops: How they happen and how to avoid them.
 * - Loop Control Keywords: break and continue.
 * * LICENSE: CC BY-NC-SA 4.0
 * AUTHOR: Luiz Felipe Goes
 */

public class WhileLoopTheory {
    public static void main(String[] args) {

        // --- 1. BASIC WHILE STRUCTURE ---
        // The 'while' loop executes a block of code AS LONG AS the condition is true.
        // Syntax:
        // while (boolean_condition) { code_block }
        
        int counter = 1;

        while (counter <= 5) {
            System.out.println("Counter value: " + counter);
            counter++; // CRITICAL: updating the condition variable
        }
        // When counter becomes 6, condition is false and the loop stops.


        // --- 2. PRE-TEST BEHAVIOR (IMPORTANT CONCEPT) ---
        // The condition is evaluated BEFORE the first iteration.
        // If the condition is false initially, the loop body NEVER runs.
        int number = 10;

        while (number < 5) {
            // This code will NEVER execute
            System.out.println("This will not be printed.");
        }


        // --- 3. COMMON USE CASE: ACCUMULATORS ---
        // While loops are ideal when the number of iterations is not fixed.
        int value = 1;
        int sum = 0;

        while (value <= 5) {
            sum += value; // Accumulates total
            value++;
        }

        // sum = 1 + 2 + 3 + 4 + 5 = 15


        // --- 4. INFINITE LOOPS (DANGER ZONE) ---
        // An infinite loop happens when the condition NEVER becomes false.
        // This usually occurs when the control variable is not updated.

        int infiniteCounter = 1;

        // while (infiniteCounter <= 5) {
        //     System.out.println("Infinite loop!");
        //     // infiniteCounter++;  // Missing update → loop never ends
        // }

        // Infinite loops can freeze programs or consume system resources.


        // --- 5. USING 'break' TO EXIT A WHILE LOOP ---
        // 'break' immediately terminates the loop, regardless of the condition.
        int searchNumber = 1;

        while (true) { // Intentional infinite loop
            if (searchNumber == 3) {
                System.out.println("Target found. Exiting loop.");
                break; // Forced exit
            }
            searchNumber++;
        }


        // --- 6. USING 'continue' TO SKIP ITERATIONS ---
        // 'continue' skips the current iteration and jumps to the next cycle.
        int skipCounter = 0;

        while (skipCounter < 5) {
            skipCounter++;

            if (skipCounter == 3) {
                continue; // Skips printing when value is 3
            }

            System.out.println("Current value: " + skipCounter);
        }


        // --- 7. WHILE VS FOR (WHEN TO USE) ---
        // while → Best when the number of iterations is UNKNOWN.
        // for   → Best when the number of iterations is FIXED.
        boolean isConnected = true;
        int attempts = 0;

        while (isConnected) {
            attempts++;

            if (attempts == 3) {
                isConnected = false; // Condition changes dynamically
            }
        }


        // --- 8. COMMON PITFALL: SEMICOLON AFTER WHILE ---
        int x = 0;

        // while (x < 5); {  // <- WRONG: semicolon ends the loop
        //     System.out.println("This runs once, not in a loop.");
        // }


        // --- OUTPUTS ---
        System.out.println("Sum Result: " + sum);
        System.out.println("Connection Attempts: " + attempts);

        System.out.println("\nWhile Loop Theory documented successfully!");
    }
}
