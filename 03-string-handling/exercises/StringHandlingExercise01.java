/**
 * EXERCISE: String Creation and Immutability
 * CONCEPT: Understanding the String Pool, the difference between
 * literals and 'new' objects, and the behavior of immutable Strings.
 * **/

public class StringHandlingExercise01 {
    public static void main(String[] args) {

        // 1. The Immutability Trap:
        // Initialize a String "Java" and try to modify it using .concat()
        // WITHOUT assigning the result to a variable. The original remains unchanged.

        

        // 2. The String Pool (Literals):
        // Create two variables with the exact same literal "Code".
        // JVM optimizes memory by pointing both to the same reference in the Pool.

        

        // 3. Forcing Heap Allocation:
        // Create a String using 'new' to bypass the Pool.
        // Even if the content is "Code", the memory address must be different.

          

        // 4. Correct Modification:
        // To actually "change" the text, we must capture the returned new String.
        // Convert "java" to UPPERCASE and assign it to a new variable.

        

        System.out.println("--- String Memory Report ---");
        System.out.println("Original Text (Unchanged): ");
        System.out.println("Pool Reference Shared: ");
        System.out.println("Pool vs Heap (Address Check): ");
        System.out.println("Correctly Modified: ");


    }
}