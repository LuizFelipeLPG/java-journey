/**
 * EXERCISE: Switch Case Fall-Through (Grouping)
 * CONCEPT: Omitting the 'break' keyword intentionally to let execution 
 * flow into the next case. Used to group multiple inputs for a single output.
 * **/

public class SwitchCaseExercise02 {
    public static void main(String[] args) {

        // 1. Grouping Integers (Quarterly Report):
        // You have a variable 'monthIndex' (1 to 12).
        // IMPLEMENTATION: Determine the 'quarter' based on the month:
        // - Months 1, 2, 3: "Q1 - First Quarter"
        // - Months 4, 5, 6: "Q2 - Second Quarter"
        // - Months 7, 8, 9: "Q3 - Third Quarter"
        // - Months 10, 11, 12: "Q4 - Fourth Quarter"
        // - Invalid months: "Unknown Quarter"




        // 2. Grouping Characters (Vowel Checker):
        // You have a character variable 'letter'.
        // IMPLEMENTATION: Detect if the character is a Vowel or Consonant.
        // - 'a', 'e', 'i', 'o', 'u' (lowercase): Set 'type' to "Vowel".
        // - All other characters: Set 'type' to "Consonant/Other".
        // (Tip: Stack the cases to share the "Vowel" assignment).




        // 3. Grouping Strings (Business Days):
        // A scheduler needs to know if a specific day is a "Workday" or "Weekend".
        // IMPLEMENTATION: Check the 'dayOfWeek' string:
        // - "Monday", "Tuesday", "Wednesday", "Thursday", "Friday": "Workday"
        // - "Saturday", "Sunday": "Weekend"
        // - Default: "Invalid Input"




        System.out.println("--- Grouping Logic Report ---");
        System.out.println("Financial Period: ");
        System.out.println("Character Type: ");
        System.out.println("Day Category: ");

    }
}