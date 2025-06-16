import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                System.out.println("Found at index: " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found.");
        }
    }
}