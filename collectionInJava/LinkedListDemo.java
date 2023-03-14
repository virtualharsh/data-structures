import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<Integer>();

        // adding elements in list
        li.add(10);
        li.add(20);
        li.add(10);
        System.out.println(li);

        // printing the size
        System.out.println(li.size());

        // changing the elements
        li.set(2,15);
        System.out.println(li);

        // iterating over the list using for loop
        int l = li.size();
        for(int i=0 ; i<l ; i++)
            System.out.println(i + ":" + li.get(i));
        
        // iterating over list using for each loop
        // Object class is super class of all the classes in java including the wrapper classes so we can make a reference of object class to store any object of class
        for(Object i : li)
            System.out.println(i);
    }
}
