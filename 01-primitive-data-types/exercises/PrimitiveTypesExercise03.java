/**
 * EXERCISE: Suffixes and Precision
 CONCEPT: Practicing 'L' for long, 'f' for float and character literals.
 *
 **/


public class PrimitiveTypesExercise03 {
    public static void main(String[] args) {
        
        // 1. Number of people on Earth (approx. 8 billion) - Needs suffix?

            long worldPopulation = 8_000_000_000L;

        // 2. Average price of fuel (5.89) - Needs suffix?

            float fuelPrice = 5.89f;

        // 3. A special symbol using char (S) - Are double quotes correct?

            char specialSymbol = 'S';

        // 4. Bonus: A coffee cup symbol using Unicode (\u2615)

            char javaSymbol = '\u2615';

        System.out.println("--- Advanced Primitive Check ---");
        System.out.println("World Population: " + worldPopulation);
        System.out.println("Fuel Price: " + fuelPrice);
        System.out.println("Special Symbol: " + specialSymbol);
        System.out.println("Java Symbol: " + javaSymbol);
        
        System.out.println("Exercise 03: Type suffixes and literals practiced.");
    }
}