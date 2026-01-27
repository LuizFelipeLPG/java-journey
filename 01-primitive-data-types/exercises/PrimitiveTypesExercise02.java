/**
 * 
 EXERCISE: Primitive Limits
 CONCEPT: Understanding what happens when a type reaches its maximum value.
 *
 **/


public class PrimitiveTypesExercise02 {
    public static void main(String[] args) {
        // Testing the byte limit mentioned in theory (-128 to 127)
        byte testLimit = 127;
        
        // When we add 1 to 127 in a byte, it "wraps around" to -128.
        // This is called Overflow.
        System.out.println("Original byte: " + testLimit);
        System.out.println("Byte after limit (Overflow): " + (byte)(testLimit + 1));
    }
}