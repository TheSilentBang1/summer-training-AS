import java.util.*;
public class arrayList {
    public static void main(String [] args){
        //syntax to declare
        ArrayList<Integer> arr = new ArrayList<>();
        //adding an element
        
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        //accessing element at index using get
        System.out.println(arr.get(0));
        //removing an element at index using remove, it returns removed element
        // arr.remove(0);
        // System.out.println(arr);

        //updating an element using set, returns the old value that is updated
        arr.set(0, 10); 

        System.out.println(arr);

                

    }
    
}
