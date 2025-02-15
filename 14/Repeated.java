import java.util.ArrayList;

public class Repeated {
    public static void  main (String [] args){
        ArrayList <String> names  = new ArrayList<>();
        names.add("Alice");
        names.add("Alic");
        names.add("Ali");
        names.add("Alicehhhh");
        names.add("Ali");
        names.add("Alicerrr");
        names.add("Alicehhhh");
        System.out.println("Repeated names and their counts");


        for (int i=0; i< names.size(); i++){
            String name = names.get(i);
            int count = 0;

            for (int j = 0; j< names.size(); j++){
                if(names.get(j).equals(name)){
                count++;
            }
        }
            if ( count >1){
                 System.out.println(name + " - "+count + " times");
                 while(names.remove(name)) {}
                    
                 }
            }

    }

}