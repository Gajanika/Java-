public class NumberPattern3 {
    public static void main(String[] args) {
        int n = 4; // Number of rows
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Print numbers from 1 to the current row number
            }
            System.out.println(); // Move to the next line
        }
    }
}
