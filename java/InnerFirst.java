abstract class First{
    public abstract void Data();
}
class Fullname extends First{
    public String Fname = "Gaja";          
   public String Lname = "Ganes";
    
   public void Data(){
     System.out.println("Fullname"+" "+Fname+ " "+ Lname);
   }
}
class Second{
    public static void main (String [] args){
        Fullname myobj=new Fullname();
        System.out.println("Firstname:"+myobj.Fname);
        System.out.println("Lastname:"+myobj.Lname);
        myobj.Data();
    }
}