import java.util.Scanner;

public class OddEvenCal {
  public static void main(String[] args) {
    Scanner scanne = new Scanner(System.in);
    System.out.print("Enter a number:");
    int n, m;
    n = scanne.nextInt();
    m = n % 2;
    if (m == 1) {
      System.out.println(n+ " This is an odd number");

    } else {
      System.out.println(n+ " This is even number");
    }
    scanne.close();
      
}
}