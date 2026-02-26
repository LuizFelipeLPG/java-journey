/**
 * TOPIC: Classes and Objects (The Foundations of OOP)
 * * CONCEPT: 
 * - Paradigms: Shifting from Procedural to Object-Oriented Programming (OOP).
 * - Blueprints: What is a Class? (Template / Schema / Definition).
 * - Instances: What is an Object? (Concrete realization of a class in memory).
 * - Object State: Attributes (Fields / Variables) that hold data.
 * - Object Behavior: Methods (Actions / Functions) the object can perform.
 * - Instantiation: Using the 'new' keyword to allocate memory.
 * - Member Access: Using the dot (.) operator to interact with an object.
 * * LICENSE: CC BY-NC-SA 4.0
 * AUTHOR: Luiz Felipe Goes
 */

public class ClassesAndObjectsTheory {

    // --- MAIN METHOD (ENTRY POINT) ---
    public static void main(String[] args) {

        // --- 1. THE BLUEPRINT (CLASS) ---
        // A Class is not a real object; it's a design, a blueprint, or a template.
        // It defines what an object WILL have (State) and what it WILL do (Behavior).
        // Scroll down to the bottom of this file to see the 'Car' class definition.
        
        System.out.println("--- 1. Classes vs Objects ---");
        System.out.println("Blueprint (Car class) is defined. Ready to build objects!");


        // --- 2. INSTANTIATION (CREATING OBJECTS) ---
        // To create a real object from our blueprint, we use the 'new' keyword.
        // This process is called "Instantiation" (creating an instance).
        // The 'new' keyword asks Java to allocate space in the Heap Memory.

        System.out.println("\n--- 2. Instantiating Objects ---");
        
        Car myFirstCar = new Car(); // 'myFirstCar' is a reference to a Car object in memory
        Car mySecondCar = new Car(); // A completely separate object in memory
        
        System.out.println("Two distinct Car objects created in memory.");


        // --- 3. OBJECT STATE (ATTRIBUTES) ---
        // State represents the data or characteristics of a specific object.
        // We access and modify an object's attributes using the dot (.) operator.
        
        System.out.println("\n--- 3. Defining Object State ---");

        // Setting attributes for the first object
        myFirstCar.brand = "Toyota";
        myFirstCar.model = "Corolla";
        myFirstCar.year = 2023;
        myFirstCar.isRunning = false;

        // Setting attributes for the second object
        mySecondCar.brand = "Ford";
        mySecondCar.model = "Mustang";
        mySecondCar.year = 1969;
        mySecondCar.isRunning = false;

        System.out.println("Car 1: " + myFirstCar.brand + " " + myFirstCar.model);
        System.out.println("Car 2: " + mySecondCar.brand + " " + mySecondCar.model);


        // --- 4. OBJECT BEHAVIOR (METHODS) ---
        // Behavior represents what the object can DO. 
        // These are methods defined in the class, called upon the specific instance.

        System.out.println("\n--- 4. Invoking Object Behavior ---");
        
        myFirstCar.startEngine(); // Changes the internal state of myFirstCar
        mySecondCar.honk();       // Action performed by mySecondCar
        

        // --- 5. INDEPENDENT INSTANCES ---
        // CRITICAL CONCEPT: Changes to one object DO NOT affect the other.
        // They share the same Blueprint, but have their own separate data (State).

        System.out.println("\n--- 5. Proving Instance Independence ---");
        
        myFirstCar.displayInfo();
        System.out.println("---");
        mySecondCar.displayInfo();


        System.out.println("\nClasses and Objects Theory documented successfully!");
    }
}

// =================================================================
//  CLASS DEFINITIONS (THE BLUEPRINTS)
// =================================================================

// Note: We are defining the 'Car' class in the same file for simplicity.
// In real projects, each class usually gets its own separate .java file.
// We are also not using 'private' or 'Constructors' yet (Next chapters!).

class Car {

    // --- 1. STATE (ATTRIBUTES / FIELDS) ---
    // These variables define what a Car "has".
    // Every time we create a 'new Car()', it gets its own copy of these variables.
    String brand;
    String model;
    int year;
    boolean isRunning;


    // --- 2. BEHAVIOR (METHODS) ---
    // These methods define what a Car "can do".
    // Notice we don't use the 'static' keyword here. 
    // These methods belong to the INSTANCE, not the class itself.
    
    void startEngine() {
        isRunning = true; // Modifies the object's own state
        System.out.println("Vroom! The " + model + "'s engine has started.");
    }

    void honk() {
        System.out.println("Beep beep! The " + brand + " is honking.");
    }

    void displayInfo() {
        System.out.println("Vehicle Profile:");
        System.out.println("- Brand: " + brand);
        System.out.println("- Model: " + model);
        System.out.println("- Year:  " + year);
        System.out.println("- Status: " + (isRunning ? "Running" : "Turned Off"));
    }
}