import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}