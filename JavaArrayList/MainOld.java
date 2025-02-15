import java.util.ArrayList;

public class MainOld {
 public static void main (String[] args){
    
        ArrayList <String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");


       // cars.add(0,"GaJu's Car");
        
        cars.remove(3);
        System.out.println(cars);
        
     }
}