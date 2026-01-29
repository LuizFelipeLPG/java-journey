/**
 * TOPIC: Operators and Type Casting (Complete & Didactic Guide)
 * * CONCEPT: 
 * - Arithmetic: Math operations, modulus, and increment/decrement logic.
 * - Relational/Logical: Comparisons and efficient boolean evaluation.
 * - Casting: Converting types, handling overflow, and numeric promotion.
 * - Precedence: The rules that define the order of execution.
 * * LICENSE: CC BY-NC-SA 4.0
 * AUTHOR: Luiz Felipe Goes
 */

public class OperatorsAndCastingTheory {
    public static void main(String[] args) {

        // --- 1. ARITHMETIC OPERATORS ---
        int a = 10;
        int b = 3;

        int sum = a + b;            // Addition: 13
        int subtraction = a - b;    // Subtraction: 7
        int product = a * b;        // Multiplication: 30
        int quotient = a / b;       // Division (Integer): 3 (Truncates decimals)
        int remainder = a % b;      // Modulus: 1 (Remainder of 10/3)

        // --- 2. ASSIGNMENT OPERATORS ---
        int value = 10;
        value += 5;  // Addition assignment: value = value + 5 (15)
        value -= 2;  // Subtraction assignment: value = value - 2 (13)
        value *= 2;  // Multiplication assignment: value = value * 2 (26)
        value /= 2;  // Division assignment: value = value / 2 (13)
        value %= 3;  // Modulus assignment: value = value % 3 (1)


        // --- 3. UNARY OPERATORS (INCREMENT/DECREMENT) ---
        int x = 5;
        // Post-increment: uses current value, then increments.
        int post = x++; // post = 5, x = 6
        
        int y = 5;
        // Pre-increment: increments first, then uses the value.
        int pre = ++y;  // y = 6, pre = 6


        // --- 4. RELATIONAL OPERATORS ---
        // Used to compare values, always returns a boolean.
        boolean isEq = (a == b);  // Equal to: false
        boolean isNot = (a != b);  // Not equal: true
        boolean isGt  = (a > b);   // Greater than: true
        boolean isLt  = (a < b);   // Less than: false
        boolean isGe  = (a >= 10); // Greater or equal: true


        // --- 5. LOGICAL OPERATORS & SHORT-CIRCUIT ---
        boolean conditionA = true;
        boolean conditionB = false;

        // Logical AND (&&): True if BOTH are true.
        // Short-circuit: If conditionA is false, it won't check conditionB.
        boolean andResult = conditionA && (5 > 2); // true

        // Logical OR (||): True if AT LEAST ONE is true.
        // Short-circuit: If conditionA is true, it won't check the second part.
        boolean orResult = conditionB || (10 < 5); // false

        // Logical NOT (!): Reverses the boolean.
        boolean notResult = !conditionA; // false


        // --- 6. OPERATOR PRECEDENCE ---
        // Java follows: () -> ++/-- -> * / % -> + - -> Relational -> Logical
        int result = 10 + 2 * 3;     // 16 (Multiplication first)
        int grouped = (10 + 2) * 3;  // 36 (Parentheses first)


        // --- 7. STRING CONCATENATION ---
        // The '+' operator concatenates if any operand is a String.
        System.out.println("Result: " + 10 + 20);   // "Result: 1020"
        System.out.println("Result: " + (10 + 20)); // "Result: 30"


        // --- 8. TYPE CASTING ---

        // A) Implicit Casting (Widening): Small to Large (Safe/Automatic)
        int myInt = 9;
        double myDouble = myInt; // 9.0

        // B) Explicit Casting (Narrowing): Large to Small (Manual/Potential Data Loss)
        double pi = 3.14;
        int intPi = (int) pi; // 3 (Decimals lost)

        // C) Overflow: When a value exceeds the type's range.
        int bigValue = 130;
        byte smallValue = (byte) bigValue; // -126 (Bit manipulation error)

        // D) Numeric Promotion: Small types are promoted to 'int' in math.
        byte b1 = 5;
        byte b2 = 5;
        // byte b3 = b1 + b2; // Fails! (b1 + b2) is an 'int'.
        byte b3 = (byte) (b1 + b2); // Correct

        // E) Char to Int (ASCII):
        char letter = 'A';
        int code = (int) letter; // 65


        // --- OUTPUTS ---
        System.out.println("Arithmetic Product: " + product);
        System.out.println("Post vs Pre: " + post + " / " + pre);
        System.out.println("Short-circuit (AND): " + andResult);
        System.out.println("Explicit Cast (double to int): " + intPi);
        System.out.println("Numeric Promotion (byte sum): " + b3);
        
        System.out.println("\nOperators and Casting Theory documented successfully!");
    }
}