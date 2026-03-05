/**
 * EXERCISE: Classes and Objects Fundamentals (Team Project Workflow) - 3/3
 * CONCEPT: Consolidating all core concepts of classes and objects by managing
 * four independent instances in a realistic team project scenario. We create
 * multiple objects, set their state individually, invoke different method
 * combinations on each, and demonstrate complete instance independence.
 **/

public class ClassesAndObjectsExercise03 {

    public static void main(String[] args) {

        // 1. INSTANTIATION (Creating Objects)
        // IMPLEMENTATION: Create four distinct Developer objects using the 'new' keyword.


        System.out.println("--- 1. Instantiating Team Members ---");

        Developer dev1 = new Developer();
        Developer dev2 = new Developer();
        Developer dev3 = new Developer();
        Developer dev4 = new Developer();


        System.out.println("Four distinct Developer objects created in memory.");

        // 2. OBJECT STATE (Attributes)
        // IMPLEMENTATION: Set the attributes of each developer using the dot (.) operator.

        System.out.println("\n--- 2. Defining Team Member State ---");

        // Developer 1 - Frontend
        dev1.name = "Mariana Oliveira";
        dev1.specialty = "Frontend (React)";
        dev1.yearsExperience = 4;
        dev1.isCoding = false;

        // Developer 2 - Backend
        dev2.name = "Rafael Santos";
        dev2.specialty = "Backend (Spring Boot)";
        dev2.yearsExperience = 6;
        dev2.isCoding = false;


        // Developer 3 - Mobile
        dev3.name = "Juliana Pereira";
        dev3.specialty = "Mobile (Flutter)";
        dev3.yearsExperience = 3;
        dev3.isCoding = false;

        // Developer 4 - Fullstack Junior
        dev4.name = "Pedro Almeida";
        dev4.specialty = "Fullstack (Node + Vue)";
        dev4.yearsExperience = 1;
        dev4.isCoding = false;

        System.out.println("Dev 1: " + dev1.name + " - " + dev1.specialty);
        System.out.println("Dev 2: " + dev2.name + " - " + dev2.specialty);
        System.out.println("Dev 3: " + dev3.name + " - " + dev3.specialty);
        System.out.println("Dev 4: " + dev4.name + " - " + dev4.specialty);

        // 3. OBJECT BEHAVIOR (Methods)
        // IMPLEMENTATION: Simulate a sprint day by calling methods in different orders
        // and combinations on each independent instance.


        System.out.println("\n--- 3. Simulating Daily Workflow ---");

        dev1.startCoding();
        dev1.commitCode();

        dev2.startCoding();
        dev3.startCoding();
        dev2.commitCode();
        dev3.takeBreak();

        dev4.startCoding();
        dev1.takeBreak();
        dev4.commitCode();
        dev2.takeBreak();

        // 4. INDEPENDENT INSTANCES
        // IMPLEMENTATION: Display final info of all developers to prove each
        // object's state is completely independent regardless of method calls.


        System.out.println("\n--- 4. Final Team Status - Proving Independence ---");

        dev1.displayInfo();
        System.out.println("---");

        dev2.displayInfo();
        System.out.println("---");
        
        dev3.displayInfo();
        System.out.println("---");

        dev4.displayInfo();

        System.out.println("\nExercise 03/3 completed successfully!");
        System.out.println("Key concepts practiced:");
        System.out.println("• Class as blueprint");
        System.out.println("• Object instantiation with 'new'");
        System.out.println("• Object state (attributes) set individually");
        System.out.println("• Object behavior (methods) invoked selectively");
        System.out.println("• Complete independence between instances");
        System.out.println("• Managing multiple objects in a realistic scenario");
    }
}

// =================================================================
// CLASS DEFINITION (THE BLUEPRINT)
// =================================================================

class Developer {

    // --- STATE (ATTRIBUTES / FIELDS) ---
    String name;
    String specialty;
    int yearsExperience;
    boolean isCoding;

    // --- BEHAVIOR (METHODS) ---
    void startCoding() {
        isCoding = true;
        System.out.println(name + " started coding in " + specialty + ". Let's build!");
    }

    void commitCode() {
        System.out.println(name + " committed changes: git commit -m \"Progress on " + specialty + " feature\"");
    }

    void takeBreak() {
        isCoding = false;
        System.out.println(name + " took a break. Coffee time ☕");
    }

    void displayInfo() {
        System.out.println("Developer Profile:");
        System.out.println("- Name: " + name);
        System.out.println("- Specialty: " + specialty);
        System.out.println("- Experience: " + yearsExperience + " years");
        System.out.println("- Status: " + (isCoding ? "Currently Coding" : "On Break / Idle"));
    }
}