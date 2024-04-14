package ArrayList;
// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {
    public static void main(String[] args) {

        // Creat
        String[] array = {"a","b","c","d"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList("chandu","abhijeet","golu"));

        // Get element
        System.out.println("First Element of Array: " + array[0]);
        System.out.println("First Element of ArrayList: " + list.get(0));

        // Get Size

        System.out.println("Size of Array is: " + array.length);
        System.out.println("Size of ArrayList is: " + list.size());

        //Add an Array
        // You can't do that with an Array because array is immutable , but you can do in ArrayList 
        
        list.add("e");
        System.out.println("But we can update ArrayList: " + list.get(3));

        //Set an element 
        array[0] = "f";
        System.out.println("First Element of Array after change: " + array[0]);
        list.set(1, "nandu");
        System.out.println("First element of ArrayList after change: " + list.get(1));

        // Remove an array
        System.out.println("Sorry we can't do this in array");
        list.remove("nandu");
        System.out.println("First element of ArrayList after remove is: " + list.get(0));


        // Print
        // Array will not give the proper value, that's why developer prefered arraylist
        System.out.println("Array is: " + array);
        System.out.println("ArrayList is: " + list);
        
        // Iterate all the elements of ArrayList

        // First way
        // list.forEach(System.out::println);

        // Second way
        // for (String element : list) {
        //     System.out.println(element);
        // }
    }
    
}
