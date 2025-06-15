public class StarPattern5 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print("   "); // Adjust spacing for alignment
            }
            // Print stars with spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" *     "); // Adjust spacing for alignment
            }
            System.out.println(); // Move to the next line
        }
    }
}
