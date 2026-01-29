/**
 * EXERCISE: Relational and Logical Operators
 * CONCEPT: Mastering boolean logic by comparing values (>, <, ==, !=)
 * and combining conditions using logical operators (&&, ||).
 * **/

public class OperatorsExercise02 {
    public static void main(String[] args) {
        
        // 1. Relational Comparison:
        // Check if a person aged 17 is eligible to vote (age must be >= 16).
        
            int age = 17;
            boolean canVote = age >= 16;

        // 2. Logical AND (&&): Range Check.
        // Verify if the number 15 is strictly between 10 AND 20.
        
            int number = 15;
            boolean inRange = (number > 10) && (number < 20);

        // 3. Logical OR (||): Discount Eligibility.
        // A user gets a discount if they are a VIP member OR if they spent over 100.0.
        // Case: Not a member, but spent 150.0.
        
            boolean isVip = false;
            double spend = 150.0;
            boolean getsDiscount = isVip || (spend > 100.0);

        // 4. Equality and Logical NOT (!):
        // Check if two ID numbers (505 and 506) are DIFFERENT using the '!=' operator.
        
            int idOne = 505;
            int idTwo = 506;
            boolean isDifferent = (idOne != idTwo);

        System.out.println("--- Logic Report ---");
        System.out.println("Can Vote: " + canVote);
        System.out.println("Is in Range (10-20): " + inRange);
        System.out.println("Eligible for Discount: " + getsDiscount);
        System.out.println("IDs are different: " + isDifferent);
        
        System.out.println("Exercise 02: Relational and Logical logic practiced.");
    }
}