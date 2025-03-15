import java.util.Scanner;

public class Number{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
         double sum = 0;
         int count = 0;
         boolean Input = true;

    while (Input){
        System.out.print("Enter a number");
        double number = scanner.nextDouble();
        sum +=number;
        count++;

        System.out.println("Do you want to continue?    ignore case (Y/N): ");   

        char choice = scanner.next().charAt(0);
            
        if (choice == 'N'|| choice == 'n'){
            Input = false;
        }

    }


    while (true){
        System.out.println("\nlist");
        System.out.println("1.Sum");
        System.out.println("2.Average");
        System.out.println("3.Count");
        System.out.println("4.All");
        System.out.println("5.Exit");
        System.out.println("plesae enter");
        int list = scanner.nextInt();
         switch (list) {
            case 1:
            System.out.println("Sum"+sum);
            break;
            case 2:
            double ave =(count > 0) ? (sum/count):0;
            System.out.println("Average" + ave);
            break;
            case 3:
            System.out.println("Count" + count);
            break;
            case 4:
            System.out.println("Sum:" + sum);
            System.out.println("Averagr" + ((count>0)?(sum/count):0));
            System.out.println("Count" + count);
            break;
          default:
           System.out.println("Invalid");
           break;

         }
    }

    }
}