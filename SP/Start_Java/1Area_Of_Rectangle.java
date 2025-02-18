public class RecCal {

    public void   Area() {     // method
        int H = 8;
        int W = 9;
        int A = H * W;         // atribute
        System.out.println("area is " + A);

    }

    public static void main(String[] args ) {
        RecCal re = new RecCal();                   // create object
        re.Area();
    }

}
