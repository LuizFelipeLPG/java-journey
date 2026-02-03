/**
 * TOPIC: Conditional Structures: If-Else (Complete & Didactic Guide)
 * * CONCEPT: 
 * - Flow Control: Redirecting program execution based on boolean logic.
 * - If-Else: Handling binary decisions (True path vs False path).
 * - Else-If Ladder: Managing multiple mutually exclusive conditions.
 * - Nested Conditionals: Logic inside logic (and how to manage complexity).
 * - Scope: Understanding variable visibility within code blocks {}.
 * * LICENSE: CC BY-NC-SA 4.0
 * AUTHOR: Luiz Felipe Goes
 */

public class IfElseTheory {
    public static void main(String[] args) {

        // --- 1. THE BASIC IF STATEMENT ---
        // Executes a block of code ONLY if the condition is true.
        boolean isRaining = true;
        
        if (isRaining) {
            System.out.println("Action: Take an umbrella.");
        }
        // If false, the program simply skips this block.


        // --- 2. IF-ELSE (BINARY DECISION) ---
        // Provides an alternative path. If condition is false, 'else' runs.
        int age = 16;
        
        if (age >= 18) {
            System.out.println("Status: Adult (Access Granted)");
        } else {
            System.out.println("Status: Minor (Access Denied)");
        }


        // --- 3. THE ELSE-IF LADDER (MULTIPLE CONDITIONS) ---
        // Checks conditions sequentially top-to-bottom. Stops at the first TRUE.
        int score = 85;
        String rank;

        if (score >= 90) {
            rank = "Diamond";   // Not executed
        } else if (score >= 80) {
            rank = "Platinum";  // Executed! Exits the structure here.
        } else if (score >= 60) {
            rank = "Gold";      // Skipped because previous condition was met.
        } else {
            rank = "Silver";    // Default fallback.
        }


        // --- 4. COMPOUND CONDITIONS (LOGICAL OPERATORS) ---
        // Using && (AND) and || (OR) to validate complex scenarios within one IF.
        boolean hasLicense = true;
        boolean isSober = true;
        boolean hasCar = false;

        // Rule: Must have license AND be sober.
        if (hasLicense && isSober) {
            if (hasCar) {
                System.out.println("Can Drive: Yes, ready to go.");
            } else {
                System.out.println("Can Drive: No, you need a car."); // Nested Logic
            }
        }


        // --- 5. SCOPE AND BRACES (CRITICAL) ---
        // Variables declared inside an 'if' block CANNOT be accessed outside it.
        if (true) {
            int blockVar = 100; // Lives only inside these braces
            System.out.println("Inside block: " + blockVar);
        }
        // System.out.println(blockVar); // ERROR: blockVar cannot be resolved here.

        // Omission of braces (One-liner):
        // Valid for single statements, but dangerous for maintenance.
        boolean dangerMode = true;
        if (dangerMode) 
            System.out.println("Warning: Single line IF used."); 


        // --- 6. COMMON PITFALL: ASSIGNMENT VS COMPARISON ---
        boolean isActive = false;
        
        // Wrong: if (isActive = true) sets variable to true and returns true!
        // Correct: Use '==' for comparison or the boolean variable directly.
        if (isActive == true) { 
            // This block won't run.
        }


        // --- OUTPUTS ---
        System.out.println("Final Rank: " + rank);
        System.out.println("Is Raining logic check: " + isRaining);
        
        System.out.println("\nIf-Else Theory documented successfully!");
    }
}