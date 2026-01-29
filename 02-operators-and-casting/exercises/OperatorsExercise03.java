/**
 * EXERCISE: Type Casting, Promotion, and Concatenation
 * CONCEPT: Handling data type conversions (widening/narrowing), 
 * numeric promotion rules (byte/short), and String concatenation logic.
 * **/

public class OperatorsExercise03 {
    public static void main(String[] args) {
        
        // 1. Explicit Casting (Narrowing):
        // Convert the double value 99.99 to an integer (truncate decimals).
        
            double preciseValue = 99.99;
            int truncatedValue = (int) preciseValue;

        // 2. Numeric Promotion (Byte Issue):
        // Add two byte variables (b1 = 10, b2 = 20).
        // Since Java promotes bytes to int during math, cast the result back to byte.
        
            byte b1 = 10;
            byte b2 = 20;
            byte byteResult = (byte) (b1 + b2);

        // 3. String Concatenation vs Addition:
        // Observe the difference when parentheses are omitted versus included.
        // A: "Data: " + 10 + 5 (String concatenation takes priority).
        // B: "Data: " + (10 + 5) (Parentheses force arithmetic first).
        
            String textConcat = "Data: " + 10 + 5;
            String textSum    = "Data: " + (10 + 5);

        // 4. Char Arithmetic (ASCII):
        // Characters are stored as numbers. Add 1 to 'A' to find the next letter.
        // Cast the result back to char to print the symbol instead of the number.
        
            char initialChar = 'A';
            char nextChar = (char) (initialChar + 1);

        System.out.println("--- Casting & Strings Report ---");
        System.out.println("Truncated Value: " + truncatedValue);
        System.out.println("Byte Logic Sum: " + byteResult);
        System.out.println("Concatenation (No Parens): " + textConcat);
        System.out.println("Concatenation (With Parens): " + textSum);
        System.out.println("Next Character: " + nextChar);
        
        System.out.println("Exercise 03: Casting and Concatenation practiced.");
    }
}