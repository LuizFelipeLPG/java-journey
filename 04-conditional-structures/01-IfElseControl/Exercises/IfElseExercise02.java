package Exercises;
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

            double cartValue = 75.50;
            double shippingCost;

            if (cartValue >= 100.0) {
                shippingCost = 0.0;
            } else if (cartValue >= 50.0) {
                shippingCost = 10.0;
            } else {
                shippingCost = 20.0;
            }


        // 2. Logical AND (Strict Validation):
        // A bank loan system requires TWO conditions to be met simultaneously.
        // IMPLEMENTATION: Check if 'monthlyIncome' is greater than 3000 AND 'hasCleanRecord' is true.
        // If both are true, set 'loanStatus' to "Approved". Otherwise, "Rejected".

            double monthlyIncome = 3500.00;
            boolean hasCleanRecord = true;
            String loanStatus;

            if (monthlyIncome > 3000 && hasCleanRecord) {
                loanStatus = "Approved";
            } else {
                loanStatus = "Rejected";
            }


        // 3. Logical OR (Flexible Eligibility):
        // A cinema offers a discount ticket if a person is a Student OR a Senior Citizen.
        // IMPLEMENTATION: Use the OR operator (||) to check if 'isStudent' or 'isSenior' is true.
        // Set boolean 'eligibleForDiscount' to true if either condition is met.

            boolean isStudent = false;
            boolean isSenior = true;
            boolean eligibleForDiscount;

            if (isStudent || isSenior) {
                eligibleForDiscount = true;
            } else {
                eligibleForDiscount = false;
            }


        System.out.println("--- Logic Check Report ---");
        System.out.println("Cart Value: " + cartValue + " | Shipping Cost: " + shippingCost);
        System.out.println("Loan Application: " + loanStatus);
        System.out.println("Discount Eligibility: " + eligibleForDiscount);

        System.out.println("Exercise 02: Else-If and Logical Operators practiced.");
    }
}