/**
 * EXERCISE: Type Casting, Promotion, and Concatenation
 * CONCEPT: Handling data type conversions (widening/narrowing), 
 * numeric promotion rules (byte/short), and String concatenation logic.
 * **/

public class OperatorsExercise03 {
    public static void main(String[] args) {
        
        // 1. Explicit Casting (Narrowing):
        // Convert the double value 99.99 to an integer (truncate decimals).
        
           
        // 2. Numeric Promotion (Byte Issue):
        // Add two byte variables (b1 = 10, b2 = 20).
        // Since Java promotes bytes to int during math, cast the result back to byte.
        
           

        // 3. String Concatenation vs Addition:
        // Observe the difference when parentheses are omitted versus included.
        // A: "Data: " + 10 + 5 (String concatenation takes priority).
        // B: "Data: " + (10 + 5) (Parentheses force arithmetic first).
        
            

        // 4. Char Arithmetic (ASCII):
        // Characters are stored as numbers. Add 1 to 'A' to find the next letter.
        // Cast the result back to char to print the symbol instead of the number.
        
            
            

        System.out.println("--- Casting & Strings Report ---");
        System.out.println("TruncaeValue: ");
        System.out.println("Byte Log: " );
        System.out.println("Concatenation (No Parens): ");
        System.out.println("Concatenation (With Parens): ");
        System.out.println("Next Character: ");
        
        
    }
}