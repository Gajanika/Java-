import java.util.ArrayList;
import java.util.Scanner;

public class Remove{
public static void main(String[] args) {
    ArrayList<String> sir = new ArrayList<>();
      Scanner scanner = new Scanner (System.in);
       

      // Input 30 students names
      System.out.println("Enter the names of 30 students ");
      for (int  i = 0; i<4; i++){
        System.out.print("Enter  name"+ (i+1)+":");
        String name =  scanner.nextLine();
        sir.add(name);
      }



      // list of student
      System.out.println("\n The list of students");
      for (String name : sir){
        System.out.println(name);
      }


   // ask the user  if they want to remove any names?
     System.out.println("\n Do you want to remove any names?   ( yes/no)");
     String Answer = scanner.nextLine().toLowerCase();
      


      while( Answer.equals("yes")){
         System.out.println("Enter the name you want to remove");
            String RemovetheName = scanner.nextLine();

            if ( sir.remove(RemovetheName)){
              System.out.println(RemovetheName+"has been removed");
            }
            else{
              System.out.println(RemovetheName+"is not in the list");
            }
            System.out.println("\n updated list of student");
            for ( String name : sir){
 System.out.println(name);
            }
      }
}
}