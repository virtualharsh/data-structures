import java.util.TreeMap;

public class TreeMapDemo {
    
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(79, "Harsh");
        tm.put(38, "Jay");
        tm.put(6, "kuldeep");

        System.out.println(tm.get(79));
        tm.replace(79, "sonegra");
        System.out.println(tm.get(79));

        for (Object i : tm.keySet()) {
            System.out.println("key : " + i + " value : " + tm.get(i));
        }
    }

}
