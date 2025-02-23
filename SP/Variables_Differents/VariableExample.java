public class VariableExample {

    
    int instanceVar = 10;

    
    static int staticVar = 20;

    public void demonstrateVariables() {
        
        int localVar = 30;

                                            //local   -    Declare Start  //instant   - object craete //static - programme start
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
       
        VariableExample obj1 = new VariableExample();
        VariableExample obj2 = new VariableExample();

        
        System.out.println("Using obj1:");
        obj1.demonstrateVariables();

        
        obj1.instanceVar = 50;
        staticVar = 100; 

       
        System.out.println("\nUsing obj2:");
        obj2.demonstrateVariables(); 
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
