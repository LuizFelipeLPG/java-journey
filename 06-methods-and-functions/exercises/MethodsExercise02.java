/**
 * EXERCISE: Memory Behavior (Pass-by-Value) & Scope
 * CONCEPT: Understanding that Java passes primitive arguments by value (copy),
 * and practicing how to properly update variables using method returns.
 **/

public class MethodsExercise02 {
    public static void main(String[] args) {

        // 1. The Pass-by-Value Illusion:
        // We have a base score. We call a void method to double it.
        // IMPLEMENTATION: Pass 'baseScore' to 'tryToDouble(int score)'.
        // Observe that 'baseScore' remains unchanged after the call in the main method.

            
            System.out.println("--- 1. Pass-by-Value Proof ---");



        // 2. Correctly Updating a Value (Reassignment):
        // To actually update a variable, we must capture the returned value from a method.
        // IMPLEMENTATION: Pass 'baseScore' to 'getDoubledValue(int score)'.
        // Reassign the returned result back to the 'baseScore' variable.



            System.out.println("\n--- 2. Reassignment via Return ---");
            

 
        // 3. Local Variable Scope:
        // Variables declared inside a method only exist inside that method's memory block.
        // IMPLEMENTATION: Call 'applyBonus(int score)' passing 'baseScore'.
        // Capture the result in 'finalScore'. 
        // Note: You cannot access the 'bonusAmount' variable from main, as it belongs to the method.


        
            System.out.println("\n--- 3. Method Scope Execution ---");
            


        System.out.println("\n--- Memory Behavior Report ---");
        System.out.println("Final Processed Score: ");

    }


    // =================================================================
    //  METHOD DEFINITIONS (EXERCISE IMPLEMENTATION)
    // =================================================================

    // 1. Definition for Task 1 (Void - Modifies only the local copy)


    // 2. Definition for Task 2 (Returns the modified copy)


    // 3. Definition for Task 3 (Demonstrating Local Scope)

}