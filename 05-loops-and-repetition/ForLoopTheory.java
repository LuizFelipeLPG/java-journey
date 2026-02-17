/**
 * TOPIC: Repetition Structures: For Loop (Complete & Didactic Guide)
 * * CONCEPT: 
 * - Deterministic Loop: Ideal when the number of iterations is known in advance.
 * - Compact Syntax: Initialization, Condition, and Update in a single line.
 * - Variable Scope: Understanding the lifespan of the loop counter.
 * - Enhanced For-Loop: A cleaner way to iterate over arrays and collections.
 * - Infinite Loops: The specific syntax for(;;) and risks.
 * * LICENSE: CC BY-NC-SA 4.0
 * AUTHOR: Luiz Felipe Goes
 */

public class ForLoopTheory {
    public static void main(String[] args) {

        // --- 1. THE BASIC FOR STRUCTURE ---
        // Syntax: for (initialization; condition; update) { code_block }
        // All loop control happens in the header, making it safer and cleaner.
        
        System.out.println("--- Basic Counting ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
        // Logic:
        // 1. int i = 1 (Runs once)
        // 2. i <= 5 (Checked before every iteration)
        // 3. Code runs
        // 4. i++ (Runs after code, then jumps back to step 2)


        // --- 2. DIFFERENT STEPS AND DIRECTIONS ---
        // You are not limited to i++ or starting at 0.
        
        System.out.println("\n--- Countdown (Step 2) ---");
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Line break


        // --- 3. VARIABLE SCOPE (CRITICAL CONCEPT) ---
        // Variables declared INSIDE the for(...) header are LOCAL to the loop.
        // They cannot be accessed after the loop closes.

        for (int x = 0; x < 3; x++) {
            // 'x' exists here
        }

        // System.out.println(x); // COMPILE ERROR: x cannot be resolved to a variable.
        // To use the value later, declare the variable BEFORE the loop.


        // --- 4. NESTED LOOPS (LOOP INSIDE LOOP) ---
        // Common for working with matrices or grids.
        // Warning: Watch out for time complexity (Big O notation) - O(n^2).
        
        System.out.println("\n--- Nested Loop (Matrix) ---");
        for (int row = 1; row <= 2; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.println("Row: " + row + " | Col: " + col);
            }
        }


        // --- 5. MULTIPLE CONTROL VARIABLES ---
        // You can initialize and update multiple variables in the same loop header.
        // Rarely used, but good to know for certification/tests.
        
        System.out.println("\n--- Two Variables ---");
        for (int a = 0, b = 10; a < b; a++, b--) {
            System.out.println("A: " + a + " | B: " + b);
        }


        // --- 6. THE ENHANCED FOR-LOOP (FOR-EACH) ---
        // Introduced in Java 5. Optimized for arrays and collections.
        // Syntax: for (Type item : collection) { ... }
        // Constraint: You don't have access to the index (i), only the element.

        int[] numbers = {10, 20, 30, 40};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSum from For-Each: " + sum);


        // --- 7. INFINITE LOOP IN FOR ---
        // If you omit all parts, it defaults to true.
        // Syntax: for (;;) { ... }

        int escapeCounter = 0;
        for (;;) {
            escapeCounter++;
            if (escapeCounter > 3) {
                System.out.println("\nEscaped the infinite loop via break.");
                break;
            }
        }


        // --- 8. USING 'continue' ---
        // Skips the rest of the body and jumps strictly to the UPDATE part (i++).
        
        System.out.println("\n--- Skipping Even Numbers ---");
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                continue; // Skips print for 0, 2, 4
            }
            System.out.println("Odd Number: " + i);
        }


        // --- 9. FOR VS WHILE (SUMMARY) ---
        // for   -> Use when you know HOW MANY times you want to repeat (fixed limit).
        // while -> Use when you repeat UNTIL a condition changes (unknown limit).


        // --- OUTPUTS ---
        System.out.println("\nFor Loop Theory documented successfully!");
    }
}