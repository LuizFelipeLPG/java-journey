/**
 * EXERCISE: String Comparison and Inspection
 * CONCEPT: Mastering string comparison methods (.equals vs ==),
 * lexicographical sorting (.compareTo), and content searching/analysis.
 * **/

public class StringHandlingExercise02 {
    public static void main(String[] args) {

        // 1. Reference (==) vs Content (.equals):
        // Create a literal and a 'new' object with the same text "Secure".
        // Demonstrate that (==) fails (different memory) but .equals() succeeds.

            

        // 2. Case Insensitive Comparison:
        // Simulate a login check where the user typed "ADMIN" but the system expects "admin".
        // Using .equals() would fail, so we use .equalsIgnoreCase().


        // 3. Lexicographical Comparison (.compareTo):
        // Compare "Apple" and "Banana" to determine sorting order.
        // Result < 0 means "Apple" comes first. Result > 0 means it comes after.


        // 4. Inspection and Searching:
        // Analyze the sentence "Java Programming".
        // Check if it contains "Java" and find the starting index of that word.


        System.out.println("--- Comparison Report ---");
        System.out.println("Reference Match (==): ");
        System.out.println("Content Match (.equals): ");
        System.out.println("Login Authorized: ");
        System.out.println("Sort Order (Apple vs Banana): ");
        System.out.println("Contains 'Java': ");
        System.out.println("Index of 'Java': ");
        
        System.out.println("Exercise 02: Comparison and Inspection practiced.");
    }
}