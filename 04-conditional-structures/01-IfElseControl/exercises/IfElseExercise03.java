/**
 * EXERCISE: Nested Logic, Scope & Pitfalls
 * CONCEPT: Managing hierarchical decisions (Nested Ifs), understanding
 * variable scope (lifetime), and avoiding assignment errors in conditions.
 * **/

public class IfElseExercise03 {
    public static void main(String[] args) {

        // 1. Nested Ifs (Hierarchical Logic):
        // A specific folder requires "Read" permission.
        // IMPLEMENTATION: First, check if the user 'isLoggedIn'.
        // IF true, check if they have 'hasPermission'.
        // - If both are true: set 'fileStatus' to "File Opened".
        // - If logged in but no permission: "Access Denied".
        // - If not logged in: "Please Log In".




        // 2. Variable Scope (The Block Rule):
        // You want to calculate a 'finalDamage' value.
        // IMPLEMENTATION: Declare 'finalDamage' outside the block (initialized with base 100).
        // Check if 'isCriticalHit' is true. IF yes, multiply 'finalDamage' by 2 inside the block.
        // (This demonstrates that variables declared outside remain accessible inside and after).




        // 3. The Assignment Pitfall (Assignment vs Comparison):
        // A common bug is writing (variable = true) inside the 'if', which assigns instead of checking.
        // IMPLEMENTATION: Check if 'isMaintenanceMode' is true using the correct comparison syntax
        // or the boolean variable directly. Set 'serverState' to "Offline" or "Online".




        System.out.println("--- Advanced Logic Report ---");
        System.out.println("File Access: ");
        System.out.println("Final Damage Calculation: ");
        System.out.println("Server Status: ");

    }
}