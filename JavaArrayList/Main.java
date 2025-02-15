import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        cars.remove(3); // Remove the 4th element (Mazda)

        // Print each element on a new line
        for (String car : cars) {
            System.out.println(car);
        }
    }

}
