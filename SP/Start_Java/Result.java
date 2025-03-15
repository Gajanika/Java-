import java.util.Scanner;


public class Result {
    public void Result1(){

    }
    public static void main(String[] args){
        Scanner jeni = new Scanner(System.in);
        System.out.println("Enter a Marks");
        int marks;
        marks = jeni.nextInt();
        if(marks>=75){

            System.out.println("  you got A");

        }
        else if(marks>=65){
            System.out.println(" you got B");

        }
        else if (marks>=50){
            System.out.println(" you got C");

        }
        else {
            System.out.println("Fail");
        }
     jeni.close();
}
}
