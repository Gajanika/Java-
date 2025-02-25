public class Mainclass {
     public static void main (String[] args){
        // create an Employee class object 
        Employee obj = new Employee ();
        obj.setName("Gajanika");
        obj.setId(1123);
        obj.setSal(300000);
        System.out.println("Name "+obj.getName());
        System.out.println("ID "+obj.getId());
        System.out.println("Salary "+obj.getSal());

     }
}
