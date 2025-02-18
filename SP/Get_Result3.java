import java.util.Scanner;

public class rewrite {
    public rewrite() {

    }

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int marks;
        char choice;
        do {
            System.out.println("Enter the marks");
            marks = scann.nextInt();
            if (marks >= 75) {
                System.out.println("you got A");
            } else if (marks >= 65) {
                System.out.println("you got B");
            } else if (marks >= 55) {
                System.out.println("you got C");
            } else if (marks >= 35) {
                System.out.println("you got S");

            } else {
                System.out.println("you got F");
            }
            System.out.println("Do you want to enter another marks?");
            choice = scann.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');
        scann.close();
    }
}
