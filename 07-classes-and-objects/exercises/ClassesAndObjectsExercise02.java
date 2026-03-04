/**
 * EXERCISE: Classes and Objects Fundamentals (Multiple Independent Instances - Student Team) - 2/3
 * CONCEPT: Practicing object creation with 'new', setting object state through
 * public attributes, invoking object behavior through methods, and proving that
 * each instance is completely independent (now with a real-world student scenario
 * and 3 objects instead of 2 to increase complexity while staying 100% within theory).
 **/

public class ClassesAndObjectsExercise02 {

    public static void main(String[] args) {

        // 1. INSTANTIATION (Creating Objects)
        // IMPLEMENTATION: Create three distinct Student objects using the 'new' keyword.
        
            System.out.println("--- 1. Instantiating Multiple Objects ---");

            Student student1 = new Student();
            Student student2 = new Student();
            Student student3 = new Student();

            System.out.println("Three distinct Student objects created in memory.");

        // 2. OBJECT STATE (Attributes)
        // IMPLEMENTATION: Set the attributes of each student using the dot (.) operator.

            System.out.println("\n--- 2. Defining Object State ---");

        // Student 1

            student1.name = "Ana Silva";
            student1.course = "Java Development";
            student1.age = 21;
            student1.isStudying = false;

        // Student 2

            student2.name = "Lucas Mendes";
            student2.course = "Python for Data Science";
            student2.age = 19;
            student2.isStudying = false;

        // Student 3

            student3.name = "Beatriz Costa";
            student3.course = "Mobile Development";
            student3.age = 24;
            student3.isStudying = false;

            System.out.println("Student 1: " + student1.name + " - " + student1.course);
            System.out.println("Student 2: " + student2.name + " - " + student2.course);
            System.out.println("Student 3: " + student3.name + " - " + student3.course);

        // 3. OBJECT BEHAVIOR (Methods)
        // IMPLEMENTATION: Call methods on the specific instances (different combinations to simulate real study routine).

            System.out.println("\n--- 3. Invoking Object Behavior ---");

            student1.startStudying();
            student2.submitAssignment();
            student3.startStudying();
            student1.submitAssignment();

        // 4. INDEPENDENT INSTANCES
        // IMPLEMENTATION: Display info of all students to prove they are completely independent.

            System.out.println("\n--- 4. Proving Instance Independence ---");
            
            student1.displayInfo();
            System.out.println("---");
            student2.displayInfo();
            System.out.println("---");
            student3.displayInfo();

        System.out.println("\nExercise 02/3 completed successfully!");
        System.out.println("Key concepts practiced:");
        System.out.println("• Class as blueprint");
        System.out.println("• Object instantiation with 'new'");
        System.out.println("• Object state (attributes)");
        System.out.println("• Object behavior (methods)");
        System.out.println("• Independent instances (multiple objects)");
    }
}
// =================================================================
// CLASS DEFINITION (THE BLUEPRINT)
// =================================================================
class Student {

    // --- STATE (ATTRIBUTES / FIELDS) ---
    String name;
    String course;
    int age;
    boolean isStudying;

    // --- BEHAVIOR (METHODS) ---
    void startStudying() {
        isStudying = true;
        System.out.println(name + " started studying " + course + ". Focus mode ON!");
    }

    void submitAssignment() {
        System.out.println(name + " submitted an assignment for the " + course + " course.");
    }

    void displayInfo() {
        System.out.println("Student Profile:");
        System.out.println("- Name: " + name);
        System.out.println("- Course: " + course);
        System.out.println("- Age: " + age);
        System.out.println("- Status: " + (isStudying ? "Currently Studying" : "Not Studying"));
    }
}