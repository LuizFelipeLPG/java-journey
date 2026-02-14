/**
 * EXERCISE: Do-While Menu Logic & Flow Control
 * CONCEPT: Implementing mandatory first-run blocks for menus
 * and utilizing the 'break' statement to interrupt execution.
 * **/

public class DoWhileExercise02 {
    public static void main(String[] args) {

        // 1. Mandatory Execution (System Boot):
        // Even if a system has an immediate shutdown flag, the 'do-while'
        // ensures the initialization logic runs at least once.
        // IMPLEMENTATION: Set 'isSystemReady' to false, but use a 'do-while'
        // to set 'bootAttempts' to 1 before the condition is even checked.




        // 2. Simulated Menu Selection:
        // A classic use case where a menu is displayed until the user exits.
        // IMPLEMENTATION: Use 'userChoice' to simulate a menu.
        // - Choice 1: "Data Processing".
        // - Choice 0: "Exit".
        // The loop should repeat while 'userChoice' is not 0.




        // 3. Early Exit with 'break':
        // Sometimes a loop must stop before the condition is met due to an error.
        // IMPLEMENTATION: Iterate a 'sensorValue' from 1 to 10.
        // If 'sensorValue' reaches 5, simulate a "Critical Error" and 'break'.




        System.out.println("--- Do-While Logic & Control Report ---");
        System.out.println("System Boot Attempts: ");
        System.out.println("Last Menu Action: ");
        System.out.println("Safety Status: _ | Last Reading: ");

    }
}