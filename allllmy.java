import java.util.Scanner;

class allllmy {


      public void calling(){
        System.out.println("Are you want calculate Circle or Triangle or Rectangle area?");


 

      }

 public void Inall(double length, double width) {

        double A = 0;

        A = length * width;
        System.out.println("This is Area of Rectangle " + A);

    } //Rectangle


//Triangle
    public void triangle(double half,double  base ,double height){
        double A =0;
        A = half*base*height;
        System.out.println("This is Area of Triangle " +A);
    }



    //circle
    public void circle(double radius ){
            double A=0;
            A = Math.PI * radius * radius;
            System.out.println("This is Area of Circle"+A);
   
    }
    

    public static void main(String[] args) {

           



        double length,width;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle");
        length=scanner.nextDouble();

        System.out.println("Enter the width of Rectangle");
        width=scanner.nextDouble();
        allllmy ooo = new allllmy();
        ooo.Inall(length,width);//Rectangle



        double half,base,height;
        Scanner scanner2 =new Scanner (System.in);
        System.out.println("Enter the half of Traingle");
        half=scanner2.nextDouble();

        System.out.println("Enter the base of Traingle");
        base=scanner2.nextDouble();
        System.out.println("Enter the height of Traingle");
        height=scanner2.nextDouble();
        ooo.triangle(half,base,height);//traingle


        double radius;
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius=scanner3.nextDouble();
        ooo.circle(radius);//circle
        }






}
