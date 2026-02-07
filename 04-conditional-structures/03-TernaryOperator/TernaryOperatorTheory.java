/**
 * TOPIC: Conditional Structures: Ternary Operator (Complete & Didactic Guide)
 * * CONCEPT: 
 * - Syntax: The only operator with 3 operands (Condition ? True : False).
 * - Concise Logic: Reducing multiple lines of if-else into a single line.
 * - Expressions vs Statements: Understanding that ternary *must* return a value.
 * - Clean Code: Balancing brevity with readability (When to avoid).
 * * LICENSE: CC BY-NC-SA 4.0
 * AUTHOR: Luiz Felipe Goes
 */

public class TernaryOperatorTheory {
    public static void main(String[] args) {

        // --- 1. THE BASIC SYNTAX ---
        // Structure: (boolean_condition) ? value_if_true : value_if_false;
        // It serves as a shorthand for specific if-else scenarios (assignment).
        int stock = 5;
        
        // "If stock is greater than 0, return 'In Stock', else return 'Sold Out'"
        String status = (stock > 0) ? "In Stock" : "Sold Out";


        // --- 2. REPLACING STANDARD IF-ELSE ---
        // Scenario: Finding the maximum of two numbers.
        int numA = 50;
        int numB = 120;
        int max;

        // Verbose Way (Standard If-Else):
        if (numA > numB) {
            max = numA;
        } else {
            max = numB;
        }

        // Concise Way (Ternary Operator):
        // Much cleaner for simple value assignments.
        int maxTernary = (numA > numB) ? numA : numB;


        // --- 3. TYPE COMPATIBILITY (CRITICAL) ---
        // The return values (True path / False path) MUST be compatible 
        // with the variable receiving the data.
        double salary = 3000.00;
        boolean hasBonus = true;

        // Even though 500 is int, it is auto-promoted to double to match variable type.
        double finalSalary = hasBonus ? (salary + 500) : salary; 
        
        // ERROR EXAMPLE:
        // int result = (true) ? "Text" : 10; // Compile Error: String cannot be int.


        // --- 4. NESTED TERNARY (CHAINING) ---
        // You can put a ternary inside another, acting like an "else-if".
        // WARNING: Use with caution. Too much nesting hurts readability.
        int score = 82;

        String grade = (score >= 90) ? "A" :          // 1st Check
                       (score >= 80) ? "B" :          // 2nd Check (Else If)
                       (score >= 70) ? "C" : "F";     // 3rd Check + Default

        
        // --- 5. COMMON USE CASE: INLINE PRINTING ---
        // Very useful to avoid creating temporary variables for simple logs.
        int age = 17;
        
        System.out.print("User Access: ");
        System.out.println((age >= 18) ? "Granted" : "Denied");


        // --- 6. COMMON PITFALL: SIDE EFFECTS ---
        // The Ternary operator is designed to RETURN values, not to execute void actions.
        boolean isActive = true;

        // WRONG / INVALID JAVA CODE:
        // (isActive) ? System.out.println("Yes") : System.out.println("No");
        
        // REASON: System.out.println is void (returns nothing), so it cannot 
        // be part of a ternary expression which expects a result.


        // --- OUTPUTS ---
        System.out.println("Product Status: " + status);
        System.out.println("Max Value Found: " + maxTernary);
        System.out.println("Final Salary: " + finalSalary);
        System.out.println("Student Grade: " + grade);

        System.out.println("\nTernary Operator Theory documented successfully!");
    }
}