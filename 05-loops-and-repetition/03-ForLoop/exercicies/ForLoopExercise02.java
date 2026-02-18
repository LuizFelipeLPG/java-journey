/**
 * EXERCISE: Nested Loops & Advanced Flow Control
 * CONCEPT: Handling loops inside loops (nesting), managing infinite
 * loop structures manually, and using 'continue' to filter iterations.
 * **/

public class ForLoopExercise02 {
    public static void main(String[] args) {

        // 1. Nested Loops (Visual Grid):
        // Understanding how an inner loop finishes completely before the outer loop steps.
        // IMPLEMENTATION: Create a 'rows' loop (1 to 3) and a 'cols' loop (1 to 3).
        // Print the coordinate pair [row, col] for every iteration.




        // 2. The 'continue' Statement (Skipping Logic):
        // Using 'continue' to skip specific numbers without breaking the loop.
        // IMPLEMENTATION: Loop from 1 to 10. If the number is divisible by 3,
        // use 'continue' to skip the addition. Sum only non-divisible numbers.




        // 3. Infinite Loop Control (Safe Break):
        // Using the for(;;) syntax as defined in theory section 7.
        // IMPLEMENTATION: Create a 'counter'. Increment it inside an infinite loop.
        // If 'counter' reaches 5, use 'break' to escape immediately.




        System.out.println("--- Advanced Flow Control Report ---");
        System.out.println("Grid Generated:\n" );
        System.out.println("Sum (Skipping multiples of 3): ");
        System.out.println("Infinite Loop Status: _ (Cycles: _)");


    }
}