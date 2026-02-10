/**
 * EXERCISE: Expert Ternary Usage & Practical Refactoring
 * CONCEPT: Implementing dynamic UI formatting, null-safety patterns, 
 * and value clamping using advanced ternary expressions.
 * **/

public class TernaryOperatorExercise03 {
    public static void main(String[] args) {

        // 1. Dynamic UI Pluralization:
        // You are building a notification system.
        // RULE: If 'msgCount' is exactly 1, the suffix should be empty "".
        // Otherwise, the suffix must be "s" to pluralize the word "message".




        // 2. Data Sanitization (Null-Safety):
        // You are receiving a 'rawInput' from a database that might be null.
        // RULE: If 'rawInput' is null, assign "Anonymous" to 'finalName'.
        // If it is not null, assign the value of 'rawInput' itself.




        // 3. Value Clamping (Range Validation):
        // You need to ensure a 'volume' level stays within a safe range (0 to 100).
        // RULE: If 'inputVolume' is greater than 100, set 'clampedVolume' to 100.
        // If 'inputVolume' is less than 0, set it to 0. Otherwise, use 'inputVolume'.




        // 4. Binary State Toggle (String to Boolean):
        // An API returns a status as "active" or "inactive".
        // RULE: If 'apiResponse' equals "active" (case-insensitive), set 'isEnabled' to true.
        // For any other value, set it to false.




        System.out.println("--- Expert Logic Report ---");
        System.out.println("Inbox: _  message");
        System.out.println("User Profile: ");
        System.out.println("System Volume: ");
        System.out.println("Feature Enabled: ");

    }
}