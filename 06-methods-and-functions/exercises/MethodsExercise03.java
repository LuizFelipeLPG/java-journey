/**
 * EXERCISE: Method Overloading (Compile-Time Polymorphism)
 * CONCEPT: Reusing method names by changing their parameter signatures
 * (number of parameters, types, or order).
 **/

public class MethodsExercise03 {
    public static void main(String[] args) {

        // 1. Overloading by Number of Parameters:
        // We have a system to calculate totals. One method processes standard prices,
        // and the overloaded method processes prices with a discount.
        // IMPLEMENTATION: Call 'calculateTotal' with one argument (price), 
        // then call the overloaded version with two arguments (price and discount amount).

            double basePrice = 100.0;
            double discount = 15.0;

            System.out.println("--- 1. Different Number of Parameters ---");
            double totalStandard = calculateTotal(basePrice);
            double totalDiscounted = calculateTotal(basePrice, discount);

            System.out.println("\n  ->Standard Check: " + totalStandard);
            System.out.println("  ->Discounted Check: " + totalDiscounted);


        // 2. Overloading by Parameter Type:
        // A security system accepts both integer IDs and alphanumeric String IDs.
        // IMPLEMENTATION: Call 'displayID' passing an integer, 
        // then call the overloaded 'displayID' passing a String.

            int numericID = 404;
            String alphaID = "EMP-992";

            System.out.println("\n--- 2. Different Parameter Types ---");
            displayID(numericID);
            displayID(alphaID);


        System.out.println("\nExercise 03: Method overloading practiced safely.");
    }

    // =================================================================
    //  METHOD DEFINITIONS (EXERCISE IMPLEMENTATION)
    // =================================================================

    // 1. Definition for Task 1 (Single Parameter)
    public static double calculateTotal(double price) {
        System.out.println("  -> Processing standard price.");
        return price;
    }

    // 2. Definition for Task 1 (Two Parameters - Overloaded)
    // The signature changes because we added a second parameter.
    public static double calculateTotal(double price, double discount) {
        System.out.println("  -> Processing price with discount applied.");
        return price - discount;
    }

    // 3. Definition for Task 2 (Integer Parameter)
    public static void displayID(int id) {
        System.out.println("  -> Validating Numeric ID: [" + id + "]");
    }

    // 4. Definition for Task 2 (String Parameter - Overloaded)
    // The signature changes because the parameter type is different.
    public static void displayID(String id) {
        System.out.println("  -> Validating Alphanumeric ID: [" + id + "]");
    }
}