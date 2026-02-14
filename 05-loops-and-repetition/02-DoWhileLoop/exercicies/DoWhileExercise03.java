/**
 * EXERCISE: Advanced Do-While Integration & Flow Control
 * CONCEPT: Utilizing 'continue' to skip iterations, implementing 
 * multi-state data validation, and reinforcing mandatory syntax rules.
 **/

public class DoWhileExercise03 {
    public static void main(String[] args) {

        // 1. Selective Processing with 'continue':
        // In some systems, specific IDs or codes must be ignored during a batch run.
        // IMPLEMENTATION: Iterate a 'processingId' from 1 to 6. If the ID is 3, 
        // use 'continue' to skip its processing and jump straight to the condition check.

            int processingId = 0;
            int totalProcessed = 0;

            do {
                processingId++;
                
                if (processingId == 3) {
                    continue; // Skips the rest of the block for ID 3
                }
                
                totalProcessed++;
            } while (processingId < 6);


        // 2. Multi-State Connection Retry:
        // Simulating a network handshake that requires at least one attempt.
        // IMPLEMENTATION: The loop must run while 'isConnected' is false AND 
        // 'attempts' are below 3. On the 2nd attempt, change 'isConnected' to true.

            boolean isConnected = false;
            int attempts = 0;

            do {
                attempts++;
                
                if (attempts == 2) {
                    isConnected = true; // Connection established on retry
                }
            } while (!isConnected && attempts < 3);


        // 3. Mathematical Accumulation & Syntax Rule:
        // Demonstrating a calculation while observing the mandatory semicolon.
        // IMPLEMENTATION: Multiply a 'factor' by 2 repeatedly until it exceeds 50.
        // Note: The semicolon after 'while(condition);' is critical in Java.

            int factor = 5;
            int iterations = 0;

            do {
                factor *= 2;
                iterations++;
            } while (factor <= 50); // <-- CRITICAL: Mandatory semicolon


        System.out.println("--- Advanced Do-While Integration Report ---");
        System.out.println("Total IDs Processed (skipped ID 3): " + totalProcessed);
        System.out.println("Connection Status: " + (isConnected ? "Online" : "Offline") + " after " + attempts + " tries.");
        System.out.println("Final Factor Value: " + factor + " | Total Iterations: " + iterations);

        System.out.println("Exercise 03: 'continue' usage and multi-state validation practiced.");
    }
}