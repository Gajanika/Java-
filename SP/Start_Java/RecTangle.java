import java.util.Scanner;

class Areacal {

    public  void pqr( int w, int l){
            int A = 0;
            A = w * l;
            System.out.println("Area of rectangle "+ A);
    }


public static void main (String[] args){
    int x,y;
    Scanner sner =new Scanner(System.in);
    System.out.println("Enter the width");
    
    x =sner.nextInt();
    System.out.println("Enter the length");
    y=sner.nextInt();
    // System.out.println("");
Areacal area = new Areacal();
area.pqr(x, y);
sner.close();
    //Areacal y = new Areacal();
  // y.pqr(10, 4);
}

}
