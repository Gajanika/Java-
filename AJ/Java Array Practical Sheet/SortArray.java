import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = { 23, 10, 15, 5, 30 };
        Arrays.sort(arr);
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
