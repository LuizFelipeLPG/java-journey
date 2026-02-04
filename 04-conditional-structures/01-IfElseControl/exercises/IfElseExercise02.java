/**
 * EXERCISE: Advanced Conditional Logic (Else-If & Operators)
 * CONCEPT: Handling multiple mutually exclusive conditions (Ladder)
 * and combining boolean logic using AND (&&) / OR (||).
 * **/

public class IfElseExercise02 {
    public static void main(String[] args) {

        // 1. Else-If Ladder (Categorization):
        // You have a variable 'shoppingCartValue'.
        // IMPLEMENTATION: Categorize the shipping cost based on value:
        // - Above 100.00: Free Shipping.
        // - Between 50.00 and 99.99: Standard Shipping (10.00).
        // - Below 50.00: Express Shipping (20.00).
        // Initialize 'shippingCost' with the correct value.




        // 2. Logical AND (Strict Validation):
        // A bank loan system requires TWO conditions to be met simultaneously.
        // IMPLEMENTATION: Check if 'monthlyIncome' is greater than 3000 AND 'hasCleanRecord' is true.
        // If both are true, set 'loanStatus' to "Approved". Otherwise, "Rejected".




        // 3. Logical OR (Flexible Eligibility):
        // A cinema offers a discount ticket if a person is a Student OR a Senior Citizen.
        // IMPLEMENTATION: Use the OR operator (||) to check if 'isStudent' or 'isSenior' is true.
        // Set boolean 'eligibleForDiscount' to true if either condition is met.




        System.out.println("--- Logic Check Report ---");
        System.out.println("Cart Value:_ | Shipping Cost: ");
        System.out.println("Loan Application: ");
        System.out.println("Discount Eligibility: ");

    }
}