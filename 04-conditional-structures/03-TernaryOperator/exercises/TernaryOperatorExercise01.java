/**
 * EXERCISE: Ternary Operator (Concise Conditionals)
 * CONCEPT: Refactoring simple if-else logic into single-line expressions.
 * Practice binary decisions for Strings, Integers, and Boolean logic.
 * **/

public class TernaryOperatorExercise01 {
    public static void main(String[] args) {

        // 1. Stock Control (Boolean to String):
        // You have a variable 'itemCount' representing inventory quantity.
        // IMPLEMENTATION: Using the ternary operator, assign a value to 'status':
        // - If items are greater than 0, set status to "Available".
        // - Otherwise, set status to "Out of Stock".
        
            int itemCount = 0;
            String status;

            status = (itemCount > 0) ? "Available" : "Out of Stock";


        // 2. Math Logic (Finding the Minimum):
        // You have two integer variables, 'numA' and 'numB'.
        // IMPLEMENTATION: Assign the smaller value of the two to the 'minValue' variable.
        // Do not use Math.min(), use a ternary condition to check which is smaller.

            int numA = 50;
            int numB = 25;
            int minValue;

            minValue = (numA < numB) ? numA : numB;


        // 3. Access Level (Numeric Threshold):
        // A user needs strictly 18 or more 'points' to be considered a "Pro" user.
        // IMPLEMENTATION: Check the 'points' variable.
        // - If points >= 18, assign "Pro" to 'userTier'.
        // - Otherwise, assign "Standard" to 'userTier'.

            int points = 15;
            String userTier;

            userTier = (points >= 18) ? "Pro" : "Standard";


        System.out.println("--- Ternary Logic Report ---");
        System.out.println("Inventory Status: " + status);
        System.out.println("Smallest Number: " + minValue);
        System.out.println("User Tier: " + userTier);

        System.out.println("Exercise 01: Ternary Operator practiced.");
    }
}