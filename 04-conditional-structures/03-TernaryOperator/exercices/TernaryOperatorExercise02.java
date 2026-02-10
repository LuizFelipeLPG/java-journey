/**
 * EXERCISE: Advanced Ternary Logic (Nested & Operators)
 * CONCEPT: Handling complex decision trees (Chaining) and combining
 * boolean logic (AND/OR) within concise expressions.
 * **/

public class TernaryOperatorExercise02 {
    public static void main(String[] args) {

        // 1. Chained Logic (Categorization):
        // You need to determine the shipping cost based on the 'cartValue'.
        // RULE:
        // - Value 100 or more: Shipping is 0.0 (Free).
        // - Value 50 or more (but less than 100): Shipping is 10.0.
        // - Below 50: Shipping is 20.0.






        // 2. Logical AND (Strict Access Control):
        // Determine if a user can access the 'Settings' page.
        // RULE: Access is strictly allowed only if the user is an Admin AND is currently Active.
        // Assign "Granted" or "Denied" to 'accessStatus'.




        // 3. Logical OR (Default Fallback):
        // You are displaying a username on a profile.
        // RULE: If the 'inputName' is null OR if it is an empty string "",
        // assign "Guest User" to 'displayName'. Otherwise, use the 'inputName'.




        System.out.println("--- Advanced Logic Report ---");
        System.out.println("Shipping Cost: ");
        System.out.println("Settings Access: ");
        System.out.println("User Display: ");

    }
}