public class MultiplicationTable{
    public static void main(String[] args) {
        int maxNumber = 5; // Numbers for which we want the table
        int maxMultiplier = 13; // Multiplication table up to this number

        // Generate multiplication tables
        for (int number = 1; number <= maxNumber; number++) {
            System.out.println("Multiplication Table for " + number + ":");
            for (int multiplier = 1; multiplier <= maxMultiplier; multiplier++) {
                System.out.println(number + " * " + multiplier + " = " + (number * multiplier));
            }
            System.out.println(); // Blank line between tables
        }
    }
}