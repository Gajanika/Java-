public class StarPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
