public class OddEvenstatic {
    public static void main(String[] args) {
        int number = 7; 
        checkOddEven(number);
    }

    
    public static void checkOddEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}
