package OnlineClass.Example;

import java.util.LinkedList;
import java.util.List;

public class example2LL {
    public static void main(String[] args) {
        List<String> l1=new LinkedList<String>();

        // Insertion
        l1.add("Vasu");
        l1.add("Rastogi");
        l1.add("Hello");
        l1.add("World");

        // Display
        System.out.print("Original :");
        System.out.println(l1);

        // Delete
        l1.remove("Hello");
        System.out.print("Deleted Hello :");
        System.out.println(l1);
        l1.add(2, "Hello");

        // search
        System.out.print("Searching second index's element :");
        System.out.println(l1.get(2));

        // iterating
        for(String s : l1){
            if(s == "Hello") {
                System.out.print("searching for Hello by traversing :");
                System.out.println(s);
            }
        }

        // replace
        l1.set(0, "usav");
        System.out.print("replaced my name with reverse word :");
        System.out.println(l1);

    }
}
