/**
 * TOPIC: String Handling (Complete & Didactic Guide)
 * * CONCEPT: 
 * - String Pool: Memory optimization (Heap vs Constant Pool).
 * - Immutability: Understanding why Strings cannot be changed in place.
 * - Comparison: Reference (==) vs Content (.equals) vs Lexicographical (.compareTo).
 * - Inspection: Searching, slicing, and analyzing text data.
 * * LICENSE: CC BY-NC-SA 4.0
 * AUTHOR: Luiz Felipe Goes
 */

public class StringHandlingTheory {
    public static void main(String[] args) {

        // --- 1. CREATION & IMMUTABILITY ---
        // Strings are immutable objects. Modifying them creates a NEW object.
        String phrase = "Hello world, this is the new world";
        
        phrase.toUpperCase(); // Creates a new String "HELLO...", but discards it immediately.
        String upper = phrase.toUpperCase(); // Correct way: assign to a variable.


        // --- 2. THE STRING POOL & MEMORY (CRITICAL) ---
        // 'literal' is stored in the String Pool to save memory.
        String literal = "Password123";
        String sameLiteral = "Password123"; 
        
        // 'new String' forces creation of a new object in the Heap (bypassing the Pool).
        // This simulates inputs from Scanners, Databases, or Files.
        String heapString = new String("Password123");


        // --- 3. STRING COMPARISON ---
        
        // A) Reference Comparison (==)
        // Checks if both variables point to the EXACT SAME memory address.
        boolean ref1 = (literal == sameLiteral); // true (Both refer to the Pool instance)
        boolean ref2 = (literal == heapString);  // false (Pool address != Heap address)

        // B) Content Comparison (.equals) -> THE STANDARD WAY
        // Checks if the characters inside the objects are identical.
        boolean content1 = literal.equals(heapString); // true (Value is the same)
        boolean content2 = literal.equalsIgnoreCase("password123"); // true (Ignores case)

        // C) Lexicographical Comparison (.compareTo)
        // Returns 0 if equal, negative if smaller, positive if larger (Used for Sorting).
        String apple = "Apple";
        String banana = "Banana";
        int sortOrder = apple.compareTo(banana); // Negative value (A comes before B)


        // --- 4. INSPECTION & SEARCHING ---
        // Basic metrics
        int length = phrase.length();         // Total characters
        boolean isEmpty = phrase.isEmpty();   // Checks if length is 0
        boolean isBlank = "   ".isBlank();    // Checks if it's empty or whitespace only (Java 11+)

        // Searching content
        boolean containsWord = phrase.contains("new"); // true
        int firstIndex = phrase.indexOf("world");      // Index of first occurrence
        int lastIndex  = phrase.lastIndexOf("world");  // Index of last occurrence


        // --- 5. SLICING & MODIFICATION ---
        // Reminder: These methods return a NEW String.
        
        // Substring: Extracting parts of the text
        String subStart = phrase.substring(6);       // "world, this is the new world"
        String subRange = phrase.substring(0, 5);    // "Hello" (End index is exclusive)

        // Replacement
        String replaced = phrase.replace("world", "Java"); // Replaces ALL occurrences

        // Trimming (Cleaning User Input)
        String dirtyInput = "   user_input   ";
        String cleanInput = dirtyInput.trim(); // "user_input" (Removes outer spaces)


        // --- 6. DATA CONVERSION (String <-> Primitives) ---
        int number = 42;
        String strNum = String.valueOf(number); // Converts int to String ("42")
        int parsedNum = Integer.parseInt(strNum); // Converts String to int (42)


        // --- OUTPUTS ---
        System.out.println("Original Phrase: " + phrase);
        System.out.println("Memory Ref Check (Pool vs Heap): " + ref2); // false (Crucial concept)
        System.out.println("Content Check (.equals): " + content1);     // true
        System.out.println("Lexicographical Sort (Apple vs Banana): " + sortOrder);
        System.out.println("Replaced String: " + replaced);
        
        System.out.println("\nString Handling Theory documented successfully!");
    }
}