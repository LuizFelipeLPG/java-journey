/**
 * TOPIC: Primitive Data Types
 * * CONCEPT: In Java, primitive types are the most basic data types built into the language.
 * They are not objects and hold their values directly in memory (Stack).
 * * LICENSE: CC BY-NC-SA 4.0
 * AUTHOR: Luiz Felipe Goes
 */

public class PrimitiveTypesTheory {
    public static void main(String[] args) {
        
        // --- INTEGER TYPES ---
        
        // byte: 8-bit signed integer. Range: -128 to 127.
        // Useful for saving memory in large arrays.
        byte memorySaver = 100;

        // short: 16-bit signed integer. Range: -32,768 to 32,767.
        short smallNumber = 30000;

        // int: 32-bit signed integer. (Most common for numbers).
        int defaultInteger = 2147483647;

        // long: 64-bit signed integer. Use 'L' suffix.
        long bigNumber = 9223372036854775807L;


        // --- FLOATING POINT TYPES ---

        // float: 32-bit precision. Use 'f' suffix.
        float price = 19.99f;

        // double: 64-bit precision. (Standard for decimals).
        double interestRate = 0.0575;


        // --- OTHERS ---

        // char: 16-bit Unicode character.
        char grade = 'A';

        // boolean: true or false.
        boolean isLearningJava = true;

        // Printing results to console
        System.out.println("Java Primitives documented successfully!");
    }
}