import java.util.ArrayList;
import java.util.Scanner;

public class lll{
    public static void main(String[] args) {
        ArrayList<String> sir = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Input 30 students names
        System.out.println("Enter the names of 30 students ");
        for (int i = 0; i < 4; i++) { // For testing, using 4 instead of 30
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            sir.add(name);
        }

        // Display list of students
        System.out.println("\nThe list of students:");
        for (String name : sir) {
            System.out.println(name);
        }

        // Create a clone of the original list
        ArrayList<String> clonedSir = (ArrayList<String>) sir.clone();
        System.out.println("\nCloned list of students (unchanged):");
        for (String name : clonedSir) {
            System.out.println(name);
        }

        // Ask the user if they want to remove any names
        System.out.println("\nDo you want to remove any names? (yes/no)");
        String answer = scanner.nextLine().toLowerCase();

        while (answer.equals("yes")) {
            System.out.println("Enter the name you want to remove:");
            String removeName = scanner.nextLine();

            if (sir.remove(removeName)) {
                System.out.println(removeName + " has been removed from the list.");
            } else {
                System.out.println(removeName + " is not in the list.");
            }

            // Display the updated list
            System.out.println("\nUpdated list of students:");
            for (String name : sir) {
                System.out.println(name);
            }

            // Ask again if the user wants to remove more names
            System.out.println("\nDo you want to remove any more names? (yes/no)");
            answer = scanner.nextLine().toLowerCase();
        }

        // Display the cloned list after all operations to show it remains unchanged
        System.out.println("\nCloned list (original, unchanged):");
        for (String name : clonedSir) {
            System.out.println(name);
        }
    }
}
