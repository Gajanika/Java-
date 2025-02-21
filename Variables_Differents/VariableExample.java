public class VariableExample {

    // Instance variable: Declared at the class level and not static
    int instanceVar = 10;

    // Static variable: Declared at the class level with 'static' keyword
    static int staticVar = 20;

    public void demonstrateVariables() {
        // Local variable: Declared inside a method
        int localVar = 30;

        // Accessing all three types of variables
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        // Create an object of the class to access instance variables
        VariableExample obj1 = new VariableExample();
        VariableExample obj2 = new VariableExample();

        // Accessing and demonstrating variables using the first object
        System.out.println("Using obj1:");
        obj1.demonstrateVariables();

        // Modifying instance and static variables using the first object
        obj1.instanceVar = 50;
        staticVar = 100; // Static variable can be modified directly without an object

        // Accessing and demonstrating variables using the second object
        System.out.println("\nUsing obj2:");
        obj2.demonstrateVariables(); // Instance variable change won't reflect, but static variable change will
    }
}


// Using obj1:
// Local Variable: 30
// Instance Variable: 10
// Static Variable: 20

// Using obj2:
// Local Variable: 30
// Instance Variable: 10
// Static Variable: 100
