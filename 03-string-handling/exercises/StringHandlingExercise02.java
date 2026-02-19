package exercises;
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

            String literal = "Secure";
            String object  = new String("Secure");
            
            boolean referenceCheck = (literal == object);      // false (Pool vs Heap)
            boolean contentCheck   = literal.equals(object);   // true (Value match)

        // 2. Case Insensitive Comparison:
        // Simulate a login check where the user typed "ADMIN" but the system expects "admin".
        // Using .equals() would fail, so we use .equalsIgnoreCase().

            String input = "ADMIN";
            String stored = "admin";
            boolean isAuthorized = input.equalsIgnoreCase(stored);

        // 3. Lexicographical Comparison (.compareTo):
        // Compare "Apple" and "Banana" to determine sorting order.
        // Result < 0 means "Apple" comes first. Result > 0 means it comes after.

            String itemA = "Apple";
            String itemB = "Banana";
            int sortOrder = itemA.compareTo(itemB); // Returns negative number

        // 4. Inspection and Searching:
        // Analyze the sentence "Java Programming".
        // Check if it contains "Java" and find the starting index of that word.

            String text = "Java Programming";
            boolean containsKeyword = text.contains("Java");
            int indexOfKeyword      = text.indexOf("Java"); // Should be 0

        System.out.println("--- Comparison Report ---");
        System.out.println("Reference Match (==): " + referenceCheck);
        System.out.println("Content Match (.equals): " + contentCheck);
        System.out.println("Login Authorized: " + isAuthorized);
        System.out.println("Sort Order (Apple vs Banana): " + sortOrder);
        System.out.println("Contains 'Java': " + containsKeyword);
        System.out.println("Index of 'Java': " + indexOfKeyword);
        
        System.out.println("Exercise 02: Comparison and Inspection practiced.");
    }
}