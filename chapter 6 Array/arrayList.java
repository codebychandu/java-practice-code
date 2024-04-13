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
        System.out.println(array.length);
        System.out.println(list.size());

        //Add an Array
        // You can't do that with an Array because array is immutable , but you can do in ArrayList    
        list.add("e");
        System.out.println(list.get(3));
        
    }
    
}
