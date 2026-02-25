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

            int msgCount = 5;
            String suffix;

            suffix = (msgCount == 1) ? "" : "s";


        // 2. Data Sanitization (Null-Safety):
        // You are receiving a 'rawInput' from a database that might be null.
        // RULE: If 'rawInput' is null, assign "Anonymous" to 'finalName'.
        // If it is not null, assign the value of 'rawInput' itself.

            String rawInput = null;
            String finalName;

            finalName = (rawInput == null) ? "Anonymous" : rawInput;


        // 3. Value Clamping (Range Validation):
        // You need to ensure a 'volume' level stays within a safe range (0 to 100).
        // RULE: If 'inputVolume' is greater than 100, set 'clampedVolume' to 100.
        // If 'inputVolume' is less than 0, set it to 0. Otherwise, use 'inputVolume'.

            int inputVolume = 115;
            int clampedVolume;

            clampedVolume = (inputVolume > 100) ? 100 : (inputVolume < 0) ? 0 : inputVolume;


        // 4. Binary State Toggle (String to Boolean):
        // An API returns a status as "active" or "inactive".
        // RULE: If 'apiResponse' equals "active" (case-insensitive), set 'isEnabled' to true.
        // For any other value, set it to false.

            String apiResponse = "ACTIVE";
            boolean isEnabled;

            isEnabled = (apiResponse.equalsIgnoreCase("active")) ? true : false;


        System.out.println("--- Expert Logic Report ---");
        System.out.println("Inbox: " + msgCount + " message" + suffix);
        System.out.println("User Profile: " + finalName);
        System.out.println("System Volume: " + clampedVolume);
        System.out.println("Feature Enabled: " + isEnabled);

        System.out.println("Exercise 03: Expert scenarios completed.");
    }
}