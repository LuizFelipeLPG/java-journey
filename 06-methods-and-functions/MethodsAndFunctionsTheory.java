/**
 * TOPIC: Methods and Functions (Deep Dive & Architecture)
 * * CONCEPT: 
 * - Terminology: Why Java uses "Methods" instead of "Functions".
 * - Anatomy: Modifiers, Return Type, Naming, and Signature.
 * - Data Flow: The strict distinction between Parameters and Arguments.
 * - Pass-by-Value: How Java handles memory when passing variables (The Copy Rule).
 * - Return Statement: Exiting the method and transporting data back.
 * - Overloading: Compile-time polymorphism basics.
 * * LICENSE: CC BY-NC-SA 4.0
 * AUTHOR: Luiz Felipe Goes
 */

public class MethodsAndFunctionsTheory {

    // --- MAIN METHOD (ENTRY POINT) ---
    public static void main(String[] args) {

        // --- 1. CONCEPTS: FUNCTION VS METHOD ---
        // In programming, a "Function" is a block of code that performs a task.
        // In Java, functions are ALWAYS defined inside a class.
        // Therefore, we call them "Methods" (They represent the behavior of the class).
        
        System.out.println("--- 1. Simple Execution ---");
        printWelcomeMessage(); // Invoking (calling) the method.


        // --- 2. THE ANATOMY OF PASSING DATA ---
        // Crucial Distinction for Interviews:
        // * PARAMETER: The variable defined in the method declaration (e.g., String name).
        // * ARGUMENT: The actual value passed during the call (e.g., "Luiz").
        
        String inputName = "Luiz"; // Variable in main
        
        System.out.println("\n--- 2. Parameters vs Arguments ---");
        // Here, 'inputName' is the ARGUMENT being passed to the method.
        calculateAge(inputName, 2000); 


        // --- 3. RETURN TYPES & DATA EXTRACTION ---
        // 'void' methods do action but return nothing.
        // Typed methods (int, String, boolean) MUST return data.
        // The 'return' keyword immediately stops the method.

        System.out.println("\n--- 3. Receiving Data ---");
        double price = 50.0;
        double tax = calculateTax(price); // We capture the result in a variable
        
        System.out.println("Base Price: " + price);
        System.out.println("Tax Calculated: " + tax);
        System.out.println("Total: " + (price + tax));


        // --- 4. MEMORY BEHAVIOR: PASS-BY-VALUE (CRITICAL) ---
        // Question: If I change a parameter inside a method, does the original variable change?
        // Answer: NO. Java is strictly "Pass-by-Value".
        // Explain: Java creates a COPY of the variable. The method works on the COPY.
        
        int number = 100; // Original variable inside main
        
        System.out.println("\n--- 4. Pass-by-Value Proof ---");
        System.out.println("Before method call: " + number);
        
        tryToChangeValue(number); // Passing the value 100 (Copy)
        
        System.out.println("After method call: " + number); 
        // Result is still 100. The change happened only in the method's scope.


        // --- 5. METHOD OVERLOADING ---
        // You can reuse method names if the Parameter Signature is different.
        // Signature = Method Name + Parameter Types/Order.
        
        System.out.println("\n--- 5. Overloading ---");
        formatData("Text Only");
        formatData("Text with Number", 10);
        // The compiler decides which method to call based on the arguments provided.

        System.out.println("\nMethods Theory documented successfully!");
    }


    // =================================================================
    //  METHOD DEFINITIONS (LOGIC LAYER)
    // =================================================================

    // [1] Simple Void Method
    // public: Access modifier (visible everywhere)
    // static: Belongs to the class, not an object instance
    // void: Returns nothing
    public static void printWelcomeMessage() {
        System.out.println("System initialized correctly.");
    }


    // [2] Parameters (The inputs)
    // 'name' and 'birthYear' are Local Variables to this method.
    public static void calculateAge(String name, int birthYear) {
        int currentYear = 2024; // Local variable
        int age = currentYear - birthYear;
        System.out.println("User: " + name + " | Estimated Age: " + age);
    }


    // [3] Return Type (The output)
    public static double calculateTax(double value) {
        if (value < 0) {
            return 0.0; // Guard clause: returns early if invalid
        }
        return value * 0.15; // Returns the calculated double
    }


    // [4] Pass-by-Value Demonstration
    public static void tryToChangeValue(int number) {
        number = 9999; // Only changes the LOCAL copy of 'number'
        System.out.println("  -> Inside method: Value changed to " + number);
    }


    // [5] Overloading Examples
    public static void formatData(String text) {
        System.out.println("Format A: [" + text + "]");
    }

    public static void formatData(String text, int number) {
        System.out.println("Format B: [" + text + " : " + number + "]");
    }
}