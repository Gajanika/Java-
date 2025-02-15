import java.util.ArrayList;

public class dupli {
    public static void main(String[] args) {
        ArrayList<String> original = new ArrayList<>();
        original.add("ssda");
        original.add("lll");
        original.add("dfff");
        original.add("S");
        original.add("AA");
        ArrayList<String> duooo = new ArrayList<>(original);
        System.out.println("Original:" + original);
        System.out.println("Duplicate:" + duooo);

    }

}
