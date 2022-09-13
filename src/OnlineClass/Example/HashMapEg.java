package OnlineClass.Example;
import java.util.*;

public class HashMapEg {
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        // Insertion
        map.put(1,"Vasu");
        map.put(2,"Rastogi");
        map.put(3,"20Bcs5135");
        map.put(4,"Java");

        System.out.println("Iterating Hashmap");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("Removing second key value");
        map.remove(2);
        System.out.println("Updated: "+map);

        map.replace(1, "VR");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }


}
