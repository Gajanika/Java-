import java.util.ArrayList;
import java.util.Scanner;

public class sir {
    public static void main(String[] args) {
        ArrayList<String> cla = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Input 30 student names
        System.out.println("Enter the names of 30 students:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            cla.add(name);
        }

        // Display all names
        System.out.println("\nThe list of students:");
        for (String name : cla) {
            System.out.println(name);
        }

        // Ask user if they want to remove any names
        System.out.println("\nDo you want to remove any names? (yes/no): ");
        String response = scanner.nextLine().toLowerCase();

        while (response.equals("yes")) {
            System.out.println("Enter the name you want to remove:");
            String nameToRemove = scanner.nextLine();

            if (cla.remove(nameToRemove)) {
                System.out.println(nameToRemove + " has been removed.");
            } else {
                System.out.println(nameToRemove + " is not in the list.");
            }

            // Display updated list
            System.out.println("\nUpdated list of students:");
            for (String name : cla) {
                System.out.println(name);
            }

            // Ask again if user wants to remove more names
            System.out.println("\nDo you want to remove another name? (yes/no): ");
            response = scanner.nextLine().toLowerCase();
        }

        System.out.println("\nFinal list of students:");
        for (String name : cla) {
            System.out.println(name);
        }

        scanner.close(); // Close the scanner
         
    }
}
