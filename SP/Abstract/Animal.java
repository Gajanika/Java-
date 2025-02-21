public interface Animal {
    int i =10;
   public void animalSound(); // interface method (does not have a body)
   public void sleep(); // interface method (does not have a body)
 }
 
 class Pig implements Animal {
   public void animalSound() {
     System.out.println("The pig says: wee wee");
   }
   public void sleep() {
     System.out.println("Zzz");
   }
 }
 
 class Main {
   public static void main(String[] args) {
     Pig myPig = new Pig();
     myPig.animalSound();
     myPig.sleep();
     System.out.println("The value of i: " + Animal.i);
   }
 }

