import java.util.ArrayList;
import java.util.Scanner;

public class lll {
    public static void main(String[] args) {
        ArrayList<String> sir = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Input the names of students
        System.out.println("Enter the names of up to 30 students: ");
        for (int i = 0; i < 30; i++) {
            System.out.print("Enter name " + (i + 1) + " (or type 'done' to finish early): ");
            String name = scanner.nextLine().trim(); // Trim to remove leading/trailing spaces

            // Skip empty inputs
            if (name.isEmpty()) {
                System.out.println("Empty input is not allowed. Please enter a valid name.");
                i--; // Decrement index to retry the same position
                continue;
            }

            // Allow early exit if user types 'done'
            if (name.equalsIgnoreCase("done")) {
                break;
            }

            sir.add(name);
        }

        // Display the list of students
        System.out.println("\nThe list of students:");
        for (String name : sir) {
            System.out.println(name);
        }

        // Check if the list is full and only then create a clone
        if (sir.size() == 30) {
            ArrayList<String> clonedSir = (ArrayList<String>) sir.clone();
            System.out.println("\nThe list is full. Cloning the list...");

            // Display the cloned list
            System.out.println("\nCloned list of students:");
            for (String name : clonedSir) {
                System.out.println(name);
            }
        } else {
            System.out.println("\nThe list is not full. Cloning will not be performed.");
        }
    }
}
