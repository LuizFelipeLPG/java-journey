/**
 * EXERCISE: While Loop Integration & Data Validation
 * CONCEPT: Combining while loops with conditional logic (if-else) 
 * to simulate data validation and state-dependent processing.
 **/

public class WhileLoopExercise03 {
    public static void main(String[] args) {

        // 1. Data Validation Simulation:
        // A system requires a "sensor reading" to be within a safe range (0-100).
        
            int sensorReading = -15; // Initial invalid value
            int retryCount = 0;

            while (sensorReading < 0 || sensorReading > 100) {
                retryCount++;
                
                // Simulating value update after a few attempts
                if (retryCount == 4) {
                    sensorReading = 42; // Valid value finally received
                }
            }


        // 2. Nested Logic within Loops:
        // Iterate from 1 to 10 and classify each number as Even or Odd.

            int checkNumber = 1;

            while (checkNumber <= 5) {
                if (checkNumber % 2 == 0) {
                    System.out.println("Value " + checkNumber + " is: EVEN");
                } else {
                    System.out.println("Value " + checkNumber + " is: ODD");
                }
                checkNumber++;
            }


        // 3. Multi-Condition Loop (Boolean Flag):
        // A process runs as long as the battery is above 10% AND the task is not finished.
        
            int batteryLevel = 25;
            boolean taskFinished = false;
            int cyclesProcessed = 0;

            while (batteryLevel > 10 && !taskFinished) {
                cyclesProcessed++;
                batteryLevel -= 5; // Consuming battery

                if (cyclesProcessed == 3) {
                    taskFinished = true; // Task completes before battery runs out
                }
            }


        // 4. Resource Depletion Scenario:
        // A tank loses 15 units of water per cycle until it reaches a critical level (below 20).
        
            int waterLevel = 100;
            int cycles = 0;

            while (waterLevel >= 20) {
                waterLevel -= 15;
                cycles++;
            }


        System.out.println("\n--- While Loop Advanced Integration Report ---");
        System.out.println("Sensor Reading Finalized at: " + sensorReading + " after " + retryCount + " retries.");
        System.out.println("Battery Level: " + batteryLevel + "% | Task Finished: " + taskFinished);
        System.out.println("Water Tank Cycles: " + cycles + " | Final Level: " + waterLevel);

        System.out.println("Exercise 03: Data validation and nested logic practiced.");
    }
}