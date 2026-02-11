/**
 * EXERCISE: While Loop Control Flow
 * CONCEPT: Managing loop execution using dynamic conditions,
 * intentional infinite loops, and control keywords (break / continue).
 **/

public class WhileLoopExercise02 {
    public static void main(String[] args) {

        // 1. Controlled Infinite Loop with Break:
        // A system processes values until a target condition is reached.
        // Once the condition is met, the loop must stop immediately.

            int searchValue = 1;

            while (true) {
                if (searchValue == 4) {
                    System.out.println("Target value reached.");
                    break;
                }
                searchValue++;
            }


        // 2. Conditional Skip Using Continue:
        // Display numbers from 1 to 5.
        // A specific value must be skipped during the output.

            int counter = 0;

            while (counter < 5) {
                counter++;

                if (counter == 3) {
                    continue;
                }

                System.out.println("Current Number: " + counter);
            }


        // 3. Accumulator with Conditional Interruption:
        // Accumulate values starting from 1.
        // Stop processing once the accumulated total exceeds 6.

            int number = 1;
            int total = 0;

            while (true) {
                total += number;

                if (total > 6) {
                    break;
                }

                number++;
            }


        // 4. Loop with Dynamic State Control:
        // A connection attempt system retries until the connection is closed.

            boolean isConnected = true;
            int attempts = 0;

            while (isConnected) {
                attempts++;

                if (attempts == 3) {
                    isConnected = false;
                }
            }


        System.out.println("\n--- While Loop Control Report ---");
        System.out.println("Search Final Value: " + searchValue);
        System.out.println("Final Accumulated Total: " + total);
        System.out.println("Connection Attempts: " + attempts);

        System.out.println("Exercise 02: Loop control flow practiced.");
    }
}
