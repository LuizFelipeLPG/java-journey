/**
 * 
 EXERCISE: Efficient Data Selection
 CONCEPT: Choosing the smallest primitive type to save memory.
 *
 **/

package exercises;

public class PrimitiveTypesExercise01 {
    public static void main(String[] args) {
        // Declare variables using the most memory-efficient types for:

        // 1. Number of planets in the solar system (8)

            byte planetsCount = 8;

        // 2. Average temperature of a room (25)

            byte averageTemperature = 26;

        // 3. A star's brightness level from 'A' to 'Z'

            char brightnessLevel = 'Z';

        // 4. If the mission is successful or not

            boolean isSuccessful = true;
        
        System.out.println("Exercise 01: Efficient types declared.");
    }
}
