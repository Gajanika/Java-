
public class NumberPattern4 {
    public static void main(String[] args) {
        int n = 4; // Number of rows
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i); // Print the row number
            }
            System.out.println(); // Move to the next line
        }
    }
}

