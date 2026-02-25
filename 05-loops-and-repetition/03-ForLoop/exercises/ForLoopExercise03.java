/**
 * EXERCISE: Advanced Headers & Scope Management
 * CONCEPT: Mastering multiple control variables, understanding local 
 * variable scope limitations, and applying compound loop conditions.
 * **/

public class ForLoopExercise03 {
    public static void main(String[] args) {

        // 1. Multiple Control Variables:
        // As per theory section 5, you can initialize and update two variables simultaneously.
        // IMPLEMENTATION: Initialize 'x' at 0 and 'y' at 10. Run the loop while 'x' 
        // is less than 'y'. Increment 'x' and decrement 'y' in the same step.

            String pairLog = "";
            int iterations = 0;

            for (int x = 0, y = 10; x <= y; x++, y--) {
                pairLog += "(" + x + " | " + y + ") ";
                iterations++;
            }


        // 2. Variable Scope (Lifespan Demonstration):
        // As per theory section 3, variables declared in the header die when the loop ends.
        // IMPLEMENTATION: Declare 'globalSum' outside. Run a loop with a local 'i'.
        // Add 'i' to 'globalSum'. (Note: Trying to print 'i' after would fail).

            int globalSum = 0;
            int limit = 5;

            for (int i = 1; i <= limit; i++) {
                globalSum += i;
                
            }
           
            boolean scopeTestPassed = true;


        // 3. Compound Conditions in Header:
        // Demonstrating that the condition section can use logical operators (&&, ||).
        // IMPLEMENTATION: Run a loop that typically goes from 1 to 100 ('i'),
        // but MUST stop early if 'currentSum' exceeds a safety cap (e.g., 20).
        
            int currentSum = 0;
            int finalIndex = 0;
            int safetyCap = 20;

            for (int i = 1; i <= 100 && currentSum < safetyCap; i++) {
                currentSum += i;
                finalIndex = i;
            }


        System.out.println("--- Advanced Headers & Scope Report ---");
        System.out.println("Converging Pairs: " + pairLog);
        System.out.println("Scope Test: " + (scopeTestPassed ? "PASSED (i did not leak)" : "FAILED"));
        System.out.println("Compound Stop: Sum reached " + currentSum + " at index " + finalIndex);

        System.out.println("Exercise 03: Multiple vars, scope rules, and logic gates practiced.");
    }
}