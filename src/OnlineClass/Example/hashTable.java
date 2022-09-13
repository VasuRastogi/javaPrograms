package OnlineClass.Example;

import java.util.*;

public class hashTable {
    public static void main(String[] args) {

        Hashtable<Integer, String> ht = new Hashtable<>();

        // insertion
        ht.put(1, "Vasu");
        ht.put(2, "Rastogi");
        ht.put(3, "Class");
        ht.put(4, "20bcs5135");
        ht.put(5, "Java_HashTable");

        Enumeration<Integer> e = ht.keys();

        // displaying
        while (e.hasMoreElements()) {
            int key = e.nextElement();

            System.out.println("Rank : " + key + "   Name : " + ht.get(key));
        }

        // remove
        ht.remove(1);
        System.out.println(ht);
    }
}
