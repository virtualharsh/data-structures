import java.util.Vector;

// Vector is thread-safe so it is slower than ArrayList

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        // adding elements in vector
        v.add(10);
        v.add(20);
        v.add(10);
        System.out.println(v);

        // printing the size
        System.out.println(v.size());

        // changing the elements
        v.set(2, 15);
        System.out.println(v);

        // iterating over the vector using for loop
        int l = v.size();
        for (int i = 0; i < l; i++)
            System.out.println(i + ":" + v.get(i));

        // iterating over vector using for each loop
        // Object class is super class of all the classes in java including the wrapper
        // classes so we can make a reference of object class to store any object of
        // class
        for (Object i : v)
            System.out.println(i);
    }
}
