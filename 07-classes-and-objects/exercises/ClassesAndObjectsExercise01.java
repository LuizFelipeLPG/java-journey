/**
 * EXERCISE: Classes and Objects Fundamentals (Instantiation, State & Behavior) - 1/3
 * CONCEPT: Practicing object creation with 'new', setting object state through 
 * attributes, invoking object behavior through methods, and proving that 
 * each instance is completely independent.
 **/

public class ClassesAndObjectsExercise01 {

    public static void main(String[] args) {

        // 1. INSTANTIATION (Creating Objects)
        // IMPLEMENTATION: Create two distinct Car objects using the 'new' keyword.

            System.out.println("--- 1. Instantiating Objects ---");

            Car myFirstCar = new Car();
            Car mySecondCar = new Car();

            System.out.println("Two distinct Car objects created in memory.");


        // 2. OBJECT STATE (Attributes)
        // IMPLEMENTATION: Set the attributes of each car using the dot (.) operator.

            System.out.println("\n--- 2. Defining Object State ---");

            // First car
            myFirstCar.brand = "Toyota";
            myFirstCar.model = "Corolla";
            myFirstCar.year = 2023;
            myFirstCar.isRunning = false;

            // Second car
            mySecondCar.brand = "Ford";
            mySecondCar.model = "Mustang";
            mySecondCar.year = 1969;
            mySecondCar.isRunning = false;

            System.out.println("Car 1: " + myFirstCar.brand + " " + myFirstCar.model);
            System.out.println("Car 2: " + mySecondCar.brand + " " + mySecondCar.model);


        // 3. OBJECT BEHAVIOR (Methods)
        // IMPLEMENTATION: Call methods on the specific instances.

            System.out.println("\n--- 3. Invoking Object Behavior ---");

            myFirstCar.startEngine();
            mySecondCar.honk();


        // 4. INDEPENDENT INSTANCES
        // IMPLEMENTATION: Display info of both cars to prove they are independent.

            System.out.println("\n--- 4. Proving Instance Independence ---");

            myFirstCar.displayInfo();
            System.out.println("---");
            mySecondCar.displayInfo();


        System.out.println("\nExercise 01/3 completed successfully!");
        System.out.println("Key concepts practiced:");
        System.out.println("• Class as blueprint");
        System.out.println("• Object instantiation with 'new'");
        System.out.println("• Object state (attributes)");
        System.out.println("• Object behavior (methods)");
        System.out.println("• Independent instances");
    }
}

// =================================================================
// CLASS DEFINITION (THE BLUEPRINT)
// =================================================================


class Car {

    // --- STATE (ATTRIBUTES / FIELDS) ---
    String brand;
    String model;
    int year;
    boolean isRunning;


    // --- BEHAVIOR (METHODS) ---

    void startEngine() {
        isRunning = true;
        System.out.println("Vroom! The " + model + "'s engine has started.");
    }

    void honk() {
        System.out.println("Beep beep! The " + brand + " is honking.");
    }

    void displayInfo() {
        System.out.println("Vehicle Profile:");
        System.out.println("- Brand: " + brand);
        System.out.println("- Model: " + model);
        System.out.println("- Year: " + year);
        System.out.println("- Status: " + (isRunning ? "Running" : "Turned Off"));
    }
}