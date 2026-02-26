package exercises;
/**
 * EXERCISE: Basic Switch Statement (Classic Syntax)
 * CONCEPT: Replacing multiple equality checks with a jump table.
 * Practice handling distinct values for Integers, Strings, and Characters.
 * **/

public class SwitchCaseExercise01 {
    public static void main(String[] args) {

        // 1. Integer Switch (Elevator System):
        // You have a variable 'floorNumber' representing the button pressed.
        // IMPLEMENTATION: Update the 'location' variable based on the floor map:
        // - Floor 1: Lobby
        // - Floor 2: Gym
        // - Floor 3: Pool
        // - Any other floor: Restricted Area
        
            int floorNumber = 2;
            String location;

            switch (floorNumber) {
                case 1:
                    location = "Lobby";
                    break;
                case 2:
                    location = "Gym";
                    break;
                case 3:
                    location = "Pool";
                    break;
                default:
                    location = "Restricted Area";
                    break;
            }


        // 2. String Switch (File Extension Handler):
        // A program needs to identify the file type based on its extension text.
        // IMPLEMENTATION: Set the 'fileType' description according to the 'extension':
        // - "java": Source Code
        // - "class": Bytecode File
        // - "jar": Executable Archive
        // - Unknown extensions: Unknown Format

            String extension = "java";
            String fileType;

            switch (extension) {
                case "java":
                    fileType = "Source Code";
                    break;
                case "class":
                    fileType = "Bytecode File";
                    break;
                case "jar":
                    fileType = "Executable Archive";
                    break;
                default:
                    fileType = "Unknown Format";
                    break;
            }


        // 3. Char Switch (CRUD Operations):
        // You have a char representing a database command ('C', 'R', 'U', 'D').
        // IMPLEMENTATION: Translate the char into the full operation name stored in 'operation':
        // - 'C' -> Create
        // - 'R' -> Read
        // - 'U' -> Update
        // - 'D' -> Delete
        // - Ensure invalid chars result in "Invalid Operation".

            char commandChar = 'U';
            String operation;

            switch (commandChar) {
                case 'C':
                    operation = "Create";
                    break;
                case 'R':
                    operation = "Read";
                    break;
                case 'U':
                    operation = "Update";
                    break;
                case 'D':
                    operation = "Delete";
                    break;
                default:
                    operation = "Invalid Operation";
                    break;
            }


        System.out.println("--- Switch Logic Report ---");
        System.out.println("Elevator Location: " + location);
        System.out.println("File Type: " + fileType);
        System.out.println("Database Task: " + operation);

        System.out.println("Exercise 01: Classic Switch Case practiced.");
    }
}