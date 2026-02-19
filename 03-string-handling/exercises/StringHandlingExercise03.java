package exercises;
/**
 * EXERCISE: String Slicing, Modification, and Conversion
 * CONCEPT: Extracting substrings, cleaning/replacing text data, 
 * and converting between Strings and primitive types (int, double).
 * **/

public class StringHandlingExercise03 {
    public static void main(String[] args) {

        // 1. Slicing (Substring):
        // Imagine a file system. Extract only the file name "report" 
        // from the full string "report.pdf", ignoring the extension.
        
            String fullFileName = "report.pdf";
            String fileName = fullFileName.substring(0, 6);

        // 2. Modification (Replace & Trim):
        // Sanitize a dirty log entry "   [ERROR]   ".
        // Remove outer spaces and replace brackets [] with parentheses ().
        
            String dirtyLog = "   [ERROR]   ";
            String cleanLog = dirtyLog.trim().replace("[", "(").replace("]", ")");

        // 3. Conversion (String -> Primitive):
        // Parse the text input "1500" into an integer to apply a bonus of 200.
        // Result must be an integer arithmetic operation.
        
            String salaryInput = "1500";
            int totalSalary = Integer.parseInt(salaryInput) + 200;

        // 4. Conversion (Primitive -> String):
        // Convert the double value 99.9 to a String to concatenate with currency symbol.
        // Using String.valueOf() is the safest standard way.
        
            double value = 99.9;
            String displayPrice = "$" + String.valueOf(value);

        System.out.println("--- Manipulation Report ---");
        System.out.println("Extracted Filename: " + fileName);
        System.out.println("Sanitized Log: " + cleanLog);
        System.out.println("Total Salary (Math): " + totalSalary);
        System.out.println("Display Price: " + displayPrice);
        
        System.out.println("Exercise 03: Slicing and Conversion practiced.");
    }
}