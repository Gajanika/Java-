abstract class Second {
    public abstract void Data();
}
    class Fullname extends Second{
        public String Fname ="Thenuka";
        public String Lname ="Logeswaran";        //sub class

        public void Data(){
            System.out.println("Full Name:"+" "+Fname+" "+Lname);
        }
        }

class second{
    public static void main (String[]args){
        Fullname myobj = new Fullname();
         System.out.println("Firstname:"+myobj.Fname);
         System.out.println("Lastname:"+myobj.Lname);
         myobj.Data();
    }
}