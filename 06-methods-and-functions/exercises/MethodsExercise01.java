/**
 * EXERCISE: Methods Fundamentals (Creation, Parameters & Returns)
 * CONCEPT: Practicing the creation of basic void methods, passing arguments
 * to parameters, and extracting data using return types.
 **/

public class MethodsExercise01 {
    public static void main(String[] args) {

        // 1. Simple Void Method Call:
        // You need to initialize a system by calling a method that prints a startup message.
        // IMPLEMENTATION: Call the method 'printSystemStartup()' defined below.

            System.out.println("--- 1. System Initialization ---");
            printSystemStartup();


        // 2. Passing Arguments to Parameters:
        // We have user data (name and role) that needs to be formatted and displayed.
        // IMPLEMENTATION: Call the method 'displayUserProfile(String name, String role)'.
        // Pass "Alice" as the name argument and "Admin" as the role argument.

            String userName = "Alice";
            String userRole = "Admin";

            System.out.println("\n--- 2. Profile Display ---");
            displayUserProfile(userName, userRole);


        // 3. Capturing Returned Data:
        // We need to calculate the area of a room to buy materials.
        // IMPLEMENTATION: Call 'calculateArea(double length, double width)' with values 5.0 and 4.0.
        // Capture the returned double value in a variable called 'roomArea'.

            double length = 5.0;
            double width = 4.0;
            
            System.out.println("\n--- 3. Area Calculation ---");
            double roomArea = calculateArea(length, width);


        System.out.println("\n--- Methods Execution Report ---");
        System.out.println("Target User: " + userName);
        System.out.println("Calculated Room Area: " + roomArea + " sqm");

        System.out.println("Exercise 01: Method creation, parameters, and returns practiced.");
    }

    // =================================================================
    //  METHOD DEFINITIONS (EXERCISE IMPLEMENTATION)
    // =================================================================

    // 1. Definition for Task 1 (Void)
    public static void printSystemStartup() {
        System.out.println("Boot sequence initiated... OK");
    }

    // 2. Definition for Task 2 (Parameters)
    public static void displayUserProfile(String name, String role) {
        System.out.println("User: " + name + " | Access Level: " + role);
    }

    // 3. Definition for Task 3 (Return Type)
    public static double calculateArea(double length, double width) {
        return length * width;
    }
}