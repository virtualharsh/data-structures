import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(79,"Harsh");
        hm.put(38,"Jay");
        hm.put(6, "kuldeep");
        
        
        System.out.println(hm.get(79));
        hm.replace(79, "sonegra");
        System.out.println(hm.get(79));

        for(Object i : hm.keySet()){
            System.out.println("key : "+i + " value : " + hm.get(i) );
        }
    }
}
