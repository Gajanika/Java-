abstract class C2{
    
    public abstract void Data();

    }
class Fullname extends C2{
    public String Fname = "Gaju";
    public String Lname= "ga";
     public void Data(){
        System.out.println("FullName:"+ Fname + Lname);
     }

    
}
class second {
    public static void main(String[] args) {
        Fullname myobj= new Fullname();
        System.out.println("First Name:"+ myobj.Fname );
        System.out.println("Last Name:"+ myobj.Lname );
           myobj.Data();
    }
}


