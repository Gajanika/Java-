public class oddeven {
    public static void main(String[] args) {
        int number = 7; 
        if (isEven(number)) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
