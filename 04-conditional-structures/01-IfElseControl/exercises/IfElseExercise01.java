/**
 * EXERCISE: Basic Control Flow (If & If-Else)
 * CONCEPT: Implementing decision logic based on system states.
 * Practice simple conditional checks and binary (true/false) branching.
 * **/

public class IfElseExercise01 {
    public static void main(String[] args) {

        // 1. Simple If (Threshold Check):
        // You have a variable 'batteryLevel' set to 15.
        // Initialize a 'status' string as "Battery Stable".
        // IMPLEMENTATION: If the battery is below 20, change 'status' to "Low Battery Warning".

            int batteryLevel = 15;
            String status = "Battery Stable";

            if (batteryLevel < 20) {
                status = "Low Battery Warning";
            }

        // 2. Binary Decision (Odd or Even):
        // You have a random integer number.
        // IMPLEMENTATION: Check if the number is Even or Odd using the modulus operator.
        // Store the text "Even" or "Odd" in the 'parity' variable.

            int number = 42;
            String parity;

            if (number % 2 == 0) {
                parity = "Even";
            } else {
                parity = "Odd";
            }

        // 3. Access Control (Boolean Logic):
        // A user is trying to access a restricted area.
        // IMPLEMENTATION: Define a boolean 'isAuthorized'.
        // If authorized, set 'accessMsg' to "Welcome". Otherwise, set it to "Access Denied".
        // Try changing the boolean value to test both paths.

            boolean isAuthorized = false;
            String accessMsg;

            if (isAuthorized) {
                accessMsg = "Welcome";
            } else {
                accessMsg = "Access Denied";
            }

        System.out.println("--- System Check Report ---");
        System.out.println("Battery Status: " + status);
        System.out.println("Number " + number + " is: " + parity);
        System.out.println("Security Gate: " + accessMsg);

        System.out.println("Exercise 01: Basic conditional completed.");
    }
}