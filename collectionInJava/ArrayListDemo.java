import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        // Declaring a ArrayList of Integer type ( we can do it of any wrapper class datatype)
        ArrayList<Integer> al = new ArrayList<>();   
        
        // getting initial size of list
        System.out.println(al.size());

        // adding elements 
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(20);

        // printing elements directly with size
        System.out.println(al.size());
        System.out.println(al);

        // changing elements
        al.set(1, 15);
        System.out.println(al);


        // iterating over list using for loop

        int l = al.size();
        for(int i=0 ; i< l ; i++){
            System.out.println(i + ":" + al.get(i));
        }

        // iterating over list using for each loop
        // Object class is super class of all the classes in java including the wrapper classes so we can make a reference of object class to store any object of class
        for(Object i : al){
            System.out.println(i);
        } 
    }
}
