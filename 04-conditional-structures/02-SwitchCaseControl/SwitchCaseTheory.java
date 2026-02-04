/**
 * TOPIC: Control Structures: Switch Statement (Complete & Didactic Guide)
 * * CONCEPT: 
 * - Multi-way Branching: A cleaner alternative to many 'else-if's for single-value checks.
 * - Discrete Values: Works with exact matches (equality), not ranges or boolean logic.
 * - The 'break' Keyword: Critical for controlling flow and preventing execution leaks.
 * - Fall-Through Behavior: The unique ability to execute multiple cases sequentially.
 * - Modern Switch (Java 14+): Introduction to Switch Expressions and Arrow syntax (->).
 * * LICENSE: CC BY-NC-SA 4.0
 * AUTHOR: Luiz Felipe Goes
 */

public class SwitchCaseTheory {
    public static void main(String[] args) {

        // --- 1. THE CLASSIC SWITCH STRUCTURE (LEGACY) ---
        // Compares a single variable against multiple 'case' constants.
        // It uses a "Jump Table" logic, often faster than checking many 'if' conditions.
        int statusCode = 404;
        String statusMessage;

        switch (statusCode) {
            case 200:
                statusMessage = "OK - Success";
                break; // STOPS execution here. Without this, it proceeds to the next line.
            case 404:
                statusMessage = "Not Found - Client Error";
                break; // Exits the switch block immediately.
            case 500:
                statusMessage = "Internal Server Error";
                break;
            default:
                // Acts exactly like the final 'else'. Runs if NO case matches.
                statusMessage = "Unknown Status";
                break;
        }


        // --- 2. UNDERSTANDING "FALL-THROUGH" (CASE GROUPING) ---
        // If you OMIT the 'break' keyword, Java continues executing the code
        // in the next case, regardless of the value. This is useful for grouping.
        int monthNumber = 2;
        String season;

        switch (monthNumber) {
            // Grouping: Case 12, 1, and 2 all share the same logic block.
            case 12:
            case 1:
            case 2:
                season = "Winter"; 
                break; 
            
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;

            default:
                season = "Other Season";
        }


        // --- 3. SUPPORTED DATA TYPES ---
        // Switch does NOT work with boolean, long, float, or double.
        // It works with: char, byte, short, int, String (Java 7+), and Enums.
        String command = "START";

        switch (command) {
            case "START":
                System.out.println("System starting...");
                break;
            case "STOP":
                System.out.println("System stopping...");
                break;
            default:
                System.out.println("Invalid Command");
        }


        // --- 4. MODERN SWITCH EXPRESSIONS (JAVA 14+) ---
        // Solves the "missing break" bug and allows returning values directly.
        // Uses the Arrow Operator (->) to map input to output cleanly.
        char grade = 'B';

        String feedback = switch (grade) {
            case 'A' -> "Outstanding performance!";
            case 'B' -> "Good work, keep it up.";
            case 'C' -> "Average performance.";
            case 'D', 'F' -> "Fail - Needs improvement."; // Multiple labels in one line
            default -> "No grade available.";
        }; // Semicolon required here (variable assignment).


        // --- OUTPUTS ---
        System.out.println("HTTP Status: " + statusMessage);
        System.out.println("Current Season: " + season);
        System.out.println("Teacher Feedback: " + feedback);

        System.out.println("\nSwitch Case Theory documented successfully!");
    }
}