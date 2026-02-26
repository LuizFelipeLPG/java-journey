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

            int monthIndex = 5;
            String quarter;

            switch (monthIndex) {
                case 1:
                case 2:
                case 3:
                    quarter = "Q1 - First Quarter";
                    break;
                case 4:
                case 5:
                case 6:
                    quarter = "Q2 - Second Quarter";
                    break;
                case 7:
                case 8:
                case 9:
                    quarter = "Q3 - Third Quarter";
                    break;
                case 10:
                case 11:
                case 12:
                    quarter = "Q4 - Fourth Quarter";
                    break;
                default:
                    quarter = "Unknown Quarter";
                    break;
            }


        // 2. Grouping Characters (Vowel Checker):
        // You have a character variable 'letter'.
        // IMPLEMENTATION: Detect if the character is a Vowel or Consonant.
        // - 'a', 'e', 'i', 'o', 'u' (lowercase): Set 'type' to "Vowel".
        // - All other characters: Set 'type' to "Consonant/Other".
        // (Tip: Stack the cases to share the "Vowel" assignment).

            char letter = 'e';
            String type;

            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    type = "Vowel";
                    break;
                default:
                    type = "Consonant/Other";
                    break;
            }


        // 3. Grouping Strings (Business Days):
        // A scheduler needs to know if a specific day is a "Workday" or "Weekend".
        // IMPLEMENTATION: Check the 'dayOfWeek' string:
        // - "Monday", "Tuesday", "Wednesday", "Thursday", "Friday": "Workday"
        // - "Saturday", "Sunday": "Weekend"
        // - Default: "Invalid Input"

            String dayOfWeek = "Saturday";
            String category;

            switch (dayOfWeek) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    category = "Workday";
                    break;
                case "Saturday":
                case "Sunday":
                    category = "Weekend";
                    break;
                default:
                    category = "Invalid Input";
                    break;
            }


        System.out.println("--- Grouping Logic Report ---");
        System.out.println("Financial Period: " + quarter);
        System.out.println("Character Type: " + type);
        System.out.println("Day Category: " + category);

        System.out.println("Exercise 02: Switch fall-through practiced.");
    }
}
