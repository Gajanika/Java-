

public class PrimeCheck {
   public static void main(String[] args) {
    primeno(10);
   }



   static void primeno(int n){
          int minDiv = 2;
          int maxDiv =(int) (Math.sqrt(n));
          boolean prime =true;
          while ( prime && maxDiv >= minDiv){
             if (n% minDiv ==0) prime =false;
              minDiv++;
          }
          if(prime){
            System.out.println("pn");}
            else {System.out.println("no");
            
            
          }
        
   }
}
