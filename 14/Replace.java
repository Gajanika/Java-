import java.util.ArrayList;
import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        ArrayList<String> sir = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Input 30 student names
        System.out.println("Enter the names of 30 students:");
        for (int i = 0; i < 4; i++) { // For demonstration, using 4 instead of 30
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            sir.add(name);
        }
 
        // List of students
        System.out.println("\nThe list of students:");
        for (String name : sir) {
            System.out.println(name);
        }

        // Ask the user if they want to replace any names
        System.out.println("\nDo you want to replace any names? (yes/no)");
        String answer = scanner.nextLine().toLowerCase();

        while (answer.equals("yes")) {
            System.out.println("Enter the name you want to replace:");
            String oldName = scanner.nextLine();

            if (sir.contains(oldName)) {
                System.out.println("Enter the new name:");
                String newName = scanner.nextLine();

                // Replace the old name with the new name
                int index = sir.indexOf(oldName);
                sir.set(index, newName);

                System.out.println(oldName + " has been replaced with " + newName);
            } else {
                System.out.println(oldName + " is not in the list.");
            }

            // Display updated list
            System.out.println("\nUpdated list of students:");
            for (String name : sir) {
                System.out.println(name);
            }

            // Ask again if the user wants to replace more names
            System.out.println("\nDo you want to replace another name? (yes/no)");
            answer = scanner.nextLine().toLowerCase();
        }

        System.out.println("\nFinal list of students:");
        for (String name : sir) {
            System.out.println(name);
        }

        scanner.close();
    }
}
