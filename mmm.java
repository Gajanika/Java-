import java.util.Scanner;

public class mmm {
    public mmm(){

    }
    public static void main(String[] args){
        Scanner jeni = new Scanner(System.in);
        
        int marks;
        char choice;
        do{
          System.out.println("Enter the Marks");
       
          marks=jeni.nextInt();
          if(marks>=75){
            System.out.println("you got A");
          }
          else if(marks>=65){
            System.out.println("you got B");
          }
          else if(marks>=55){
            System.out.println("you got C");
          }
          else if(marks>=35){
            System.out.println("you got S");
          }
          
          else{
            System.out.println(" you got F");
          }
          System.out.println("Do you want to enter another mark? (y/n)");
          choice = jeni.next().charAt(0);
        } while (choice == 'y'|| choice == 'Y');
          jeni.close();
    }

}

