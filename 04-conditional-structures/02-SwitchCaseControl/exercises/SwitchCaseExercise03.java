package exercises;
/**
 * EXERCISE: Modern Switch Expressions & Advanced Features (Java 14+)
 * CONCEPT: Switch Expressions with arrow syntax (->), multiple case labels,
 *          returning values, and using 'yield' for complex blocks.
 * IMPORTANT: Requires Java 14 or higher to compile.
 * **/

public class SwitchCaseExercise03 {
    public static void main(String[] args) {
        
        // 1. SWITCH EXPRESSION WITH ARROW SYNTAX (Simple Mapping):
        // You're building a traffic light system. Based on the light color,
        // determine the driver's action.
        // IMPLEMENTATION: Use switch expression with arrow (->) to assign
        // the correct action to 'driverAction':
        // - "RED"    -> "Stop completely"
        // - "YELLOW" -> "Prepare to stop"
        // - "GREEN"  -> "Proceed with caution"
        // - Default  -> "Invalid signal"
        
        String trafficLight = "YELLOW";
        String driverAction = switch (trafficLight) {
            case "RED"    -> "Stop completely";
            case "YELLOW" -> "Prepare to stop";
            case "GREEN"  -> "Proceed with caution";
            default       -> "Invalid signal";
        }; 


        // 2. MULTIPLE CASE LABELS IN ONE LINE & COMPLEX LOGIC:
        // A restaurant needs to categorize menu items by their calorie count.
        // IMPLEMENTATION: Use switch expression with multiple labels per case
        // and blocks of code using 'yield' to return values:
        // - 0-100 calories:   "Light Snack"
        // - 101-300 calories: "Regular Dish"
        // - 301-500 calories: "Hearty Meal"
        // - 501+ calories:    "Special Occasion"
        // - Negative values:  "Invalid Input"
        
        int calories = 425;
        String mealCategory = switch (calories) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> "Light Snack"; 
            case 101, 102, 103 -> "Regular Dish"; 
            default -> {
                // For ranges, we need logic blocks with 'yield'
                if (calories < 0) {
                    yield "Invalid Input";
                } else if (calories <= 100) {
                    yield "Light Snack";
                } else if (calories <= 300) {
                    yield "Regular Dish";
                } else if (calories <= 500) {
                    yield "Hearty Meal";
                } else {
                    yield "Special Occasion";
                }
            }
        };


        // 3. ENUM SWITCH WITH EXPRESSIONS (Professional Use Case):
        // You're managing user permission levels in a system.
        // IMPLEMENTATION: Create a simple enum and use switch expression
        // to determine the access level description.
        
        // Define the enum (usually in separate file, but here for simplicity)
        enum UserRole { 
            GUEST, 
            MEMBER, 
            MODERATOR, 
            ADMIN 
        }
        
        UserRole currentUser = UserRole.MODERATOR;
        String accessDescription = switch (currentUser) {
            case GUEST     -> "Can only view public content";
            case MEMBER    -> "Can view and post content";
            case MODERATOR -> "Can moderate content and warn users";
            case ADMIN     -> "Full system access, can manage users";

        };


        // 4. SWITCH EXPRESSION RETURNING NUMERIC VALUES (Calculator):
        // A simple calculator that performs operations based on operator character.
        // IMPLEMENTATION: Complete the switch expression to perform the operation
        // between 'num1' and 'num2' based on the 'operator':
        // - '+' : Addition
        // - '-' : Subtraction
        // - '*' : Multiplication
        // - '/' : Division (handle integer division)
        // - Default: Return -1 (error code)
        
        int num1 = 15;
        int num2 = 3;
        char operator = '*';
        
        int calculationResult = switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    yield -999; 
                } else {
                    yield num1 / num2;
                }
            }
            default -> -1; 
        };


        System.out.println("=== MODERN SWITCH EXPRESSIONS REPORT ===");
        System.out.println("1. Traffic System:");
        System.out.println("   Light: " + trafficLight + " -> Action: " + driverAction);
        
        System.out.println("\n2. Nutrition Categorization:");
        System.out.println("   Calories: " + calories + " -> Category: " + mealCategory);
        
        System.out.println("\n3. User Permission System:");
        System.out.println("   User Role: " + currentUser);
        System.out.println("   Access Level: " + accessDescription);
        
        System.out.println("\n4. Calculator Operation:");
        System.out.println("   " + num1 + " " + operator + " " + num2 + " = " + 
                          (calculationResult == -999 ? "Error: Division by zero!" : calculationResult));
        
        System.out.println("\n=== KEY FEATURES DEMONSTRATED ===");
        System.out.println("✓ Arrow syntax (->) for concise mapping");
        System.out.println("✓ Multiple case labels in single line");
        System.out.println("✓ Blocks with 'yield' for complex logic");
        System.out.println("✓ Switch as expression (returns values)");
        System.out.println("✓ No fall-through bugs (safer by design)");
        System.out.println("✓ Enum integration (exhaustive checking)");
        
        System.out.println("\nExercise 03: Modern Switch Expressions mastered!");
    }
}